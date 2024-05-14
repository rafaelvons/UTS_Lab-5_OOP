import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Masukkan kata yang ingin dicek: ");
        String kata= myScanner.nextLine();
        boolean isPalindrom = Palindrom(kata); // Memanggil metode Palindrom yg dibawah untuk memeriksa apakah kata merupakan palindrom
        if (isPalindrom) {
            System.out.println("Kata " + kata + " merupakan palindrom."); 
        } else {
            System.out.println("Kata " + kata + " bukan palindrom.");
        }
        myScanner.close();
    }
    // Metode untuk memeriksa apakah sebuah kata merupakan palindrom atau tidak
    public static boolean Palindrom(String kata){
        int panjang = kata.length(); // Mencari panjang kata
        for (int i = 0; i < panjang/2; i++) { // jika i setengah dari panjang kata
            if (kata.charAt(i) != kata.charAt(panjang-i-1)){ // dibandingkan karakter pertama dengan karakter terakhir, kedua dengan kedua terakhir, dan seterusnya
                return false; // jika ada beda, berarti bukan palindrom
            }
        }
        return true; // jika benar berarti palindrom
    }
}