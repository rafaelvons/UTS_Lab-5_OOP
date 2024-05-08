import java.util.Scanner;
// Class Hero
class Hero {
    private String name;
    private String role;
    private int level;

    //Konstruktor untuk inisialisasi Hero
    public Hero(String name, String role, int level) {
        this.name = name;
        this.role = role;
        this.level = level;
    }

    //Getter untuk nama Hero
    public String getName(){
        return name;
    }
    //Setter untuk nama Hero
    public void setName(String name){
        this.name = name;
    }
    //Getter untuk Role Hero
    public String getRole(){
        return role;
    }
    //Setter untuk Role Hero
    public void setRole(String role){
        this.role = role;
    }
    //Getter untuk level Hero
    public int getLevel(){
        return level;
    }
    //Setter untuk level Hero
    public void setLevel(int level){
        this.level = level;
    }
    //Method overloading untuk menampilkan hero
    public void tampilkanInfo(){
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Level: " + level);
    
    }
    //Method overriding dari class object untuk menampilkan informasi hero
    @Override
    public String toString(){
        return "Hero [Name= " + name + ", Role= " + role + " Level= " + level + "]";
    }
}

public class no1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Meminta user untuk menginput informasi hero
        System.out.println("Masukkan nama Hero: ");
        String name =  scanner.next();
        System.out.println("Masukkan role Hero: ");
        String role =  scanner.next();
        System.out.println("Masukkan level Hero: ");
        int level =  scanner.nextInt();
        //Membuat objek hero menggunakan constructor
        Hero hero = new Hero(name, role, level);
        //Menampilkan informasi hero menggunakan overloading
        hero.tampilkanInfo();
        //Menampilkan informasi hero menggunakan method toString (Overriding)
        System.out.println(hero.toString());

        scanner.close();
    

    }
}

    