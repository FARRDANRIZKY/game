
package game;


public class rohingya {
    String name;
    int speed, healthPoin, damage;
    
    void run(){
        System.out.println(name + "is running...");
        System.out.println("speed: " + speed);
    }
    void attack(){
        System.out.println(name + "is attacking...");
        System.out.println("Damage: " + damage);
    }
    boolean isDead() {
        if(healthPoin <= 0) return true;
        return false;

    }
    
  
    }
        
        
    
    

