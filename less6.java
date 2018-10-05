/**
* Java. Level 1. Lesson 6
*
* @author Marina Sultanova 
* @version dated Sep 26, 2018
*/



public class less6 {
    public static void main(String[] args) {
        System.out.println(Animals.runAnimals());
        System.out.println(Cat.runAnimals());
    }
}

class Animals{
    static String a = " animal";
    public static String runAnimals() {
        return (a + "run");
    }
    
}

class Cat extends Animals{
    //static String a = " cat"; неправильно
}

class Dog extends Animals{
    
}