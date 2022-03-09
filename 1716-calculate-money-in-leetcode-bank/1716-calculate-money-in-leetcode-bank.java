class Solution {
    public int totalMoney(int n) {
        int money = 0;
        for(int i = 0; i < n; i++) {
            money += (i % 7 + i / 7 + 1);
        }
        return money;
    }
}