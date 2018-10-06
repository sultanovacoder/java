/**
* Java. Level 1. Lesson 6
*
* @author Marina Sultanova 
* @version dated Oct 07, 2018
*/

import java.util.Scanner;

public class less6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Scanner sc = new Scanner(System.in);
        System.out.println(cat.run(sc.nextInt()));
        
        /*System.out.println(cat.jump());
        System.out.println(cat.swim());*/
    }
    

}



class Animals{
    protected String a = " animal";
    protected int limit_run, limit_swim;
    protected double limit_jump;
    
    public boolean run(int r) {
        if (r < limit_run) {
            System.out.println(a + " to run " + r + " distance"); 
            return true;
        } else {
            return false;
        }
    }
    
    public String swim(int r){
        return (a + " to swim " + r + " distance");
    }
    
    public String jump(int r){
        return (a + " to jump " + r + " distance");
    }
}

class Cat extends Animals{
   public Cat(){
       a = "cat"; 
       limit_run = 200;
       limit_jump = 2;
       limit_swim = 0;
   }

}

class Dog extends Animals{
   public Dog(){
       a = "dog"; 
       limit_run = 500;
       limit_jump = 0.5;
       limit_swim = 10;
   }
}