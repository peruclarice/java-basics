public class Dog {
    
    String name = "";
    int age = 0;

    // Constructors in java have the same name as the class, these are the instructions required for the class
    Dog(String name){
        this.name = name;
    }

    // Overloading another constructor based on the diff parameters/args passed
    Dog (String name, int age){
        this.name = name;
        this.age = age;
    }

    static void bark(){
        System.out.println("Barking");
    }

    void run(){
        System.out.println("Running");
    }

    String getName(String type){
        return type + " " + this.name;
    }

    String getName(String type, String breed){
        return type + breed + this.name;
    }

    int getAge(){
        return age;
    }

}
