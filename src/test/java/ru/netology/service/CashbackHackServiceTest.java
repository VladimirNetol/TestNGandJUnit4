package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldThousandCalcCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calcMinCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int actual = service.remain(100);

        Assert.assertEquals(expected, actual);
    }
}