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
        System.out.println(cat.swim(sc.nextInt()));
        System.out.println(cat.jump(sc.nextInt()));
        System.out.println();
        System.out.println(dog.run(sc.nextInt()));
        System.out.println(dog.swim(sc.nextInt()));
        System.out.println(dog.jump(sc.nextDouble()));
    }
    

}



class Animals{
    protected String a = " animal";
    protected int limit_run, limit_swim;
    protected int limit_jump;
    protected String run = " to run: ";
    protected String swim = " to swim: ";
    protected String jump = " to jump: ";
    
    public boolean check(int input, int limit){
        if (input <= limit) {
            System.out.println(input + " distance"); 
            return true;
        } else {            
            return false;
        }
    }
    
    public boolean run(int r) {
        System.out.println(a + run);
        return check(r,limit_run);
    }

    public boolean swim(int r){
        System.out.println(a + swim);
        return check(r,limit_swim);
    }
    
    public boolean jump(int r){
        System.out.println(a + jump);
        return check(r,limit_jump);
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