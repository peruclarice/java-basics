public class App {
    
    public static void main( String[] args){
        Dog bruce = new Dog("John", 23);
        bruce.run();
        Dog.bark();

        Dog nameNew = new Dog("Peru");
        System.out.println(nameNew.getName("Clarice"));
    }
}
