class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int num = arr[1] - arr[0];
        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i + 1] - arr[i] != num)
                return false;
        }
        return true;
    }
}