
package game;

public class Game {

    public static void main(String[] args) {
      playerr hero = new playerr();
      playerr enemy = new playerr();
      
      hero.name = "Muso";
      hero.speed = 60 ;
      hero.healthPoin = 100;
      hero.damage = 100;
      hero.armor = 50;
      
      enemy.name = "jeki";
      enemy.speed = 60;
      enemy.healthPoin = 100;
      enemy.damage = 100;
      enemy.armor = 5;
             
      
      hero.run();
      hero.attack(enemy.name);
      
      if(hero.isDead()){
          System.out.println("Gme Over :(");
      
    }
    drone dji = new drone();
    
    dji.energi = 50;
    dji.ketinggian = 55;
    dji.kecepatan = 150;
    dji.merek = "Nokia";
    
    dji.terbang();
    dji.matikanMesin();
    dji.turun();
    dji.belok();
    dji.maju();
    dji.mundur();
    
    
    rohingya jeki = new rohingya();
  
  jeki.name = "nopal";
  jeki.speed = 100;
  jeki.damage = 50;
  
    if(jeki.isDead()){
          System.out.println("Game Over :(");
}
  
    
    }  
}