public class Account {
    // Atribut privat untuk menyimpan informasi akun
    private String idAccount;
    private String Name;
    private int balance;

    // Konstruktor pertama yang menerima idAccount, Name, dan balance sebagai
    // parameter
    public Account(String idAccount, String Name, int balance) {
        this.idAccount = idAccount; // Inisialisasi idAccount
        this.Name = Name; // Inisialisasi Name
        this.balance = balance; // Inisialisasi balance
    }

    // Konstruktor kedua yang hanya menerima idAccount dan Name, dan menetapkan
    // balance ke 0
    public Account(String idAccount, String Name) {
        this(idAccount, Name, 0); // Memanggil konstruktor pertama dengan balance default 0
    }

    // Metode getter untuk mengembalikan nilai idAccount
    public String getidAccount() {
        return idAccount;
    }

    // Metode getter untuk mengembalikan nilai Name
    public String getName() {
        return Name;
    }

    // Metode getter untuk mengembalikan nilai balance
    public int getBalance() {
        return balance;
    }

    // Metode untuk menambah jumlah tertentu ke balance (mengisi saldo)
    public void Credit(int amount) {
        balance += amount; // Menambah amount ke balance
    }

    // Metode untuk mengurangi jumlah tertentu dari balance (mengambil saldo)
    public void debit(int amount) {
        // Memeriksa apakah jumlah yang diambil tidak melebihi saldo yang ada
        if (amount <= balance) {
            balance -= amount; // Mengurangi amount dari balance
        } else {
            System.out.println("Amount exceeded balance"); // Pesan kesalahan jika saldo tidak cukup
        }
    }

    // Metode untuk mentransfer sejumlah uang ke akun lain
    public void transferTo(Account anotherAccount, int amount) {
        // Memeriksa apakah jumlah yang ditransfer tidak melebihi saldo yang ada
        if (amount <= balance) {
            this.debit(amount); // Mengurangi amount dari balance akun ini
            anotherAccount.Credit(amount); // Menambah amount ke balance akun tujuan
        } else {
            System.out.println("Amount exceeded balance"); // Pesan kesalahan jika saldo tidak cukup
        }
    }

    // Metode toString untuk mengembalikan representasi string dari akun
    @Override
    public String toString() {
        return "Account[id=" + idAccount + ",name=" + Name + ",balance=" + balance + "]";
    }
}
