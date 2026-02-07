class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> sol=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int complement=target-numbers[i];
            if(sol.containsKey(complement)){
                int[] arr={sol.get(complement)+1,i+1};
                return arr;
            }
            sol.put(numbers[i],i);
        }
        int[] arr=new int[0];
        return arr;
    }
}