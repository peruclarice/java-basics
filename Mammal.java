public class Mammal {
    private int numberOfEyes;
    private int numberOfLegs;

    public Mammal(int numberOfEyes , int numberOfLegs){
        this.numberOfEyes = numberOfEyes;
        this.numberOfLegs = numberOfLegs;
    }

    public void closeEye(){
        System.out.println("Eyes are closed");
    }

    public static void main(String[] args){

        Mammal mammalType = new Mammal(2, 4);
        Cattle cattle = new Cattle(2, 4);
        Ostrich ostrich = new Ostrich(2,2);

        cattle.animalSound();
        cattle.closeEye();
        ostrich.animalSound();
        mammalType.closeEye();
        ostrich.closeEye();

    }

}
