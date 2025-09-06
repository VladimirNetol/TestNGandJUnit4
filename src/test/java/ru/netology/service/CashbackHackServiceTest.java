package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

//import org.junit.Assert;
//import static org.junit.Assert.assertEquals;
//import org.junit.jupiter.api.Assertions;
//import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    public void shouldThousandCalcCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void calcMinCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int actual = service.remain(100);

        assertEquals(actual, expected);
    }
}