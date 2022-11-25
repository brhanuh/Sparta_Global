import org.example.IsPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTest {
    @ParameterizedTest
    @ValueSource (strings = {"Hannah", "Race Car!!!"," ", "MoM"})
    public void isPalindrome(String input){
        Boolean expected = true;
        Boolean result = IsPalindrome.check(input);
        Assertions.assertEquals(expected, result);
    }
}
