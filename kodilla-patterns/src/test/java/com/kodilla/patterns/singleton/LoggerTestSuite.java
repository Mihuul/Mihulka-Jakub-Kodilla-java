package com.kodilla.patterns.singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void addLog(){
        logger = Logger.LOGGER;
        logger.log("12:00 - User-Admin - Logged In");
    }

    @Test
    void testGetLastLog(){
        String lastLog = logger.getLastLog();
        assertEquals("12:00 - User-Admin - Logged In", lastLog);
    }
}
