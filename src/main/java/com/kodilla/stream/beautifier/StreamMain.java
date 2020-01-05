package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        String name = "Sebastian";

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(() -> name);
        poemBeautifier.beautify(() -> name + "ABC");
        poemBeautifier.beautify(() -> name.toUpperCase());
        poemBeautifier.beautify(() -> name.toLowerCase());
        poemBeautifier.beautify(() -> name.replace('a','r'));
        poemBeautifier.beautify(() -> name.substring(2,5));
    }
}
