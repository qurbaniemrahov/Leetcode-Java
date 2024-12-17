class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Correct answer: Indexes " + i + " and " + j);
                    return new int[]{i, j}; 
                }
            }
        }
        System.out.println("No solution found.");
        return new int[]{}; 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 2, 5, 4}; 
        int target = 9; 
        int[] result = solution.twoSum(nums, target); 
        
        if (result.length > 0) {
            System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
        }
    }
}
