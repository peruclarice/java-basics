// Creating the TryingMethods class
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
