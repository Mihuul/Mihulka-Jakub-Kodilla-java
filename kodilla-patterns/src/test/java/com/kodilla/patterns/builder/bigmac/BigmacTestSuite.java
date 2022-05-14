package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Z sezamem")
                .sauce("1000 wysp")
                .burgers(3)
                .ingredient("Cebula")
                .ingredient("Sałata")
                .ingredient("Ser")
                .build();
        System.out.println(bigmac);

        assertEquals("Z sezamem", bigmac.getBun());
        assertEquals("1000 wysp", bigmac.getSauce());
        assertEquals(3, bigmac.getIngredients().size());
    }

}
