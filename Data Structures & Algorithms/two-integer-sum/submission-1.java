class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0; i<nums.length; i++){
            sum.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            if(sum.containsKey(target-nums[i]) && sum.get(target-nums[i]) != i){
                arr[0]=i;
                arr[1]=sum.get(target-nums[i]);
                Arrays.sort(arr);
                break;
            }
        }
        return arr;
    }
}