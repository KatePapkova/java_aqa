package lesson6.classes.objects;

public class CreditCardTest {
    public static void main(String[] args) {
        // Create three CreditCard objects
        CreditCard card1 = new CreditCard("1111 2222 3333 4444", 1000);
        CreditCard card2 = new CreditCard("5555 6666 7777 8888", 500);
        CreditCard card3 = new CreditCard("9999 0000 1111 2222", 1200);

        // Deposit money to the first two cards
        card1.deposit(300);   // new balance: 1300
        card2.deposit(200);   // new balance: 700

        // Withdraw money from the third card
        card3.withdraw(500);  // new balance: 700

        // Print current card info
        System.out.println("\nCurrent state of all cards:");
        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}
