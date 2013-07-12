

	import java.util.List;

import org.springframework.dao.DataAccessException;
	import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

	public class Main {
	  public static void main(String args[]) throws Exception {
	   SingleConnectionDataSource ds = new SingleConnectionDataSource();
	   
	   
	    //  ds.setDriverClassName("org.hsqldb.jdbcDriver");
	   // ds.setUrl("jdbc:hsqldb:data/tutorial");
	  // ds.setUsername("sa");
	 // ds.setPassword("");
	    
	     ds.setDriverClassName("com.mysql.jdbc.Driver");
	     ds.setUrl("jdbc:mysql://localhost:3306/test");
	     ds.setUsername("root");
	    ds.setPassword("root");
	    
	    // ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	    // ds.setUrl("jdbc:oracle:thin:@spring:1521:my10g");
	    // ds.setUsername("spring");
	    // ds.setPassword("password");
	    
	    JdbcTemplate jt = new JdbcTemplate(ds);
	    try {
			jt.execute("create table employee (id int, name varchar)");
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    jt.execute("insert into employee (id, name) values (1, 'A')");
	    jt.execute("insert into employee (id, name) values (2, 'B')");
	    jt.execute("insert into employee (id, name) values (3, 'C')");
	    jt.execute("insert into employee (id, name) values (4, 'D')");
	    jt.execute("insert into employee (id, name) values (5, 'E')");
	    jt.execute("insert into employee (id, name) values (6, 'F')");    
	    
	    
	    Object[] parameters = new Object[] {new Integer(1)};
	    List l = jt.queryForList("select id, name from employee where id > ?",
	        parameters);
	    System.out.println(l.size());
	    System.out.println(l.get(0));
	    System.out.println(l.get(0).getClass());
	    

	    ds.destroy();
	  }
	}
