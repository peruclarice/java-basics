public class Family implements FamilyType {

    int familyNumber;

    public Family(int familyNumber){
        this.familyNumber = familyNumber;
    }

    @Override
    public void familyName() {
        System.out.println("The Samson Kibii Family");
    }

    @Override
    public int familyNumber() {
        // TODO Auto-generated method stub
        return 6;
    }
    
    public static void main(String[] args) {
        
        Family familyObj = new Family(6);

        familyObj.familyName();
        familyObj.familyNumber();

    }
}
