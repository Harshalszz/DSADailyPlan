package ProblemsDay_94;

public class MaximumStrongPairXORI {

    //https://leetcode.com/problems/maximum-strong-pair-xor-i/?envType=problem-list-v2&envId=trie

    public int maximumStrongPairXor(int[] nums) {

        int max=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(Math.abs(nums[i]-nums[j])<= Math.min(nums[i],nums[j]))
                {
                    int sum= nums[i]^nums[j];
                    max=Math.max(sum,max);
                }
            }
        }

        return max;

    }

    public static void main(String[] args) {

    }
}
