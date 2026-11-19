package org.example;

public class Main {
  static void main() {
    User user1 = new User();
    user1.setAge(15);
    user1.setPassword("1111");
    user1.setUsername("giorgi");
    user1.validateUser();


    User user2 = new User();
    user2.setUsername("giorgi");
    user2.setPassword("123456789");
    user2.setAge(24);
    user2.validateUser();


  }
}
