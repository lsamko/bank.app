package bankAccountApp;

public abstract class Account implements IBaseRate {
    //List common properties for saving and checking accounts
    String name;
    String secNumber;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;

    //Constructor to set base properties and initialize an account
    public Account(String name, String secNumber, double initDeposit) {
        this.name = name;
        this.secNumber = secNumber;
        balance = initDeposit;

        //Set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public  abstract  void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = secNumber.substring(secNumber.length() - 2, secNumber.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // List common methods
    public void showInfo(){
        System.out.println(
                "Name: " + name +
                        "\nAccount number: " + accountNumber +
                        "\nBalance: " + balance +
                        "\nRate: " +rate + "%"
        );
    }
}
