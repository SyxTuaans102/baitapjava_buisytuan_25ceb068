public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.balance = balance;
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
    if (balance >= amount) {
        balance -= amount;
        return balance;
    }
    else {
        return 0;
    }
    }

    public int transfer(int amount, Account another) {
        if (balance >= amount) {
            balance -= amount;
            another.balance += amount;
            return balance;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Account[" + "id='" + id + '\'' + ", name='" + name + '\'' + ", balance=" + balance + ']';
    }
}
