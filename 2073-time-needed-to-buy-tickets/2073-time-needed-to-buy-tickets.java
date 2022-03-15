class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int result = tickets[k];
        for(int i = 0; i < k; i++) {
            if(tickets[i] >= tickets[k]) result += tickets[k];
            else result += tickets[i];
        }
        if(tickets[k] != 1) {
            for(int i = k + 1; i < tickets.length; i++) {
                if(tickets[i] >= tickets[k]) result += (tickets[k] - 1);
                else result += tickets[i];
            }
        }
        return result;
    }
}