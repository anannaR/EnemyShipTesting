/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enemyshiptesting;

/**
 *
 * @author user
 */
public abstract class EnemyShip {
    private String name;
    private double anidamage;
    public String getName(){
        return name;
    }
    public void setName(String s){
        name=s;
        
    }
    public double getDamage(){
        return anidamage;
    }
    public void setDamage(double s){
        anidamage=s;
        
    }
    public void displayEnemyShip(){
        System.out.println(getName()+" is on the screen");
    }
    public void FollowEnemyShip(){
        System.out.println(getName()+" is following the hero");
    }
    public void EnemyShipShoot(){
        System.out.println(getName()+" attacks &shoots "+getDamage());
    }
    
}
