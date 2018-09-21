/**
* Java. Level 1. Lesson 3
*
* @author Marina Sultanova  @nickname Маря (не Мария!!!)
* @version dated Sep 21, 2018
*/

import java.util.Scanner;
public class less3 {
	public static void main(String[] args){
		thinkNum();
	}
	
	public static void thinkNum(){
		Scanner sc = new Scanner(System.in);
		int play = 1;
		while (play == 1) {
			int i = 1;
			int think = (int)(Math.floor(Math.random() * 10));
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
}