package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTest {

    @Test
    void expected_result_should_be_zero() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 1000;
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void expected_result_should_be_thousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 1000;
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    void expected_result_should_be_one() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 1000;
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void expected_result_should_be_three_hundred() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 2000;
        int amount = 700;
        int actual = cashbackHackService.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);
    }
}
