package com.kodilla.rps;

import java.util.*;
import java.util.stream.Collectors;

public enum CHOICES {
   ROCK, PAPER, SCISSORS, LIZARD, SPOCK, END_OF_THE_GAME;

   public static List<CHOICES> beats = new ArrayList<>();

   public static Map<Integer, CHOICES> choicesMove = new HashMap<>();

   static {
      ROCK.beats = List.of(SCISSORS, LIZARD);
      PAPER.beats = List.of(ROCK, SPOCK);
      SCISSORS.beats = List.of(PAPER, LIZARD);
      LIZARD.beats = List.of(SPOCK, PAPER);
      SPOCK.beats = List.of(SCISSORS, ROCK);

      choicesMove.put(1, ROCK);
      choicesMove.put(2, PAPER);
      choicesMove.put(3, SCISSORS);
      choicesMove.put(4, LIZARD);
      choicesMove.put(5, SPOCK);
      choicesMove.put(0, END_OF_THE_GAME);
   }

   public static CHOICES getMove(Integer id) {
      return choicesMove.get(id);
   }

   public static boolean beats(CHOICES e) {
      return beats.contains(e);
   }

   public static String getPossibleChoice() {
      return choicesMove.entrySet().stream()
              .map(entry -> "Button " + entry.getKey() + " - " + entry.getValue())
              .collect(Collectors.joining("\n"));
   }
}