/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double tax = 0;
        double sonk = 0;
        double jillibean = 0;
        String state;
        String temp;

        System.out.println("What is the order amount? ");
        temp = jb.nextLine();
        jillibean = Double.parseDouble(temp);
        System.out.println("What state do you live in? ");
        state = jb.nextLine();

        if(state.equals("Wisconsin")){
            String county;
            System.out.println("What county? (Eau Claire / Dunn) ");
            county = jb.nextLine();
            tax = 0.05;
            if(county.equals("Eau Claire")){
                tax += 0.005;
            }else if(county.equals("Dunn")){
                tax += 0.004;
            }
        }else if(state.equals("Illinois")){
            tax = 0.08;
        }
        sonk = jillibean + (jillibean * tax);
        System.out.print("Tax: " + money.format(jillibean*tax) + "\nTotal: " + money.format(sonk));
    }
}
