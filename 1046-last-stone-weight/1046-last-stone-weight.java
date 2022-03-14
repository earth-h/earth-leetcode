class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int s: stones)
            pq.add(s);
        while(pq.size() > 1) {
            pq.add(pq.poll() - pq.poll());
        }
        return pq.poll();
    }
}