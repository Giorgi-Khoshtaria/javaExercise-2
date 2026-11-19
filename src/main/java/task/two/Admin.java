package task.two;

public class Admin extends User {


  void deleteUser(String username) {
    if (username != null && !username.isEmpty()) {
      System.out.println("User deleted: " + username);
    } else {
      System.out.println("Invalid username");
    }
  }
}


