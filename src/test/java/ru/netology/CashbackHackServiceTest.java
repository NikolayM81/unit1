package ru.netology;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
        CashbackHackService service = new CashbackHackService();

        @Test
        public void shouldRemain100() {
            int amount = 900;
            int actual = service.remain(amount);
            int expected = 100;

            assertEquals(actual, expected);

        }

        @Test
        public void shouldRemain1000() {
            int amount = 0;
            int actual = service.remain(amount);
            int expected = 1000;

            assertEquals(actual, expected);
        }

        @Test
        public void shouldRemain0() {
            int amount = 1000;
            int actual = service.remain(amount);
            int expected = 0;

            assertEquals(actual, expected);
        }

}