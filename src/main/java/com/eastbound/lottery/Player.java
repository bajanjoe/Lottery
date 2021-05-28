/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eastbound.lottery;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author damien
 */
public class Player {

    private int cash = 100;
    private ArrayList<Integer> numbersPicked = new ArrayList();
    private Scanner scanner = new Scanner(System.in);
    private boolean isNumSame = false;
    private int number;

    // Prompt player to pick numbers
    public void pickNumbers() {
        System.out.println("Select your number.");
        number = scanner.nextInt();
        numbersPicked.add(number);
        while (numbersPicked.size() < 6) {
            System.out.println("Select your number.");
            number = scanner.nextInt();
            for (int check : numbersPicked) {
                if (check == number) {
                    System.out.println("You selected that number already.");
                    isNumSame = true;
                    break;
                } else {
                    isNumSame = false;
                }
            }
            if (!isNumSame) {
                numbersPicked.add(number);
            }
        }
        System.out.println("Your selected numbers. " + numbersPicked);
    }

    // Return the numbers player selected
    public ArrayList<Integer> getPlayerNumbers() {
        return numbersPicked;
    }
    
    public int getPlayerCash(){
        return cash;
    }
    
    public void setPlayerCash(int cash){
        this.cash = cash;
    }
}
