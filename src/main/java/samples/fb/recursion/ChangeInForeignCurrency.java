package samples.fb.recursion;

import java.util.HashMap;
import java.util.Map;

public class ChangeInForeignCurrency {

    Map<Integer, Boolean> memo = new HashMap<>();

    boolean canGetExactChange(int targetMoney, int[] denominations) {
        // Write your code here
        memo = new HashMap<>();
        return checkSum(targetMoney, denominations, 0);
    }

    boolean checkSum(int target, int[] denominations, int value) {
        if (target == value) {
            return true;
        }

        if (value > target) {
            return false;
        }

        if (memo.containsKey(value)) {
            // already checked this value
            return false;
        }

        boolean found = false;
        for (int deno : denominations) {
            found = checkSum(target, denominations, value + deno);
            if (found) {
                memo.put(value, true);
                return true;
            }
        }
        memo.put(value, false);

        return false;
    }



}
