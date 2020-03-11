package bankAccountApp;

public class Checking extends Account {

    //List the properties specific to the Check account
    int debitCardNumber;
    int debitCardPin;

    //Constructor to initialize Check acc properties
    public Checking(String name, String secNumber, double initDeposit) {
        super(name, secNumber, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }
    @Override
    public  void  setRate(){
        rate = getBaseRate() * .15;
    }

    //List any methods specific to the Check acc
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));

    }

    public  void  showInfo(){
        System.out.println("Account type is: Checking");
        super.showInfo();
        System.out.println("Your checking account features " +
                "\nDebit card number: " + debitCardNumber +
                "\nDebit card pin: " + debitCardPin
        );
    }


}
