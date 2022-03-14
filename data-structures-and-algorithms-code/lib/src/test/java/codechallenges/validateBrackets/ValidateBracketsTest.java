package codechallenges.validateBrackets;

import codechallenges.psuedoQueue.PsuedoQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidateBracketsTest {

    @Test
    void testValidString() throws Exception {
        ValidateBrackets sut = new ValidateBrackets();
        assert(sut.validateBrackets("{{{}}}"));
    }

    @Test
    void testValidStringTwo() throws Exception {
        ValidateBrackets sut = new ValidateBrackets();
        assert(sut.validateBrackets("()[[Extra Characters]]"));
    }

    @Test
    void testNotValidString() throws Exception {
        ValidateBrackets sut = new ValidateBrackets();
        assert(!sut.validateBrackets("{{{}"));
    }

    @Test
    void testSingleString() throws Exception {
        ValidateBrackets sut = new ValidateBrackets();
        assert(!sut.validateBrackets("{"));
    }

}
