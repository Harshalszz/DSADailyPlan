package ProblemsDay_177;

import java.util.HashMap;
import java.util.Map;

public class CanIWin {
//https://leetcode.com/problems/can-i-win/?envType=problem-list-v2&envId=memoization

    private Map<Integer, Boolean> memo;
    private int maxChoosableInteger;
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int sum = maxChoosableInteger * (maxChoosableInteger + 1) / 2;
        if (sum < desiredTotal) return false;  // impossible to reach target
        if (desiredTotal <= 0) return true;    // already satisfied

        this.maxChoosableInteger = maxChoosableInteger;
        memo = new HashMap<>();
        return canWin(0, desiredTotal); // start with empty state
    }

    private boolean canWin(int usedMask, int desiredTotal) {
        if (desiredTotal <= 0) return false; // opponent has already won
        if (memo.containsKey(usedMask)) return memo.get(usedMask);

        for (int i = 1; i <= maxChoosableInteger; i++) {
            int bit = 1 << (i - 1);
            if ((usedMask & bit) != 0) continue; // number already used

            // If I pick i:
            // 1. I win immediately (i >= desiredTotal), OR
            // 2. Opponent cannot win from next state
            if (i >= desiredTotal || !canWin(usedMask | bit, desiredTotal - i)) {
                memo.put(usedMask, true);
                return true;
            }
        }
        memo.put(usedMask, false);
        return false;
    }

    public static void main(String[] args) {

    }
}
