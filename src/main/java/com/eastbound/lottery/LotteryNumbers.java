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
    ArrayList<Integer> lottoDraw = new ArrayList();
    ArrayList<Integer> matchingNumbers = new ArrayList();

    public void LotteryNumbers() {
    }

    public static void main(String[] args) {
        LotteryNumbers game = new LotteryNumbers();
        Player player = new Player();
        game.lottoNumbers();
        player.pickNumbers();
        game.results(player.getPlayerNumbers());
    }

    private void lottoNumbers() {
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
    }

    private void results(ArrayList<Integer> selected) {
        for (int playerNum : selected) {
            for (int lotteryNum : lottoDraw) {
                if (playerNum == lotteryNum) {
                    matchingNumbers.add(playerNum);
                }
            }
        }

        System.out.println("The winning numbers are: " + lottoDraw);
        System.out.println("Matching numbers are: " + matchingNumbers);
    }
}
