package classes_and_objects.bank;

/**
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class Account {
    private int accID;
    private String clientName;
    private double balance;
    private static double interestRateAnnual;
    protected static int totalAccCount = 0;

    /**
     * Constructor for Account
     * @param accID AccountID
     * @param clientName clientName
     * @param balance balance
     */
    public Account(int accID, String clientName, double balance) {
        this.accID = accID;
        this.clientName = clientName;
        this.balance = balance;
        interestRateAnnual = 4.5;
        totalAccCount++;
    }

    /**
     * Overloaded Constructor for sustom interest rate
     * @param accID AccountID
     * @param clientName clientName
     * @param balance balance
     * @param interestRate interestRate
     */
    public Account(int accID, String clientName, double balance,double interestRate) {
        this.accID = accID;
        this.clientName = clientName;
        this.balance = balance;
        interestRateAnnual = interestRate;
        totalAccCount++;
    }

    /**
     * Getter for accID
     * @return account ID
     */
    public int getAccID() {
        return accID;
    }

    /**
     * Setter for accID
     * @param accID accID
     */
    public void setAccID(int accID) {
        this.accID = accID;
    }

    /**
     * Getter for clientName
     * @return clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Setter for clientName
     * @param clientName clientName
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * Getter for balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Setter for balance
     * @param balance balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Getter for interestRateAnnual
     * @return interestRateAnnual
     */
    public static double getInterestRateAnnual() {
        return interestRateAnnual;
    }

    /**
     * setter for interestRateAnnual
     * @param interestRate interestRateAnnual
     */
    public static void setInterestRateAnnual(double interestRate) {
        Account.interestRateAnnual = interestRate;
    }

    /**
     * Calculates monthly interest rate
     * @return Monthly Interest Rate
     */
    public double getInterestRateMonthly () {
        return interestRateAnnual/12;
    }

    /**
     * Calculates monthly interest
     * @return monthly interest
     */
    public double getMonthlyInterest() {
        return this.balance * getInterestRateMonthly();
    }

    /**
     * Withdraws a given amount
     * @param withdrawAmount Amount to be withdrawn
     */
    public void withdraw(double withdrawAmount) {
        if(this.balance < withdrawAmount) {
            System.out.println("Withdrawal failed: no sufficient balance.");
        }else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawn Rs." + withdrawAmount);
        }
    }

    /**
     * Depositesa a given amount
     * @param depositAmount depositAmount
     */
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposited Rs." + depositAmount);
    }

    /**
     * toString method for Account
     * @return Account details
     */
    @Override
    public String toString() {
        return "Account{ Account ID=" + accID +
                ", Client Name='" + clientName + '\'' +
                ", Balance=" + balance + '}';
    }
}
