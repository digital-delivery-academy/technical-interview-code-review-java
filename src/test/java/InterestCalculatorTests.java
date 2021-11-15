import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterestCalculatorTests {

    // Daily rate = 3
    // 
    @Test
    public void test1() {
        InterestCalculator.AddBalance("joe", 100);
        InterestCalculator.DailyRate(3); // percent
        InterestCalculator.AddBalance("jane", 4000);

//		InterestCalculator.Calculate(new TimeSpan(20, 0, 0, 0)); 
        InterestCalculator.Calculate(new Integer[] {20, 0, 0}); // days , minutes, hours

        assertEquals(180.61, InterestCalculator.Balance("joe"), 0.005);
        assertEquals(7224.44, InterestCalculator.Balance("jane"), 0.005);
    }
} 