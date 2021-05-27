package demo.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {


    @Test
    public void shouldReturn5(){
        // GIVEN
        Calc calc = new Calc();
        int a = 3;
        int b = 2;

        // WHEN
        int sum = calc.sum(a, b);

        // THEN
        Assertions.assertEquals(5, sum);
    }
}