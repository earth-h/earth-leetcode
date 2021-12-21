class Solution {
    public int getMaximumGenerated(int n) {
        // //int a = 0, b = 1, c = 0, d = 1, max = 0;
        // int a = 1, b = 1, c = 1, d = 1, max = 0;
        // if (n <= 1)
        //     return n;
        // for(int i = 2; i <= n; i++) {
        //     if(i % 2 == 0) { // 짝수
        //         //c = b;
        //         c = a;
        //         System.out.println("num[i]: " + c);
        //         max = c > max ? c : max;
        //         a = b;
        //         b = c;
        //     } else { // 홀수
        //         d = a + b;
        //         System.out.println("num[i]: " + d);
        //         //d = a + b;
        //         //a = c;
        //         //b = d;
        //         max = d > max ? d : max;
        //         a = b;
        //         b = d;
        //     }
        // }
        // return max;
        int[] nums = new int[n + 1];
        int i = 2, max = 0;
        
        if (n <= 1)
            return n;
        nums[0] = 0; nums[1] = 1;
        while(i <= n) {
            nums[i] = nums[i / 2];
            max = nums[i] > max ? nums[i] : max;
            if(i + 1 <= n) {
                nums[i + 1] = nums[i / 2] + nums[i / 2 + 1];
                max = nums[i + 1] > max ? nums[i + 1] : max;
            }
            i += 2;
        }
        return max;
    }
}