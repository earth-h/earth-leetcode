class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int curNum = -101;
        int curCnt = 0;
        List<Integer> keyList = new ArrayList<>();
        Arrays.sort(nums);
        for(int num: nums) {
            if(curNum == num) {
                curCnt++;
            } else {
                if(curCnt != 0) {
                    if(map.containsKey(curCnt)) {
                        List<Integer> curList = map.get(curCnt);
                        curList.add(curNum);
                        map.put(curCnt, curList);
                    } else {
                        List<Integer> curList = new ArrayList<>();
                        curList.add(curNum);
                        map.put(curCnt, curList);
                        keyList.add(curCnt);
                    }
                }
                curNum = num;
                curCnt = 1;
            }
        }
        // 마지막 원소 넣기
        if(map.containsKey(curCnt)) {
            List<Integer> curList = map.get(curCnt);
            curList.add(curNum);
            map.put(curCnt, curList);
        } else {
            List<Integer> curList = new ArrayList<>();
            curList.add(curNum);
            map.put(curCnt, curList);
            keyList.add(curCnt);
        }
        
        Collections.sort(keyList); // 오름차순
        int idx = 0;
        for(int key: keyList) { // 작은 키부터 시작
            List<Integer> numList = map.get(key); // key개수만큼 존재하는 원소들 체크
            for(int num = numList.size() - 1; num >= 0; num--) { // 해당 원소들 key개만큼 반복
                for(int i = 0; i < key; i++)
                    nums[idx++] = numList.get(num);
            }
        }
        return nums;
    }
}