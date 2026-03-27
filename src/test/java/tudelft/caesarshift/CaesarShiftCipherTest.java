package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CaesarShiftCipherTest {

    @Test
    void simpleShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("def", cipher.encrypt("abc", 3));
    }

    @Test
    void wrapAroundAlphabet() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("abc", cipher.encrypt("xyz", 3));
    }

    @Test
    void shiftWithSpaces() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("ipmb nvoep", cipher.encrypt("hola mundo", 1));
    }

    @Test
    void negativeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("abc", cipher.encrypt("def", -3));
    }

    @Test
    void invalidCharacters() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("invalid", cipher.encrypt("hola123", 3));
    }
}
