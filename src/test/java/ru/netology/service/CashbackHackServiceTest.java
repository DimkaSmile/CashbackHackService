package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldCashbackHackService() {

        int actual = cashbackHackService.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashbackHackService2() {

        int actual = cashbackHackService.remain(800);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashbackHackService3() {

        int actual = cashbackHackService.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashbackHackService4() {

        int actual = cashbackHackService.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCashbackHackService7() {

        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        assertEquals(expected, actual);
    }
}
