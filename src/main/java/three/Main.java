package three;

public class Main {
  static void main() {
    Admin admin = new Admin();
    admin.username = "giorgi";
    admin.checkAccess();
    admin.displayRole();
  }
}
