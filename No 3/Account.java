public class Account{
    private String idAccount;
    private String Name;
    private int balance;

    public Account(String idAccount, String Name , int balance) {
        this.idAccount = idAccount;
        this.Name = Name;
        this.balance = balance;
    }

    public Account(String idAccount, String Name) {
        this(idAccount, Name, 0);
    }

    public String getidAccount(){
        return idAccount;
    }

    public String getName(){
        return Name;
    }

    public int getBalance(){
        return balance;
    }

    public void Credit(int amount){
        balance += amount;
    }

    public void debit(int amount){
        if (amount <= balance){
            balance -= amount;
        }
        else {
            System.out.println("Amount exceeded balance");
            
        }
    }

    public void transferTo(Account anotherAccount, int amount){
        if (amount<=balance){
            this.debit(amount);
            anotherAccount.Credit(amount);

        }
        else {
            System.out.println("Amount exceeded balance");
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account[id=").append(idAccount)
          .append(", name=").append(Name)
          .append(", balance=").append(balance)
          .append("]");
        return sb.toString();
    }
}
