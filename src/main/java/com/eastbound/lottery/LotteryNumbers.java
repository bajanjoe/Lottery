/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eastbound.lottery;

/**
 *
 * @author damien
 */
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private boolean isSameNum = false;

    public static void main(String[] args) {
        LotteryNumbers game = new LotteryNumbers();
        game.lottoNumbers();
    }

    private void lottoNumbers() {
        ArrayList<Integer> lottoDraw = new ArrayList();

        //Math.random() * (max - min + 1) + min
        Random random = new Random();
        while (lottoDraw.size() < 6) {
            int num = random.nextInt((1 - 0) + 31) + 1;
            for (int check : lottoDraw) {
                if (check == num) {
                    isSameNum = true;
                    break;
                } else {
                    isSameNum = false;
                }
            }
            if (!isSameNum) {
                lottoDraw.add(num);
            }
        }
        System.out.println("The winning numbers are: ");
        System.out.println(lottoDraw);
    }
}
