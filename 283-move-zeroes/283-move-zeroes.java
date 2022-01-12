class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for(int num: nums) {
            if(num != 0) 
                nums[idx++] = num; // 맨 앞칸부터 0 아닌값 채우기
        }
        
        while(idx < nums.length) {
            nums[idx++] = 0;
        }
//         int cnt = 0;
//         for(int i = 0; i < nums.length;) {
//             if(nums[i] == 0) {
//                 cnt++;
//                 for(int j = i + 1; j < i + cnt + 1 && j < nums.length; j++) {
//                     //System.out.println("i: " + i + " j: " + j);
//                     if(nums[j] == 0) {
//                         cnt++;
//                         continue;
//                     }
//                     if(j < nums.length) {
//                         nums[j - cnt] = nums[j];
//                         nums[j] = 0;
//                     }
//                 }
//                 System.out.println("cnt: " + cnt);
//                 i += cnt + 1;
//             }
//             else {
//                 if(cnt > 0) {
//                     for(int j = i; j < i + cnt && j < nums.length; j++) {
                        
//                         if(nums[j] == 0) {
//                             cnt++;
//                             continue;
//                         }
//                         System.out.println("nums[j]: " + nums[j] + " nums[j - cnt]: " + nums[j - cnt]);
//                         if(j < nums.length) {
//                             nums[j - cnt] = nums[j];
//                             nums[j] = 0;
//                         }
//                     }
//                 }
//                 i++;
//             }
//         }
    }
}

/*
[0,0,0,0,0,0,0,1,1,1]
[0,1,1,0]
[0,0,1]
[0,1,0,1,0]
*/