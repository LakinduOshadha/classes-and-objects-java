package classes_and_objects.bank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class Branch {
    private int branchID;
    private String location;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    /**
     * Constructor for Branch
     * @param branchID branchID
     * @param location location
     */
    public Branch(int branchID, String location) {
        this.branchID = branchID;
        this.location = location;
    }

    /**
     * Getter for branchID
     * @return branchID
     */
    public int getBranchID() {
        return branchID;
    }

    /**
     * Setter for branchID
     * @param branchID branchID
     */
    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    /**
     * Getter for location
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Setter for location
     * @param location location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Getter for accounts
     * @return accounts
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /**
     * Setter for accounts
     * @param accounts accounts
     */
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    /**
     * Creates account with user details
     */
    public void createAccount() {
        Scanner sc = new Scanner((System.in));

        System.out.print("Enter Account ID : ");
        int accID = sc.nextInt();

        // For invalid ID inputs
        while(!isIDValid(accID)) {
            System.out.println("Entered Account Number is Invalid.!");
            System.out.print("Enter a valid Account ID (6 Digits) : ");
            accID = sc.nextInt();
        }

        System.out.print("Enter Client Name : ");
        String clientName = sc.next();


        System.out.print("Enter Balance : ");
        double bal = sc.nextDouble();

        // For invalid balance inputs
        while(!isBalValid(bal)) {
            System.out.println("Entered Balance is Invalid.!");
            System.out.print("Enter a valid Balance(positive or zero) : ");
            bal = sc.nextDouble();
        }

        Account newAcc = new Account(accID, clientName, bal);
        accounts.add(newAcc);

    }

    /**
     * Gives the number of accounts in the branch
     * @return number of accounts in the branch
     */
    public int getNoOfAccounts() {
        return accounts.size();
    }

    /**
     * Prints Number of Accounts in the Branch
     */
    public void printNoOfAccounts() {
        System.out.println("Number of Accounts : " + getNoOfAccounts());
    }

    /**
     * Prints Account details with given account ID
     */
    public void printAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account ID : ");
        int accID = sc.nextInt();

        for(Account acc: accounts) {
            if(acc.getAccID() == accID) {
                System.out.println(acc.toString());
            }
        }
    }

    /**
     * toString method for Branch
     * @return Branch Details
     */
    @Override
    public String toString() {
        return "Branch{ branchID=" + branchID +
                ", location='" + location + '\'' + '}';
    }

    /**
     * Check the validity of account ID
     * @param ID account ID
     * @return true is valid
     */
    private boolean isIDValid(int ID) {
        return String.valueOf(ID).length() == 6;
    }

    /**
     * Check the validity of account balance
     * @param bal balance
     * @return true if valid
     */
    private boolean isBalValid(double bal) {
        return (bal < 0) ? false : true;
    }

}
