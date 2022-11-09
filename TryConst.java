public class TryConst {
    String userName = "";
    int age;

    // Can only be accessed in this class
    private String userPassword;

    // This constructor doesn't take any arguments
    // NB! Not adviceable
    public TryConst(){}

    public TryConst(String userName){
        this.userName = userName;
    }

    public TryConst(String userName, int age){
        this.userName = userName;

        // This is the same as this.userName = userName
        // new TryConst(userName);

        this.age = age;
    }

    public TryConst(String userName, String userPassword){
        new TryConst(userName);
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        // System.out.println(userPassword);
        if (userPassword.isEmpty()){
            this.userPassword = userPassword;
            System.out.println("The old userpassword is: " + userPassword);
        }
        else {
            System.out.println("The new userpassword is: " + userPassword);
        }
        
    }
    
    public static void main(String[] args) {

        TryConst tryConst = new TryConst();

        TryConst tryConstUsername = new TryConst("Clarice");
        // System.out.println(tryConstUsername.userName);

        TryConst tryConstBothUsernameAge = new TryConst("Clarice",26);
        // System.out.println(tryConstBothUsernameAge.age);

        TryConst userPassword = new TryConst("Clarice Me", "old_password123!");
        System.out.println("The old password is: " + userPassword.getUserPassword());
        userPassword.setUserPassword("newMomoPassword12!3");
        // setUserPassword("Peru_123!");

        Payment payment = new Payment("0714739030", "Safaricom", 1000.23, "KES");
        System.out.println(payment.getPhoneNumber());
    }
}