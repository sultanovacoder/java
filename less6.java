/**
* Java. Level 1. Lesson 6
*
* @author Marina Sultanova 
* @version dated Oct 08, 2018
*/

import java.util.Scanner;

public class Less6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog(20);
        Dog dog2 = new Dog(150);
        Scanner sc = new Scanner(System.in);
        System.out.println("info o cat");
        System.out.println(cat.run(sc.nextFloat()));
        System.out.println(cat.swim(sc.nextFloat()));
        System.out.println(cat.jump(sc.nextFloat()));
        System.out.println();
        System.out.println("info o dog");
        System.out.println(dog.run(sc.nextFloat())); //1 dog
        System.out.println(dog2.run(sc.nextFloat())); //2 dog
        System.out.println(dog.swim(sc.nextFloat()));
        System.out.println(dog.jump(sc.nextFloat()));
    }
}

abstract class Animals{
    protected String a = " animal";
    protected float limit_run, limit_swim;
    protected float limit_jump;
    protected final String RUN = " to run: ";
    protected final String SWIM = " to swim: ";
    protected final String JUMP = " to jump: ";
    
    public boolean check(float input, float limit){
        if (input <= limit) {
            System.out.println(input + " distance"); 
            return true;
        } else {            
            return false;
        }
    }
    
    public boolean run(float r) {
        System.out.println(a + RUN);
        return check(r,limit_run);
    }

    public boolean swim(float r){
        System.out.println(a + SWIM);
        return check(r,limit_swim);
    }
    
    public boolean jump(float r){
        System.out.println(a + JUMP + "float");
        return check(r,limit_jump);
    }
}

class Cat extends Animals{
   public Cat(){
       a = "cat"; 
       limit_run = 200;
       limit_jump = 2;
   }
   
   @Override
   public boolean swim(float r){
       System.out.println(a + SWIM);
       return false;
   }
   

}

class Dog extends Animals{
   public Dog(int x){
       a = "dog"; 
       limit_run = x;
       limit_swim = 10;
       limit_jump = (float) 0.5;
   }
}