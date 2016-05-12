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
import java.util.Scanner;
public class EnemyShipTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // EnemyShip ufoShip= new UFOEnemyShip() ;
       
        EnemyShipFactory shipfactory= new EnemyShipFactory();
         EnemyShip theEnemy=null;
         System.out.println("enter u/r/b");
        Scanner ui= new Scanner(System.in);
     
        if(ui.hasNextLine()){
           
            String typeofship=ui.nextLine();
            theEnemy=shipfactory.makeEnemyShip(typeofship);
        }
        
    
        if(theEnemy!=null){
             dostuffEnemy(theEnemy);
            
        }else
            System.out.println("enter u/r/b next time");
        
    }
    public static void dostuffEnemy( EnemyShip a){
        a.EnemyShipShoot();
        a.FollowEnemyShip();
        a.displayEnemyShip();
    }
    
}
