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
public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String n){
        EnemyShip newShip= null;
        if(n.equals("u")){
            return new UFOEnemyShip();
        }
        else if(n.equals("r")){
            return new RocketEnemyShip();
        }
         else if(n.equals("b")){
            return new BigUFOEnemyShip();
         }
        
         else
             return null;
    }
    
}
        
   
    

            
        
    
            
        
    
    

