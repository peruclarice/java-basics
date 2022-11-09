public class Cattle extends Mammal {
    
    public Cattle(int numberOfEyes, int numberOfLegs){
        super(numberOfEyes,numberOfLegs);
    }

    public void animalSound(){
        System.out.println("Moooooooo");
    }

    @Override
    public void closeEye() {
        System.out.println("Eyes are open \n");
    }

}
