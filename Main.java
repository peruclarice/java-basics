public class Main {
    public static void main(String[] args){

        // Runnig the Second class on method two() 
        Second.two();

        // System.out.println("Hello World");

        // Wide casting
        int examScore = 600;
        double examDoubleScore = examScore;

        int myFirstScore = 30;
        double myExamDoubleScore = myFirstScore;
        int myIntExamScore =  (int) myExamDoubleScore; // Narrow casting
        String myExamStringExample = String.valueOf(myFirstScore);

        // float floatNumber = 12.5f;
        // double doubleNumber = 10.8694366;
        // boolean hasPasses = false;
        // String kojoName = null;

        // System.out.println("Hello world!" + examScore + hasPasses);
        // System.out.println(floatNumber + doubleNumber);

        // This does the same thing
        System.out.println(examDoubleScore);
        // System.out.println(String.valueOf(examDoubleScore));

        System.out.println("integer value " + myIntExamScore);
        System.out.println("This is narrow casted from int to string " + myExamStringExample);
    }
}