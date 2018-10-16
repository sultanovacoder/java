/**
* Java. Level 1. Lesson 7
*
* @author Marina Sultanova 
* @version dated Oct 12, 2018
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.lang.Integer;

public class Less7{
    public static void main(String[] args){
         File file = new File("less7.txt");
         ArrayList<Cat> catslist = new ArrayList<Cat>();
         Scanner sc2;
         Cat[] cats;
         try {
             sc2 = new Scanner(file);
             while (sc2.hasNextLine()) {
                 String line = sc2.nextLine().trim();
                 int pos = line.indexOf(',');
                 if (pos != -1) {
                     String name = line.substring(0,pos);
                     int fill = Integer.parseInt(line.substring(pos+1));
                     catslist.add(new Cat(name, fill));
                     //System.out.println(name + " " + fill);
                 } 
             }
             cats = catslist.toArray(new Cat[catslist.size()]);  
         }
         catch(FileNotFoundException e) {
             cats = new Cat[0];
             e.printStackTrace();
         }
         finally {
             //sc2.close();
         }
         Plate plate = new Plate(12);
         Scanner sc = new Scanner(System.in);
         
         for (Cat cat:cats) {
            System.out.println(cat.name + " koty nyghno s'est " + cat.fill);
            System.out.println("sejchas edi v tarelke " + plate.volume);
            cat.eat(plate);
            System.out.println("kolichestvo edi v tarelkre posle togo kak poel kot " + plate.volume);
            System.out.println("dly togo chtob naests'a koty nyghno eshe " + cat.fill + " porcij");
            System.out.println("Dobavit korma? 1 - da; 2-net");
            if (sc.nextInt() != 1) {
                continue;
            }
            plate.addEat(sc.nextInt());
            System.out.println("sejchas edi v tarelke " + plate.volume);
         }
         for (Cat cat:cats){
             System.out.println(cat.name + " " + cat.fill);
         }  
    }
}

class Cat {
    String name;
    int fill;
    boolean appetite; 
    
    public Cat(String x, int y){
        name = x;
        fill = y;
    }
    
    public void eat(Plate plate){
        plate.minysEdiIzTarelki(this);
    }
}

class Plate{
    int volume;
    public Plate(int x){
        this.volume = x; //здесь же this не нужно! потому что я аргумент обозвала иксом
    }
    
    public void minysEdiIzTarelki(Cat cat) {
        if (cat.fill >= volume) {
            cat.fill = cat.fill - volume;
            volume = 0;
        } else {
            volume = volume - cat.fill;
            cat.fill = 0;
        }
    }
    
    public void addEat(int x) {
        volume += x;
    }
}