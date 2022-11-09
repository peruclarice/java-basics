/**
 * Created to handle all momo payments
 */
public class Payment {

    // Number to process payment
    private String phoneNumber;
    // Payment network
    private String network;
    // Amount to pay
    private double amount;
    // Currency of the payment
    private String currency;

    /**
     * Initial constructor Payment() for the payment class
     * @param phoneNumber phone number for amount
     * @param network payment network
     * @param amount the amount in double to pay for
     * @param currency the currency for payment
     */
    public Payment(String phoneNumber, String network, double amount, String currency){
        this.amount = amount;
        this.network = network;
        this.currency = currency;
        this.phoneNumber = formatPhoneNumber(phoneNumber);
    }

    /**
     * 
     * @param number that is private and used to format the phone number to start with +233 and remove the first 0
     * @return
     */
    private String formatPhoneNumber(String number){
        if (number.startsWith("0") && number.length() == 10){
            return "+233" + number.substring(1,10);
        }
        return number;
    }

    /**
     * 
     * @return string of the payment number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    enum network{
        MTN,
        Vodafone,
        Airtel
    }

    // This is encapsulation, which is exposing a variable that is private to be manipulated using the instance of an object
    public void setAmount(double amount) {
        this.amount = amount;
    }


}
