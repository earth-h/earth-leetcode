class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /**
        * target - numbers[i] > numbers[i] -> GO
        * target - numbers[i] <= numbers[i] -> Continue
        */
        for(int i = 0; i < numbers.length; i++) {
            int cnt = target - numbers[i];
            if(cnt >= numbers[i]) {
                for(int j = i + 1; j < numbers.length; j++) {
                    if(cnt < numbers[j])
                        break;
                    else if(cnt == numbers[j])
                        return new int[] {i + 1, j + 1};
                }
            } else continue;

        }
        return new int[2];
    }
}