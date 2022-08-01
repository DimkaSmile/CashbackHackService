package ru.netology.service;

import org.junit.Test;
//import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
//import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldCashbackHackService() {

        int expected = 100;
        int actual = cashbackHackService.remain(900);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackHackService2() {

        int expected = 200;
        int actual = cashbackHackService.remain(800);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackHackService3() {

        int expected = 1;
        int actual = cashbackHackService.remain(999);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackHackService4() {

        int expected = 1000;
        int actual = cashbackHackService.remain(0);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldCashbackHackService5() {

        int expected = 1000;
        int actual = cashbackHackService.remain(1000);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldCashbackHackService6() {

        int expected = 999;
        int actual = cashbackHackService.remain(1);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldCashbackHackService7() {

        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        assertEquals(expected, actual);
    }
}