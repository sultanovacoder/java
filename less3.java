/**
* Java. Level 1. Lesson 3
*
* @author Marina Sultanova 
* @version dated Sep 21, 2018
*/

import java.util.Scanner;
public class less3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ili 2 igra? vvedite number");
		int input = sc.nextInt();
		switch (input){
			case 1: 
				thinkNum(sc); 
				break;
			case 2: 
				playWords(); 
				break;
			default: 
				System.out.println("Net game s takim number");
		}
	}
	
	public static void thinkNum(Scanner sc){
		int play = 1;
		while (play == 1) {
			int i = 1;
			int think = randomNumber(10);
			while (i<=3){
				System.out.println("Vvedite chislo ot 0 do 9");
				int a = sc.nextInt();
				if (a == think) {
					System.out.println("vi ygadali chislo"); 
					break; 
				} else if (a > think) System.out.println("zagadannoe chislo men'she"); else System.out.println("zagadannoe chislo bol'she");
				i++;
			}
			System.out.println("Game Over. Povtorim igry??? 1 - da. 2 - net");
			play = sc.nextInt();
		}
	}
	public static int randomNumber(int i) {
		return (int)(Math.floor(Math.random() * i));
	}
	public static void playWords(){ //zadanie neob'azatelno.nedodelano , potom dopishy 
		/*String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut","pear", "pepper", "pineapple", "pumpkin", "potato"};
		int length = words.length;
		String word = randomNumber(25);
		System.out.println(length + " " + randomNumber(25));*/
	}
}