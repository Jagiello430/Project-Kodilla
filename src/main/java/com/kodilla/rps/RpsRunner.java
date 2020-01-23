package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        System.out.println("Zasady gry w papier, kamień i nożyce :" + "\n" +
                "klawisz 1 - zagranie \"kamień\",\n" +
                "klawisz 2 - zagranie \"papier\",\n" +
                "klawisz 3 - zagranie \"nożyce\",\n" +
                "klawisz 0 - zakończenie gry, poprzedzone pytaniem \"Czy na pewno zakończyć grę?\",\n" + "\n");

        int computerScore = 0;
        int playerScore = 0;
        boolean win = false;
        int round = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (!win){
            round ++;
            System.out.println("Runda: " + round + "\n" + "Score"+ "\n" +
                    "Computer: " + computerScore + " Player: " + playerScore +
                    "\n");
            System.out.println("Wybierz znak którym zagrasz: " );
            int playerTurn = scanner.nextInt();
            int computerTurn = random.nextInt(3) + 1;

            if (playerTurn == 1 && computerTurn == 2 ||
                    playerTurn == 2 && computerTurn == 3 ||
                    playerTurn == 3 && computerTurn == 1){
                 computerScore ++;
                System.out.println("komputer wygrał runde");
            }else if (playerTurn == 1 && computerTurn == 1||
                    playerTurn == 2 && computerTurn == 2||
                    playerTurn == 3 && computerTurn == 3){
                System.out.println("Remis");
            }else if(playerTurn == 1 && computerTurn == 3 ||
                    playerTurn == 2 && computerTurn == 1 ||
                    playerTurn == 3 && computerTurn == 2){
                playerScore ++;
                System.out.println("Gracz wygrał runde");
            }else if(playerTurn == 0){
                System.out.println("Czy napewno chcesz zakończyć gre?" + "\n" +
                        "jeśli chcesz zakończyć gre naciśnij 0");
                int finish = scanner.nextInt();
                if (finish == 0){
                    win = true;
                }
            }
            if(computerScore == 3){
                System.out.println("Wygrał komputer!!!"
                        + "\n" + "Score:"+ "\n" +
                        "Computer: " + computerScore + " Player: " + playerScore);
                win = true;
            }else if (playerScore == 3) {
                System.out.println("Wygrałeś!!!" + "\n" + "Score:"+ "\n" +
                        "Computer: " + computerScore + " Player: " + playerScore);
                win = true;
            }
        }
    }
}
