package game;
public class playerr {
 String name;
    int speed, healthPoin, damage, armor;

    void run() {
        System.out.println(name + " is running...");
        System.out.println("Speed: " + speed);
    }
    void attack(String name){
        System.out.println(name + " is attacking...");
        System.out.println("Damage: " + damage);
    
    }
    void defend(){ 
        System.out.println(name + " is defending...");
        System.out.println("Armor: " + armor);
    
    }

    boolean isDead() {
        if(healthPoin <= 0) return true;
        return false;

    }
    
   
}    

