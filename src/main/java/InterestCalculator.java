import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class InterestCalculator {
    public static HashMap<String, Double> balances = new HashMap<String, Double>();
    private static int x;

    public static void AddBalance(String name, int balance) {
        String index = name;
        if (!balances.containsKey(name)) {
            balances.put(name, 0.0);
        }
        Double number = balances.get(name);
        number = number + balance;
        balances.put(index, number);
    }

    public static void DailyRate(int i) {
        x = i;
    }

    public static void Calculate(Integer[] totalDays) {

        Set<String> keys = balances.keySet();
        //Set<String> mykeys = balances.keySet();

        String[] list = Arrays.asList(keys.toArray()).toArray(new String[keys.toArray().length]);

        double y = totalDays[0];

        for (int i = 0; i < y; i++) {
            for (String key : list) {
                double d = balances.get(key);
                double result = d * x / 100;
                d += result;
                balances.put(key, (Double) d);
            }
        }
    }

    public static double Balance(String str) {
        double x = balances.get(str);
        return x;
    }
}
