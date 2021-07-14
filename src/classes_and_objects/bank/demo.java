package classes_and_objects.bank;

/**
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */

/**
 * This is for demonstration only
 */
public class demo {
    public static void main(String []args) {
        Bank newBank = new Bank();
        System.out.println("<Creating a new branch>");

        newBank.createBranch();
        System.out.println("<Branch Created>");
        newBank.createBranch();
        System.out.println();
        newBank.createBranch();
        System.out.println();
        newBank.createBranch();
        System.out.println();

        System.out.println("<Creating a Accounts>");
        newBank.getBranches().get(0).createAccount();
        System.out.println();
        newBank.getBranches().get(1).createAccount();
        System.out.println();
        newBank.getBranches().get(2).createAccount();
        System.out.println();
        newBank.getBranches().get(3).createAccount();
        System.out.println();


        System.out.println("<Calculating Monthly interest rate of branch index = 0 and account index = 0>");
        System.out.println("Monthly Interest rate : " + newBank.getBranches().get(0).getAccounts().get(0).getInterestRateMonthly());

        System.out.println("<Calculating Monthly interest of branch index = 0 and account index = 0>");
        System.out.println("Monthly Interest : " + newBank.getBranches().get(0).getAccounts().get(0).getMonthlyInterest());

        System.out.println("<Withdraw 1200>");
        newBank.getBranches().get(0).getAccounts().get(0).withdraw(1200);

        System.out.println("< deposit a 138889 of money>");
        newBank.getBranches().get(0).getAccounts().get(0).deposit(138889);

        System.out.println("<Printing number of accounts in a branch>");
        newBank.printNoOfAccountsInBranch();

        System.out.println("<Printing the total number of accounts in all the branches>");
        newBank.printTotalNoOfAccounts();

        System.out.println("<Printing the details of account Branch 1 (Enter a Account ID in Branch 1)>");
        newBank.getBranches().get(0).printAccount();

        System.out.println("<Printing Details of All branches>");
        newBank.printAllBranches();
    }
}
