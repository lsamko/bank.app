package bankAccountApp;

public class BankAccountApp {
    public static void main(String[] args) {
        Checking acc1 = new Checking("Tom Wilson", "212152152", 1500);
        Savings sav1 = new Savings("Rich Lowe", "112122", 2500);

        acc1.showInfo();
        System.out.println("*********************");
        sav1.showInfo();
        //Read a CSV file then create new accounts based on that data

    }
}
