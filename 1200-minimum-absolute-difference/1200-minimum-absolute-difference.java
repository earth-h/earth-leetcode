class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minDis = 2000002;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] - arr[i] < minDis) {
                result = new ArrayList<>();
                List<Integer> curPair = new ArrayList<>(Arrays.asList(arr[i], arr[i + 1]));
                result.add(curPair);
                minDis = arr[i + 1] - arr[i];
            } else if(arr[i + 1] - arr[i] == minDis) {
                List<Integer> curPair = new ArrayList<>(Arrays.asList(arr[i], arr[i + 1]));
                result.add(curPair);
            }
                
        }
        
        return result;
    }
}