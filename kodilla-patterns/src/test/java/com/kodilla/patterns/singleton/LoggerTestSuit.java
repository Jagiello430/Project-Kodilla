package com.kodilla.patterns.singleton;

import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuit {

    @BeforeClass
    public static void log() {
        Logger.getInstance().log("jagiello");
    }
    @Test
    public void getLastLogTest() {
        Logger.getInstance().getLastLog();
    }
}
