package task.two;

public class Main {
  static void main() {
    Admin admin = new Admin();
    String username = "giorgi";
    String email = "giorgi@gmail.com";
    admin.username = username;
    admin.email = email;

    admin.displayUserInfo();
    admin.deleteUser(username);

  }
}
