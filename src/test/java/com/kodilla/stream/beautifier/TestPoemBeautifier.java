package com.kodilla.stream.beautifier;

import org.junit.Assert;
import org.junit.Test;

public class TestPoemBeautifier {
    @Test
    public void testPoemBeautifier() {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String name = "Janek";

        String result = poemBeautifier.beautify(() -> name);
        String result1 = poemBeautifier.beautify(() -> name + "ABC");
        String result2 = poemBeautifier.beautify(() -> name.toUpperCase());
        String result3 = poemBeautifier.beautify(() -> name.toLowerCase());
        String result4 = poemBeautifier.beautify(() -> name.replace('J','R'));
        String result5 = poemBeautifier.beautify(() -> name.substring(2,3));

        Assert.assertEquals("Janek",result);
        Assert.assertEquals("JanekABC",result1);
        Assert.assertEquals("JANEK",result2);
        Assert.assertEquals("janek",result3);
        Assert.assertEquals("Ranek",result4);
        Assert.assertEquals("n",result5);
    }
}
