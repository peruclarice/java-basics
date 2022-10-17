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
    public String firstChild(int day){
        String nameOfDay = "";
        switch (day){
            case 1:
                nameOfDay = "Mon";
                break;
            case 2:
                nameOfDay = "Tue";
                break;
            case 3:
                nameOfDay = "Wed";
                break;
            case 4:
                nameOfDay = "Thur";
                break;
            case 5:
                nameOfDay = "Fri";
                break;
            case 6:
                nameOfDay = "Sat";
                break;
            case 7:
                nameOfDay = "Sun";
                break;
            default:
                nameOfDay = "John is the best";
                break;
        }
        return nameOfDay;

    }

    // Dynamic Method 2
    public void gradingSystem(int grade){
        int topGrade = 4;
        int middleGrade = 3;
        int lowGrade = 2;

        if (grade >= topGrade ){
            System.out.println("Exceeded Expectations");
        } else if( grade == middleGrade ) {
            System.out.println("Met Expectations");
        }
        else if( grade >= lowGrade ) {
            System.out.println("Below Expectations");
        }
        else {
            System.out.println("Please see me");
        }
    }

    // Static Method 1
    public static int addingTwo(){
        int sum= 0;
        int i = 1;
        while (i<=1000) {
            sum+=i;
            i++;
        }
        return sum;
    }

    // Static Method 2
    public static void staticSecondChild(){
        int summOfEvenNumbers = 0;
        
        for (int i = 12; i < 103; i++){
            if (i % 2 == 0){
                summOfEvenNumbers += i;
            }
            System.out.println(summOfEvenNumbers);
        }
    }
    
    public static void main(String[] args){

        // Calling dynamic method 1
        TryingMethods newObject = new TryingMethods();
        System.out.println(newObject.firstChild(5));

        // calling dynamic method 2
        TryingMethods secondObject = new TryingMethods();
        secondObject.gradingSystem(2);

        // System.out.println(addingOneThousand());

        // Calling static method 2
        staticSecondChild();

        // Calling static method 1
        System.out.println(addingTwo());

    }
}
