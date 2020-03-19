package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        final int boundary = 1000;
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void remain1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        final int boundary = 1000;
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    void remain2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        final int boundary = 1000;
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void remain3() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        final int boundary = 1000;
        int amount = 500;

        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }
}
