import org.example.Numbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumbersTest {
    @Test
    @DisplayName("Testing if function returns sum of integer arrays")
    void sumOfArray(){
        int expected = 15;
        int [] values = {1,2,3,4,5};
        int result = Numbers.SumOfIntegers(values);
        Assertions.assertEquals(expected, result);
    }
}
