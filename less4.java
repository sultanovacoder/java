/**
* Java. Level 1. Lesson 4
*
* @author Marina Sultanova 
* @version dated Sep 24, 2018
*/
import java.util.Scanner;
import java.util.Random; // Vspominaya proshluyu nedorabotku v Domashke(nomer 3). v etot raz ispol'zuyu Random

public class less4 {
    int k = 0; //количество ходов человека
    static char[][] table = new char[3][3];
    static boolean[][] memory = new boolean[3][3];
    
    public static void main(String[] args) {
        System.out.println("Welcome. This is a game of tic-tac-toe");
        System.out.println("Your turn. Enter the X and Y coordinates");
        createField();
        updateField();
        walksMan();
    }
    
    public static void createField() {	
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = '>';
                memory[i][j] = true;
            }
        }
    }
    
    public static void updateField() {
        int j = 0;
        while (j < 3) {
            for (int i = 0; i < 3; i++) {
                System.out.print("    " + table[i][j]);
            }
            System.out.println("");
            j+=1;
        } 
    }
    
    public static void walksMan() {	
        Scanner step = new Scanner(System.in);
        System.out.println("Input X coordinate");
        int x = step.nextInt()-1;
        System.out.println("Input Y coordinate");
        int y = step.nextInt()-1;
        if (!checkCell(x,y)) {
            walksMan();
        } else {
            memory[x][y] = false;
            table[x][y] = 'X';
            updateField();
            if (checkWinH(table[x][y]) || checkWinV(table[x][y]) || checkWinD(table[x][y])) {
                System.out.println("you won");
                return;
            }
            walksRobot();
        }
    }
    
    public static void walksRobot() {
        Random rnd = new Random();
        int x = rnd.nextInt(3);
        int y = rnd.nextInt(3);
        if (!checkCell(x,y)) {
            walksRobot();
        } else {
            memory[x][y] = false;
            table[x][y] = '0';
            System.out.println("The computer made a move");
            updateField();
            if (checkWinH(table[x][y]) || checkWinV(table[x][y]) || checkWinD(table[x][y])) {
                System.out.println("computer won");
                return;
            }
            walksMan();
        }
    }
    
    public static boolean checkWinV(char a) {
        int i = 0;
        while (i < table.length) {
            int k = 0;
            for (int j = 0; j < table.length; j++) {
                if (table[i][j] == a) k+=1;
                if (k == table.length) return true;
            }
            i+=1;
        } 
        return false;
    }
    
    public static boolean checkWinH(char a) {
        int j = 0;
        while (j < table.length) {
            int k = 0;
            for (int i = 0; i < table.length; i++) {
                if (table[i][j] == a) k+=1;
                if (k == table.length) return true;
            }
            j+=1;
        } 
        return false;
    }
    
    public static boolean checkWinD(char a) {
        int k = 0;
        int k1 = 0;
        for (int i = 0; i < table.length; i++) {
			int perv = i;
			int posl = table.length-1-i;
			if (table[perv][perv] == a) k += 1;
			if (table[perv][posl] == a) k1 += 1;
            if ((k == table.length) || (k1 == table.length)) return true;
        }
        return false;
    }
    
    
    public static boolean checkCell(int x, int y) {
        if ((x > 2) || (y > 2) || (x < 0) || (y < 0)) {
            System.out.println("Wrong! Enter coordinates again in the range from 1 to 3");
            return false; 
        }
        
        if (memory[x][y] == true) return true; else return false; //return memory[x][y]; 
    }
}