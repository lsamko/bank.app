package bankAccountApp;

public class Savings extends Account {
    //List properties specific to the Savings acc
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    //Constructor to initialize settings for the Savings properties
    public Savings(String name, String secNumber, double initDeposit) {
        super(name, secNumber, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxKey =(int) (Math.random() * Math.pow(10,4));
    }

    //List any methods specific to Savings account
    public void showInfo() {
        System.out.println("Account type is: Savings");
        super.showInfo();

        System.out.println("Your savings account features " +
                "\nSafety deposit box ID: " + safetyDepositBoxID +
                "\nSafety deposit box Key: " + safetyDepositBoxKey
        );
    }
}
