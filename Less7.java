/**
* Java. Level 1. Lesson 7
*
* @author Marina Sultanova 
* @version dated Oct 12, 2018
*/

import java.util.Scanner;

public class Less7{
    public static void main(String[] args){
         Cat cat = new Cat(10);
         Plate plate = new Plate(12);
         Scanner sc = new Scanner(System.in);
         System.out.println("koty nyghno s'est " + cat.fill);
         System.out.println("sejchas edi v tarelke " + plate.volume);
         cat.eat(plate);
         System.out.println("kolichestvo edi v tarelkre posle togo kak poel kot " + plate.volume);
         System.out.println("dly togo chtob naests'a koty nyghno eshe " + cat.fill + " porcij");
         System.out.println("Dobavit korma? 1 - da; 2-net");
         if (sc.nextInt() == 1) {
             plate.addEat(sc.nextInt());
         } else {
             return;
         }
         System.out.println("sejchas edi v tarelke " + plate.volume);
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
        plate.minysEdiIzTarelki(this);
    }
}

class Plate{
    int volume;
    public Plate(int x){
        this.volume = x; //здесь же this не нужно?!
    }
    
    public void minysEdiIzTarelki(Cat cat) {
        if (cat.fill >= this.volume) {
            cat.fill = cat.fill - this.volume;
            this.volume = 0;
        } else {
            this.volume = this.volume - cat.fill;
            cat.fill = 0;
        }
    }
    
    public void addEat(int x) {
        volume += x;
    }
}