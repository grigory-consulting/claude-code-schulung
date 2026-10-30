package de.uebung.setup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RechnerTest {

    @Test
    void addiertZweiZahlen() {
        assertEquals(5, Rechner.summe(2, 3));
    }
}
