package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

//import org.junit.Assert;
//import static org.junit.Assert.assertEquals;
//import org.junit.jupiter.api.Assertions;
//import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    public void calcCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(25000);

        assertEquals(actual, expected);
    }

    @Test
    public void calcMinCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }
}