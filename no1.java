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
}

