package three;

public class Admin extends User implements Access {
  void displayRole() {
    System.out.println("Role: Admin");
  }

  public void checkAccess() {
    System.out.println("Access granted");
  }


}
