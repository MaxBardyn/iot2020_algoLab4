package lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testFindClothesForCeremonialReception() {
        var input = FileReaderAndWriter.reader();
        var counter = Algorithm.startGame("crates", input);
        assertEquals(6, counter);
    }
}
