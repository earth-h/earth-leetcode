class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        int curPowIdx = 0;
        int curPowNum = 1; // 2의 거듭제곱 현재 값
        
        result[0] = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i == Math.pow(2, curPowIdx)) { // 2의 거듭제곱이면 1
                result[i] = 1;
                curPowIdx +=1 ;
                curPowNum = i;
            } else {
                result[i] = result[curPowNum] + result[i - curPowNum];
            }
        }
        return result;
    }
}