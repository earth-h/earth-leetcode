// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         // 오름차순 + 내림차순
//         for(int i = 1; i < arr.length - 1; i++) {
//             if(arr[i] > arr[i + 1])
//                 return i;
//         }
//         return 0;
//     }
// }
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // 오름차순 + 내림차순
        int left = 0, right = arr.length - 1, middle;
        while(left < right) {
            middle = (left + right) / 2;
            if(arr[middle] > arr[middle + 1])
                right = middle;
            else
                left = middle + 1;
        }
        return left;
    }
}