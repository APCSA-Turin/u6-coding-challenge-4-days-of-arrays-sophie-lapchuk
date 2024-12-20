package com.example.project;
import java.util.Random;
import java.util.Scanner;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};
/*
gradle test –tests “TestDay1”

 */
public static String generateElfName(String name){
    //Scanner scan = new Scanner(System.in);
    String str = "";
    int num = (int) (Math.random() * 5);
    System.out.print("Please enter your name: ");
    //name = scan.nextLine();
    
    if (name.equals("")) {
        throw new IllegalArgumentException("Name cannot be null or empty");
        
    } else {
        str += elf_names[num];
        str += " " + name;
    }
    return str;
    }

    public static void main(String[] args) {
        System.out.println(generateElfName("Nina"));
    }
}