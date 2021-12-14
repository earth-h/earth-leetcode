class Solution {
    public int fib(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else {
            int first = 0, second = 1, result = 1;
            for(int i = 2; i <= n; i++) {
                result = first + second;
                first = second;
                second = result;
            }
            return result;
        }
    }
}