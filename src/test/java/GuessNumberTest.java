
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GuessNumberTest {
    public GuessNumber obj;

    @BeforeEach
    public void setup() {
        System.out.println("Instantiating object...");
        obj = new GuessNumber();
    }

    @Test
    public void test1() {

        // Act: execute the method you are testing
        String actual = obj.welcome();

        // Assert: check whether the actual result is equal to the expected result
        String expected = "Hello! What is your name?";
        Assertions.assertEquals(expected, actual); //Go and check for us
    }
}

