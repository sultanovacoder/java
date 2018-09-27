/**
* Java. Level 1. Lesson 4
*
* @author Marina Sultanova 
* @version dated Sep 24, 2018
*/
import java.util.Scanner;
public class less4 {
    int k = 0; //количество ходов человека
    char[][] table = new char[3][3];
    boolean[][] memory = new boolean[3][3];
    
    public static void main(String[] args) {
        System.out.println("Welcome. This is a game of tic-tac-toe");
        System.out.println("Your turn. Enter the X and Y coordinates");
        createField();
        walksMan();
    }
    
    public static void createField() {	

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = '>';
                memory[i][j] = true;
                System.out.print("    " + table[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void walksMan() {	
        Scanner step = new Scanner(System.in);
        System.out.println("Input X coordinate");
        int x = step.nextInt();
        System.out.println("Input Y coordinate");
        int y = step.nextInt();
        checkCell(x,y);
        memory[x][y] = false;
    }
    
    public static boolean checkCell(int x, int y) {
        if ((x > 3) || (y > 3) ) {
            System.out.println("Wrong! Enter coordinates again in the range from 1 to 3");
            walksMan();
        } else return false;
    }
}