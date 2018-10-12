/**
* Java. Level 1. Lesson 2
*
* @author Marina Sultanova  @nickname Маря (не Мария!!!)
* @version dated Sep 19, 2018
*/

public class Less2 {
	public static void main(String[] args) {
		makeRev(30);
		System.out.printf("%n %n");
		fillArray();
		System.out.printf("%n %n");
		multiplyTwo();
		System.out.printf("%n %n");
		fillDiagonal();
	}
	
	public static void makeRev(int a){
		int[] arr = new int[a];
		int[] rev = arr;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.floor(Math.random()*2));
			System.out.print(arr[i] + " ");
			if (arr[i] == 0) rev[i] = 1; else rev[i] = 0;
		}
		System.out.println("");
		for (int i = 0; i < rev.length; i++) {
			System.out.print(rev[i] + " ");
		}
	}
	
	public static void fillArray(){
		int[] arr = new int[8];
		int j = 0, i = 0;
		while (i < arr.length) {
			arr[i] = j;
			System.out.print(arr[i] + " ");
			j+=3;
			i++;
		}
	}
	
	public static void multiplyTwo(){
		int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 6) arr[i] *= 2;
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void fillDiagonal(){
		int[][] arr = new int[10][10];
		for (int i = 0; i < arr.length; i++){
			int perv = i;
			int posl = arr.length-1-i;
			arr[perv][perv] = 1;
			arr[perv][posl] = 1;
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.printf("%n");
		}
	}
	
}