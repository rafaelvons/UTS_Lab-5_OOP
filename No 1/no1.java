import java.util.Scanner;

class Hero {
    private String name;
    private String role;
    private int level;

    public Hero(String name, String role, int level) {
        this.name = name;
        this.role = role;
        this.level = level;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public void tampilkanInfo(){
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Level: " + level);
    
    }

    @Override
    public String toString(){
        return "Hero [Name= " + name + ", Role= " + role + " Level= " + level + "]";
    }
}

public class no1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama Hero: ");
        String name =  scanner.next();
        System.out.println("Masukkan role Hero: ");
        String role =  scanner.next();
        System.out.println("Masukkan level Hero: ");
        int level =  scanner.nextInt();

        Hero hero = new Hero(name, role, level);

        hero.tampilkanInfo();

        System.out.println(hero.toString());

        scanner.close();
    

    }
}

    