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
        Dog dog = new Dog();
        Scanner sc = new Scanner(System.in);
        System.out.println(cat.run(sc.nextInt()));
        System.out.println(cat.swim());
        System.out.println(cat.jump(sc.nextInt()));
        System.out.println();
        System.out.println(dog.run(sc.nextInt()));
        System.out.println(dog.swim(sc.nextInt()));
        System.out.println(dog.jump(sc.nextDouble()));
    }
}

abstract class Animals{
    protected String a = " animal";
    protected int limit_run, limit_swim;
    protected int limit_jump;
    protected final String RUN = " to run: ";
    protected final String SWIM = " to swim: ";
    protected final String JUMP = " to jump: ";
    
    public boolean check(int input, int limit){
        if (input <= limit) {
            System.out.println(input + " distance"); 
            return true;
        } else {            
            return false;
        }
    }
    
    public boolean run(int r) {
        System.out.println(a + RUN);
        return check(r,limit_run);
    }

    public boolean swim(int r){
        System.out.println(a + SWIM);
        return check(r,limit_swim);
    }
    
    public boolean jump(int r){
        System.out.println(a + JUMP);
        return check(r,limit_jump);
    }
}

class Cat extends Animals{
   public Cat(){
       a = "cat"; 
       limit_run = 200;
       limit_jump = 2;
   }
   
   public boolean swim(){
       System.out.println(a + SWIM);
       return false;
   }

}

class Dog extends Animals{
   public Dog(){
       a = "dog"; 
       limit_run = 500;
       double limit_jump = 0.5;
       limit_swim = 10;
   }
   
   public boolean jump(double r){
        if (r <= limit_jump) {
            System.out.println(r + " distance"); 
            return true;
        } else {            
            return false;
        }
   }
}