class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int arr : arr1)
        {
            map.put(arr, map.getOrDefault(arr,0)+1);
        }
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int arr : arr2)
        {
            map1.put(arr, map1.getOrDefault(arr,0)+1);
        }
        int[] arr1_dup = new int[arr1.length];
        int j = 0;
        for(int i=0;i<arr2.length;i++)
        {
            if(map.containsKey(arr2[i]))
            {
                int k = 0;
                int n = map.get(arr2[i]);
                while(k < n)
                {
                    arr1_dup[j++] = arr2[i];
                    k++;
                }
            }
        }
        ArrayList<Integer> num = new ArrayList<>();
        for(int i : arr1)
        {
            if(!map1.containsKey(i))
            {
                num.add(i);
            }
        }
        Collections.sort(num);
        for(int i=j;i<j+num.size();i++)
        {
            arr1_dup[i] = num.get(i-j);
        }
        return arr1_dup;
    }
}