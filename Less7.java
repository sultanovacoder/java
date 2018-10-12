/**
* Java. Level 1. Lesson 7
*
* @author Marina Sultanova 
* @version dated Oct 12, 2018
*/

public class Less7{
    public static void main(String[] args){
         Cat cat = new Cat();
         Plate plate = new Plate(1);
         System.out.println("koty nyghno s'est " + cat.fill);
         System.out.println("sejchas edi v tarelke " + plate.volume);
         cat.eat(plate);
         //System.out.println("kolichestvo edi v tarelkre posle togo kak poel kot " + plate.volume);
         //System.out.println("dly togo chtob naests'a koty nyghno eshe " + cat.fill + " porcij");*/
        // System.out.println(plate);         
    }
}

class Cat {
    String name = "Tigrenia";
    int fill = 4;
    
    public void eat(Plate plate){
        //plate.minysEdiIzTarelki(this.fill);
    }
    
    public int wantEat(int x) {
        return this.fill = x * (-1);
    }
}

class Plate{
    int volume;
    public Plate(int x){
        volume = x; //здесь же this не нужно?!
    }
    /*public int minysEdiIzTarelki(int fill) {

    }*/
}