class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> noArr2 = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[arr1.length];
        for(int arr: arr2) {
            map.put(arr, 0);
        }
        for(int arr: arr1) {
            if(map.containsKey(arr))
                map.put(arr, map.get(arr) + 1);
            else
                noArr2.add(arr);
        }
        Collections.sort(noArr2);
        int idx = 0;
        for(int arr: arr2) {
            for(int i = 0; i < map.get(arr); i++)
                result[idx++] = arr;
        }
        for(int i: noArr2)
            result[idx++] = i;
        return result;
    }
}