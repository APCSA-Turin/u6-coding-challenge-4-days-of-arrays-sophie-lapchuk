package com.example.project;
/*
 * Requirements:
The size of the snowflake should be an odd number. 
You will need to generate the snowflake with a 2 dimensional array. 
Your function will return that 2D array to the program. 
The initial 2D array should be populated with a single space “ “. 

 */
public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        int middleOfSnowflake = size / 2;
        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
            grid[i][j] = " ";
          }
        }
        //middle cross
        for (int m = 0; m < size; m++) {
          grid[m][middleOfSnowflake] = "*";
          grid[middleOfSnowflake][m] = "*";
        }

        //diagonals
        for (int d = 0; d < size; d++) {
          grid[d][d] = "*";
        }

        for (int d = 0; d < size; d++) {
          grid[d][size - d - 1] = "*";
        }

        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        for (int i = 0; i < snowflake.length; i++) {
          for (int j = 0; j < snowflake.length; j++) {
            System.out.print(snowflake[i][j]);
          }
          System.out.println();
        }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      String[][] snowflake = generateSnowflake(7);
      printSnowflake(snowflake);
    }
}
