import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {

    @Test
        void fizzbuzzTest () {

        //given

        int number = 15;

        //when

        String actual = Fizzbuzz.fizzbuzz(number);

        //then

        assertEquals("fizzbuzz",actual);


    }

    @Test
    void buzzTest () {

        //given

        int number = 5;

        //when

        String actual = Fizzbuzz.fizzbuzz(number);

        //then

        assertEquals("buzz",actual);


    }

    @Test
    void fizzTest () {

        //given

        int number = 3;

        //when

        String actual = Fizzbuzz.fizzbuzz(number);

        //then

        assertEquals("fizz",actual);


    }
}
