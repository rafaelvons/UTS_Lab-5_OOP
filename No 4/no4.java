import java.util.Scanner;

class Matriks {
    // Method untuk menghitung determinan matriks 2x2
    public double hitungDeterminan(double a, double b, double c, double d) {
        // Rumus untuk determinan matriks 2x2: ad - bc
        return (a * d) - (b * c);
    }

    // Overload method untuk menghitung determinan matriks 3x3
    public double hitungDeterminan(double a, double b, double c, double d, double e, double f, double g, double h, double i) {
        // Rumus untuk determinan matriks 3x3
        // a(ei - fh) - b(di - fg) + c(dh - eg)
        return (a * ((e * i) - (f * h))) - (b * ((d * i) - (f * g))) + (c * ((d * h) - (e * g)));
    }
}

public class no4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Input dari pengguna untuk elemen-elemen matriks 2x2
        System.out.println("Masukkan elemen-elemen matriks 2x2:");
        System.out.print("a: ");
        double a = myScanner.nextDouble();
        System.out.print("b: ");
        double b = myScanner.nextDouble();
        System.out.print("c: ");
        double c = myScanner.nextDouble();
        System.out.print("d: ");
        double d = myScanner.nextDouble();

        // Membuat instance dari kelas Matriks
        Matriks matriks = new Matriks();

        // Menghitung dan menampilkan determinan matriks 2x2
        double determinan2x2 = matriks.hitungDeterminan(a, b, c, d);
        System.out.println("Determinan matriks 2x2: " + determinan2x2);

        // Input dari pengguna untuk elemen-elemen matriks 3x3
        System.out.println("Masukkan elemen-elemen matriks 3x3:");
        System.out.print("a: ");
        double aa = myScanner.nextDouble();
        System.out.print("b: ");
        double bb = myScanner.nextDouble();
        System.out.print("c: ");
        double cc = myScanner.nextDouble();
        System.out.print("d: ");
        double dd = myScanner.nextDouble();
        System.out.print("e: ");
        double ee = myScanner.nextDouble();
        System.out.print("f: ");
        double ff = myScanner.nextDouble();
        System.out.print("g: ");
        double gg = myScanner.nextDouble();
        System.out.print("h: ");
        double hh = myScanner.nextDouble();
        System.out.print("i: ");
        double ii = myScanner.nextDouble();

        // Menghitung dan menampilkan determinan matriks 3x3
        double determinan3x3 = matriks.hitungDeterminan(aa, bb, cc, dd, ee, ff, gg, hh, ii);
        System.out.println("Determinan matriks 3x3: " + determinan3x3);

        myScanner.close();
    }
}
