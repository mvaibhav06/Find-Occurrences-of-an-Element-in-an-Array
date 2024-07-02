class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        Map<Integer,List<Integer>> temp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            List<Integer> mylist = new ArrayList<>();

            if(temp.containsKey(nums[i])){
                mylist = temp.get(nums[i]);
            }
            mylist.add(i);
            temp.put(nums[i], mylist);
        }

        int[] out = new int[queries.length];
        List<Integer> list = temp.get(x);
        for(int i=0; i<queries.length; i++){
            if(list==null || queries[i] > list.size()){
                out[i] = -1;
            }else{
                out[i] = list.get(queries[i]-1);
            }

        }
        return out;
    }
}
