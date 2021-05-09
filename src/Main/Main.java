/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.*;

/**
 *
 * @author k_zeb
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = in.nextLine().toUpperCase();

        
        //First Line:
        System.out.print("* ");
        for (int x=0;x<word.length(); x++){
            System.out.print(word.charAt(x)+" ");
        }
        System.out.println("*");

        //Middle Section:
        for (int x=0;x<word.length();x++){
            System.out.print(word.charAt(word.length()-(x+1))+" ");
                for (int x=0;x<word.length();x++){
                System.out.print("* ");
                }
            System.out.println(word.charAt(x));
        
        }
        //Last Line:
        System.out.print("* ");
        for (int x=word.length()-1;x>=0;x--){
            System.out.print(word.charAt(x)+" ");
        }
        System.out.println("*");
    }

    //Finally successful after endless trials!!!!
}