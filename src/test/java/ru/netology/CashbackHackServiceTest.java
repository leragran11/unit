package ru.netology;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfAmountCorrect() {
        int amount = 5700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountIncorrect() {
        int amount = -50000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}