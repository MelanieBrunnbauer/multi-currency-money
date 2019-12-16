package mb.practice.tdd.multicurrencymoney;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MoneyTest {
    @Test
    public void multiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertThat(five.amount, is(10));
    }


}
