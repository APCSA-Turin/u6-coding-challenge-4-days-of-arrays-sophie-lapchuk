
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method 
        //you must return a two dimens ional string array
        String[][] arr = new String [2][names.length];
        int indxNice = 0;
        int indxNaugty = 0;
        for (int i = 0; i < names.length; i++) {
            int num = (int) (Math.random() * 2 + 1);
            if (num == 1) {
                arr[0][indxNice] = names[i];
                indxNice++;
            } 
            else {
                arr[1][indxNaugty] = names[i];
                indxNaugty++;
            }
        }
        return arr;
        
    }

    public static void main(String[] args) {
        String[] names = {"Chloe", "Sophie", "Beep", "Blorp", "Blarp"};
        String[][] result = (nameSort(names));
        

       // Printing the Array
       for (int i = 0; i < 2; i++) {
        for (int j = 0; j < result[i].length; j++) {
            if (result[i][j] != null) {
                System.out.print(result[i][j] + " ");
            }
        }
        System.out.println();
    }
    }
}