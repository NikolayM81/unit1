package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
        CashbackHackService service = new CashbackHackService();

        @Test
        public void shouldRemain100() {
            int amount = 900;
            int actual = service.remain(amount);
            int expected = 100;

            Assert.assertEquals(actual, expected);

        }

        @Test
        public void shouldRemain1000() {
            int amount = 0;
            int actual = service.remain(amount);
            int expected = 1000;

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void shouldRemain0() {
            int amount = 1000;
            int actual = service.remain(amount);
            int expected = 0;

            Assert.assertEquals(actual, expected);
        }

}