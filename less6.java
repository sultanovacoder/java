/**
* Java. Level 1. Lesson 6
*
* @author Marina Sultanova 
* @version dated Sep 26, 2018
*/



public class less6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.runAnimals());
    }
}

class Animals{
    protected String a = " animal";
    public String runAnimals() {
        return (a + " run");
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