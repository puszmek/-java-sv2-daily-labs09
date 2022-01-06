package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void testEncrypts(){
        Encryption encryption = new Caesar(13);
        String word = encryption.encrypts("alma");
        assertEquals("NYZN", word);
    }
}