package main;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class Main {
	  public static void main(String []args) throws Exception {
		    ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml", Main.class);
		    DataSource dataSource = (DataSource) ac.getBean("dataSource");
		    // DataSource mysqlDataSource = (DataSource) ac.getBean("mysqlDataSource");

		    Customer customer = new Customer();
		    customer.setId(3L);
		    customer.setFirstName("Adeayo");
		    customer.setLastName("Salami");
		    customer.setLastLogin(new Date());
		    customer.setComments("Movie Actor");
		    customer.setComments("55");

		    long id = new SimpleJdbcInsert(dataSource).
		    withTableName("customer").
		    usingColumns("first_name", "last_name", "last_login", "comments","").
		    usingGeneratedKeyColumns("i	d").
		    executeAndReturnKey(new BeanPropertySqlParameterSource(customer)).longValue();
		    System.out.println(id);
		  }
		}