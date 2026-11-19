package org.example;

public class User {

  private String username;
  private String password;
  private int age;

  public void setAge(int age) {
    this.age = age;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  boolean validateUser() {

    if (username != null && !username.isEmpty()
            && password != null && password.length() >= 8
            && age >= 18) {

      System.out.println("User validation passed");
      return true;
    }
    System.out.println("User validation failed");
    return false;


  }
}
