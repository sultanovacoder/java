/**
* Java. Level 1. Lesson 4
*
* @author Marina Sultanova 
* @version dated Sep 24, 2018
*/

public class less4 {
    int k = 0; //количество ходов человека
    
    public static void main(String[] args) {
        createField();
    }
    
    public static void createField() {	
        char[][] table = new char[3][3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = '.';
                System.out.print(table[i][j] + "    ");
            }
            System.out.println("");
        }
    }
    
    public static void walksMan() {	
}