package ProblemsDay_231;

public class PartitionArrayIntoThreePartsEqualSum {

    //https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/?envType=problem-list-v2&envId=array
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int n: arr) {
            sum += n;
        }

        if (sum % 3 != 0) {
            return false;
        }

        int target = sum / 3;
        int currentSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            currentSum += arr[i];
            if (currentSum == target) {
                currentSum = 0;
                count++;
                if (count == 2) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
