class Bank {

    void interest() {
        System.out.println("Bank Interest");
    }
}

public class BankInheritance
extends Bank {

    void sbi() {
        System.out.println("SBI Interest");
    }

    public static void main(String[] args) {

        BankInheritance b =
            new BankInheritance();

        b.interest();
        b.sbi();
    }
}
