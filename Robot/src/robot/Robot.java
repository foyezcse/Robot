/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot;

/**
 *
 * @author Science Fidelity
 */
public class Robot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // You can't instantiate a class
       SamiRobot obj = new SamiRobot();
       obj.call();
       obj.cook();
       obj.clean();
       obj.dance();
       obj.fight();
    }   
}
abstract class SciFiRobot //abstract class
{
public void call()
    {
        //definition
        System.out.println("Plz Call me...");
    }
//declaration
public abstract void cook();
public abstract void dance();
public abstract void fight();
public abstract void clean();
}
abstract class KhalekRobot extends SciFiRobot{
  public void cook()
    {
        //definition
        System.out.println("Cooking...");
    }  
}
class SamiRobot extends KhalekRobot{
public void dance()
    {
        //definition
        System.out.println("dancing...");
    }
public void fight()
    {
        //definition
        System.out.println("Let's fight with enemy");
    }
public void clean()
    {
        //definition
        System.out.println("Cleaning the city");
    }
}
