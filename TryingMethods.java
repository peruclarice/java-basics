// This is the class TryingMethods

// Create a class with the name "TryingMethods"
// Add comments to describe what this class does

// Add the a main method to this class

// Add at least four methods in this class

// Two of the method should be dynamic and the other two static

// One of the dynamic methods should have an integer as an argument.
// It return a string of the day of the week based on the argument that
// was provided. Use a switch case in the body of the method.
// The second dynamic method should return nothing but just print a
// message to the console using an if statement with at least 3 blocks.
// The conditions of the statement should be based on the argument or
// parameter(s) of the method.

// In one of the static methods use a while loop to find the sum of all
// numbers less than 1000 and return the result.

// Lastly, in the last method use a for loop to find the sum of even
// numbers between 12 and 103.

// ...

// Push your codes to github with at least 5 commits. Ensure to use at
// least 5 branches to manage your code.

// Find someone, who you will collaborate with. The collaborator will be
// the one to accept the PRs you raise.

// Thank you and happy coding.

public class TryingMethods {

    // Dynamic Method 1
    public int firstChild(int dayOfTheWeek){
        dayOfTheWeek = 3;
        String nameOfTheWeek = "";
        // String y = String.valueOf(dayOfTheWeek);
        return dayOfTheWeek;

    }

    // Dynamic Method 2
    public void secondChild(String bestArtist){
        int westAfricanArtis = 3;
        int eastAfricaArtist = 4;
        // String bestArtists = "";

        // If statement
        if (westAfricanArtis >= eastAfricaArtist ){
            System.out.println("The best artist is Tiwa Savage");
        }
        else if (westAfricanArtis <= eastAfricaArtist){
            System.out.println("The best artist is Sauti Sol");
        } 
        else{
            System.out.println("The best artist is still Sauti Sol");
        }

        System.out.println("Im yours");
    }

    // Static Method 1
    public static int staticFirstChild(int sumNumbers){

        // Creating a while loop that prints the numbers until it reaches 1000
        while (sumNumbers < 1000){
            System.out.println(sumNumbers);
            sumNumbers++;
        }
        return sumNumbers;
    }

    // Static Method 2
    public static void staticSecondChild(){
        System.out.println("Im yours");
        // int i = 0;
        
        for (int i = 12; i < 103; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args){
        
        staticSecondChild();
        staticFirstChild(700);
    }
}
