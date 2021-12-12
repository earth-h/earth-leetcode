class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String operation: operations) {
            x = operation.charAt(1) == '+' ? x + 1 : x - 1;
        }
        return x;
    }
}