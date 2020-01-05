package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        String name = "Sebastian";

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(()-> System.out.println(name));
        poemBeautifier.beautify(() -> System.out.println(name + "ABC"));
        poemBeautifier.beautify(() -> System.out.println(name.toUpperCase()));
        poemBeautifier.beautify(() -> System.out.println(name.toLowerCase()));
        poemBeautifier.beautify(() -> System.out.println(name.replace('a','r')));
        poemBeautifier.beautify(() -> System.out.println(name.substring(2,5)));
    }
}
