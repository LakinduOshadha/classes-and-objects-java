package classes_and_objects.bank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */

/**
 * Bank class
 */
public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    /***
     * Getter for branches
     * @return branches
     */
    public ArrayList<Branch> getBranches() {
        return branches;
    }

    /**
     * Setter for branches
     * @param branches branches
     */
    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    /**
     *Creates a branch with user inputs
     */
    public void createBranch() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Branch ID : ");
        int branchId = sc.nextInt();

        System.out.print("Enter Location : ");
        String location = sc.next();

        Branch newBranch = new Branch(branchId, location);
        branches.add(newBranch);
    }

    /**
     *Prints the number of accounts in a given branch
     * User should give the branch ID
     */
    public void printNoOfAccountsInBranch() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Branch ID : ");
        int branchID = sc.nextInt();

        for(Branch br: branches) {
            if(br.getBranchID() == branchID) {
                System.out.println("Number of Accounts : " + br.getNoOfAccounts());
            }
        }
    }

    /**
     * Prints Details of all branches
     */
    public void printAllBranches() {
        for(Branch br: branches) {
            System.out.println(br.toString());

        }
    }

    /**
     * Print total number of accounts in the bank
     */
    public void printTotalNoOfAccounts() {
        System.out.println("Total Number of Acoounts : " + Account.totalAccCount);
    }
}
