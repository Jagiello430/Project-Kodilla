package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    private boolean win = false;
    private int computerScore = 0;
    private int playerScore = 0;
    private int round = 0;
    private int playerTurn;
    private int computerTurn;

    public static void main(String[] args) {
        RpsRunner rpsRunner = new RpsRunner();

        rpsRunner.gameRules();
        rpsRunner.game();
    }

    public static void gameRules(){
        System.out.println("Game rules :" + "\n" +
                "Button 1 - \"Rock\",\n" +
                "Button 2 - \"Paper\",\n" +
                "Button 3 - \"Scissors\",\n" +
                "Button 0 - End of the game \n" + "\n");
    }

    public void game() {
        while (!win) {
            round++;
            System.out.println("Runda: " + round + "\n" + "Score" + "\n" +
                    "Computer: " + computerScore + " Player: " + playerScore +
                    "\n");
            System.out.println("Select the button to play: ");
            playerChoice();
            computerChoice();
            score();
            finalMassage();
            exit();
        }
    }
    public CHOICES playerChoice(){
        playerTurn = scanner.nextInt();

        switch (playerTurn){
            case 1 :
                return CHOICES.ROCK;
            case 2 :
                return CHOICES.PAPER;
            case 3 :
                return CHOICES.SCISSORS;
            case 0 :
                exit();
        }
        return playerChoice();
    }

    public CHOICES computerChoice(){
        computerTurn = random.nextInt(3) + 1;

        switch (computerTurn){
            case 1 :
                return CHOICES.ROCK;
            case 2 :
                return CHOICES.PAPER;
            case 3 :
                return CHOICES.SCISSORS;
        }
        return computerChoice();
    }

    public RESULT result(){
        if (computerTurn == playerTurn) {
            System.out.println("Draw");
            return RESULT.DRAW;
        }
        switch (playerTurn){
            case 1:
                return (computerChoice() == CHOICES.SCISSORS ? RESULT.WIN : RESULT.LOSE);
            case 2:
                return (computerChoice() == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
            case 3:
                return (computerChoice() == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);
        }
        return RESULT.LOSE;
    }

    public int score(){
        switch (result()){
            case WIN:
                System.out.println("Player won this round");
                return playerScore ++;
            case LOSE:
                System.out.println("Computer won this round");
                return computerScore++;
        }
        return 0;
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
        if (playerTurn == 0) {
            playerTurn = scanner.nextInt();
            System.out.println("Are you sure you want to finish the game??" + "\n" +
                    "If you want to end the game press 0");
            int finish = scanner.nextInt();
            if (finish == 0) {
                 win = true;
            }else {
                win = false;
            }
        }
    }
}
