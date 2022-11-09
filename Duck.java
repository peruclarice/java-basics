public class Duck extends AnimalAbstract {
    
    @Override
    public void makeSound() {
        System.out.println("Quack, Quack");
    }

    @Override
    public void eat() {
        System.out.println("Eats Bread");
    }

    public static void main(String[] args) {
        
        Duck duck = new Duck();
        duck.makeSound();
        duck.eat();

    }
}