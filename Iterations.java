public class Iterations {

    public static void main(String[] args){

        // for (int myName = 0; myName < 4; myName++){
        //     System.out.println(myName);
        // }
        for (int i = 0; i<20; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
            // System.out.println(i);
        }
        System.out.println(MyThirdMethod());

    }

    static void myFirstMethod(){
            
    }
    void mySecondMethod (){

    }
    static String MyThirdMethod(){
        return "John Moans!";
    }
}
