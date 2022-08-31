import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {

    @Test
    void fizzbuzzTest () {

        //given

        int[] number = {15,30};

        for (int i = 0; i < number.length; i++) {

            //when

            String actual = Fizzbuzz.fizzbuzz(number[i]);

            //then

            assertEquals("fizzbuzz", actual);

        }
    }

    @Test
    void buzzTest () {

        //given

        int[] number = {5,10,20,25};

        for (int i = 0; i < number.length; i++) {

            //when

            String actual = Fizzbuzz.fizzbuzz(number[i]);

            //then

            assertEquals("buzz", actual);

        }
    }

    @Test
    void fizzTest () {

        //given

        int[] number = {3,6,9,12,18,21,24,27};

        for (int i = 0; i < number.length; i++) {

            //when

            String actual = Fizzbuzz.fizzbuzz(number[i]);

            //then

            assertEquals("fizz", actual);

        }
    }

    @Test
    void numberTest () {

        //given

        int[] number = {1,2,4,7,8,11,13,14,17,19,22,23};

        for (int i = 0; i < number.length; i++) {

            //then

            String actual = Fizzbuzz.fizzbuzz(number[i]);

            //when

            assertEquals(String.valueOf(number[i]), actual);
        }

    }
}
