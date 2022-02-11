import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleClassTest {

    @Test
    void twoPlusTwoEqualsFour() {
        var obj = new SampleClass();
        assertEquals(4, obj.add(2, 2));
    }

    @Test
    void twoPlusOneEqualsThree() {
        var obj = new SampleClass();
        assertEquals(3, obj.add(2, 1));
    }
}