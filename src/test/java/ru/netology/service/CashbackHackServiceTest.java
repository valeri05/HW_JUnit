package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldCalculatCeashbackHack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void shouldExpectedException() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(expected, actual);
    }
}