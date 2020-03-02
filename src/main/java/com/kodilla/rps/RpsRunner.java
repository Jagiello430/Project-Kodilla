package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.CHOICES.*;
import static com.kodilla.rps.RESULT.*;

public class RpsRunner {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    private boolean win = false;
    private int computerScore = 0;
    private int playerScore = 0;
    private int round = 0;
    private CHOICES playerTurn;
    private CHOICES computerTurn;

    public static void main(String[] args) {
        RpsRunner rpsRunner = new RpsRunner();
        System.out.println(getPossibleChoice());

        rpsRunner.game();
    }

    public void game() {
        while (!win) {
            round++;
            System.out.println("Runda: " + round + "\n" + "Score" + "\n" +
                    "Computer: " + computerScore + " Player: " + playerScore +
                    "\n");
            System.out.println("Select the button to play: ");
            playerTurn = getMove(scanner.nextInt());
            computerTurn = getMove(random.nextInt(5) + 1);

           /* System.out.println(playerTurn);
            System.out.println(computerTurn);*/

            score();
            finalMassage();
        }
    }
    public int score(){
        switch (result()){
            case WIN:
                System.out.println("Player won this round");
                return playerScore ++;
            case LOSE:
                System.out.println("Computer won this round");
                return computerScore++;
            case ERROR:
                System.out.println("Invalid Button");
        }
        return 0;
    }

    public RESULT result(){
        if (playerTurn == END_OF_THE_GAME) {
            exit();
        }else if (playerTurn.beats(computerTurn)) {
            return WIN;
        }else if(computerTurn.beats(playerTurn)) {
            return LOSE;
        }else
            System.out.println("Draw");
        return DRAW ;
    }

    public void finalMassage() {
        if (computerScore == 3) {
            System.out.println("and defeated the player " + computerScore + " to " +
                    playerScore + " in total" + "\n"+ "Congratulations!!!");
            win = true;
        } else if (playerScore == 3) {
             System.out.println("and defeated the computer " + playerScore + " to " +
                     computerScore + " in total" + "\n"+ "Congratulations!!!");
            win = true;
        }
    }

    public void exit(){
        System.out.println("Are you sure you want to leave the game ??" + "\n" + "if so click Button 0 ");
        playerTurn = getMove(scanner.nextInt());
        if (playerTurn == END_OF_THE_GAME){
            System.exit(0);
        }
    }
}

