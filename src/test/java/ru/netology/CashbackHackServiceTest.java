package ru.netology;


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldRemain100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
      int actual = service.remain(amount);
      int expected = 0;

     assertEquals(actual, expected);
    }

}