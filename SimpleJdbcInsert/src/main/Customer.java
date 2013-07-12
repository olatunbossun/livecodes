package main;

import java.util.Date;



public class Customer {
  private Long id;

  private String firstName;

  private String lastName;

  private Date lastLogin;
  
  private int age ;

  private String comments;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(Date lastLogin) {
    this.lastLogin = lastLogin;
  }
  public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("Customer");
    sb.append("{id=").append(id);
    sb.append(", firstName='").append(firstName).append('\'');
    sb.append(", lastName='").append(lastName).append('\'');
    sb.append(", lastLogin=").append(lastLogin);
    sb.append(", comments='").append(comments).append('\'');
    sb.append(", age='").append(age).append('\'');
    sb.append('}');
    return sb.toString();
  }
}