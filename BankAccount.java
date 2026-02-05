class BankAccount {
private String accountNumber;
private String ownerName;
private double balance;


public BankAccount(String accountNumber, String ownerName, double balance) {
this.accountNumber = accountNumber;
this.ownerName = ownerName;
this.balance = Math.max(balance, 0);
}


public void deposit(double amount) { if (amount > 0) balance += amount; }


public void withdraw(double amount) { if (amount > 0 && amount <= balance) balance -= amount; }


public void displayInfo() {
System.out.println("Acc: " + accountNumber + ", Owner: " + ownerName + ", Balance: " + balance);
}
}


class MainBai2 {
public static void main(String[] args) {
BankAccount acc = new BankAccount("123", "Tuan", 1000);
acc.displayInfo();


acc.deposit(500);
acc.displayInfo();


acc.withdraw(300);
acc.displayInfo();
}
}
