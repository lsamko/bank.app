package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();


        //Read a CSV file then create new accounts based on that data
        String file = "src\\utilities\\original.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String secNumber = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, secNumber, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, secNumber, initDeposit));
            } else {
                System.out.println("Error reading account type");
            }
        }

        //accounts.get(5).showInfo();
        for (Account acc : accounts){
            System.out.println("\n*****************");
            acc.showInfo();
        }
    }
}
