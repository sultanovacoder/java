/**
* Java. Level 1. Lesson 5
*
* @author Marina Sultanova 
* @version dated Sep 26, 2018
*/

public class Less5 {
    public static void main(String[] args){
        Cooperator[] mass = new Cooperator[5];
        mass[0] = new Cooperator("Lenka", "secretar", "lenka.secretar@mail.ru", "79214562801", 30000, 62);
        mass[1] = new Cooperator("Anna", "buhgalter", "anna.buhg@mail.ru", "79213678301", 120000, 48);
        mass[2] = new Cooperator("Alex", "prodavec", "alex.prodavec@mail.ru", "79213678937", 25200, 22);
        mass[3] = new Cooperator("Miha", "gryzchik", "miha.gryzchik@mail.ru", "79213678002", 15000, 18);
        mass[4] = new Cooperator("Andrey", "kyr'er", "andrey@gmail.com", "79213679934", 22000, 20);
        for (int i = 0; i < mass.length; i++) 
            if (mass[i].age > 40) mass[i].outputInfo();
    }
    
}

class Cooperator {
    String name;
    String position;
    String email;
    String phone;
    int zarplata;
    int age;
    public void outputInfo(){
        System.out.println(name + " " + position + " " + email + " " + phone + " " + zarplata + " " + age);
    }
    
    public Cooperator(String name, String position, String email, String phone, int zarplata, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.zarplata = zarplata;
        this.age = age;
    }
    
}