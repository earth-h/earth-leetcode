// class Solution {
//     public boolean canMakeArithmeticProgression(int[] arr) {
//         Arrays.sort(arr);
//         for(int i = 2; i < arr.length; i++) {
//             if(arr[i] - arr[i - 1] != arr[i - 1] - arr[i - 2])
//                 return false;
//         }
//         return true;
//     }
// }
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int min = 1000000, max = -1000000;
        for(int a: arr) {
            min = min > a ? a : min;
            max = max < a ? a : max;
        }
        
        if((max - min) % (arr.length - 1) != 0) return false; // 같은 텀으로 나열 불가
        int step = (max - min) / (arr.length - 1);
        if(step == 0) return true; // [0, 0, 0]
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if ((num - min) % step != 0) return false; // step의 배수로 증가해야 하므로
            if (!set.add(num)) return false; // 기존에 set에 존재하는 item을 넣으려하면 add 메소드는 false를 리턴함
        }
        return true;
    }
}