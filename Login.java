public class Login {
    
    String admin = "";
    boolean isAdmin = true;
    String userAdmin = "";

    // Permissions userAdmin(String type, String type, String type) = new Permissions();

    public void loginAdmin(){

        if (userAdmin == isAdmin){
            System.out.println("You are logged into the system");
        }
        else {
            System.out.println("You are not an Admin");
        }
    }

    public static void main(String[] args) {
        Permissions userAdmin = new Permissions("John", "john@admin.com", "isutsah123");
    }
}

