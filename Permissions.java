public class Permissions {
    String userName = "";
    String password ="";
    String email= "";

    // Admin Permissions
    Permissions(String userName, String email, String password){
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    // User Permissions
    Permissions(String userName, String email){
        this.userName = userName;
        this.email = email;
    }

}
