class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // 오름차순 + 내림차순
        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1])
                return i;
        }
        return 0;
    }
}