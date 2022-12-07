import org.example.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {
    @Test
    @DisplayName("Should return 1")
    void returnAsItShould(){
        Assertions.assertEquals("1", FizzBuzz.fizzbuzz(1));
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "4, 4", "11, 11", "14, 14"})
    @DisplayName("Given a number return it as a string")
    void returnNumberAsString(String number, int input){
        Assertions.assertEquals(number, FizzBuzz.fizzbuzz(input));
    }
    @Test
    @DisplayName("Given a number divisible by 3, return Fizz")
    void givenThree_Return_Fizz(){
        Assertions.assertEquals("Fizz", FizzBuzz.fizzbuzz(9));
    }
    @ParameterizedTest
    @ValueSource(ints = {3, 9, 18, 21, 33})
    @DisplayName("Given numbers divisible by 3 but not 5 return Fizz")
    void givenANumberDivisibleByThreeButNotFive_Return_Fizz(int input){
        Assertions.assertEquals("Fizz", FizzBuzz.fizzbuzz(input));
    }
    @Test
    @DisplayName("Given number divisible by 3 return Buzz")
    void givenFive_Return_Buzz(){
        Assertions.assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
    }
    @ParameterizedTest
    @ValueSource(ints = {5, 20, 25, 65, 125})
    @DisplayName("Given numbers divisible by 5 but not 3 return Fizz")
    void givenANumberDivisibleByFiveButNotThree_Return_Buzz(int input){
        Assertions.assertEquals("Buzz", FizzBuzz.fizzbuzz(input));
    }

    @Test
    @DisplayName("Given number 15, return FizzBuzz")
    void givenFifteen_Return_FizzBuzz(){
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 45, 60, 90, 150})
    @DisplayName("Given number divisible by 3 and 5, return FizzBuzz")
    void givenANumberDivisibleByFifteen_Return_FizzBuzz(int input){
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(input));
    }
}
