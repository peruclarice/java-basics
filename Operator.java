public class Operator {
    public static void main(String[] args) {
        double valueA = 10;
        int valueB = 7;
        //final int valueB = 20; // By adding final, valueB can't be changed

        /*
         * valueB = 2; // This change is impossible the valueB;
         */
        valueB += 33; // valueB = valueB + 33

        // System.out.println(valueA + " + " + valueB);
        // System.out.println(valueA - valueB);
        // System.out.println(valueA == valueB);
        // System.out.println(valueA!= valueB);
        // System.out.println(valueA > valueB);

        // If loops
        if (valueB == valueA) {
            System.out.println(valueA);
        } else if(valueA != valueB) {
            System.out.println(valueB);
        }else {
            System.out.println(valueA);
        }

        if(valueB >= valueA && valueB <= valueA) {
            System.out.println("This statement True");
        }else {
            System.out.println ("Fun, right");
        }

        //if shorthand ternary operator
        String answer =  (valueB >= valueA) ? "valueC is greater" : "valuec Sucks";
        double valueC = (valueB <= valueA) ? valueA : valueB;
        System.out.println(answer);
        System.out.println(valueC);

        int dayOfTheWeek = 6;
        String nameOfDay = "";
        switch (dayOfTheWeek){
            case 1:
                nameOfDay = "Mon";
                break;
            case 3:
                nameOfDay = "Friyay!";
                break;
            default:
                nameOfDay = "Wednesday";
                break;
        }
        System.out.println(nameOfDay);
        // System.out.println(otherLoopStatements());
        otherLoopStatements();

    }

    public static void otherLoopStatements(){
        int johnAge = 22;
        int peruAge = 20;

        int clariceAge = peruAge += 6;
        // return clariceAge;

        while (johnAge <= clariceAge){
            // System.out.println(clariceAge);
            // return clariceAge;
            System.out.println("Clarice is better than John Always!");
            johnAge++;
        }

        do{
            System.out.println("Bitch! You thought..... you're still not better than me, Bitch!");
            johnAge++;
        } while(johnAge <= clariceAge);

    }
}
