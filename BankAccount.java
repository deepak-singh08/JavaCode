class BankAccount {
    
    // private variable
    private double balance;

    // deposit method
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // get balance method
    public void getBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount();

        obj.deposit(5000);
        obj.withdraw(2000);
        obj.getBalance();
    }
}

// Interface 1
interface Click {
    void captureOne();
}

// Interface 2
interface Capture {
    void captureTwo();
}

// Mobile class implementing both interfaces
class Mobile implements Click, Capture {

    public void captureOne() {
        System.out.println("Click photo");
    }

    public void captureTwo() {
        System.out.println("Capture video");
    }

    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.captureOne();
        m.captureTwo();
    }
}