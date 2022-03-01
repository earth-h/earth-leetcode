class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] oddNum = null;
        int[] evenNum = null;
        if(nums.length % 2 == 0) {
            oddNum = new int[nums.length / 2];
            evenNum = new int[nums.length / 2];
        } else {
            oddNum = new int[nums.length / 2];
            evenNum = new int[nums.length / 2 + 1];
            evenNum[nums.length / 2] = nums[nums.length - 1];
        }
        int idx = 0;
        for(int i = 0; i < nums.length / 2; i++) {
            oddNum[idx] = nums[i * 2 + 1];
            evenNum[idx++] = nums[i * 2];
        }
        
        Arrays.sort(evenNum);
        Integer[] oddNum2 = Arrays.stream(oddNum).boxed().toArray(Integer[]::new);
        Arrays.sort(oddNum2, Collections.reverseOrder());

        idx = 0;
        for(int i = 0; i < nums.length / 2; i++) {
            nums[i * 2] = evenNum[idx];
            nums[i * 2 + 1] = oddNum2[idx++];
        }
        if(nums.length % 2 != 0)
            nums[nums.length - 1] = evenNum[idx];
        return nums;
    }
}