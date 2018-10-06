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
    public String run(int r) {
        return (a + " to run " + r + " distance");
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
   }

}

class Dog extends Animals{
   public Dog(){
       a = "dog"; 
   }
}