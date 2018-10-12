/**
* Java. Level 1. Lesson 7
*
* @author Marina Sultanova 
* @version dated Oct 12, 2018
*/

public class Less7{
    public static void main(String[] args){
         Cat cat = new Cat(4);
         Plate plate = new Plate(5);
         System.out.println("koty nyghno s'est " + cat.fill);
         System.out.println("sejchas edi v tarelke " + plate.volume);
         cat.eat(plate);
         System.out.println("kolichestvo edi v tarelkre posle togo kak poel kot " + plate.volume);
         //System.out.println("dly togo chtob naests'a koty nyghno eshe " + cat.fill + " porcij");
        // System.out.println(plate);         
    }
}

class Cat {
    String name = "Tigrenia";
    int fill;
    boolean appetite; 
    
    public Cat(int x){
        fill = x;
    }
    
    public void eat(Plate plate){
        plate.minysEdiIzTarelki(fill);
        //this.fill = this.fill - plate.volume;
    }
    
    /*public int wantEat(int x) {
        return this.fill = x * (-1);
    }*/
}

class Plate{
    int volume;
    public Plate(int x){
        this.volume = x; //здесь же this не нужно?!
    }
    
    public void minysEdiIzTarelki(int fill) {
        this.volume = this.volume - fill;
    }
    
}