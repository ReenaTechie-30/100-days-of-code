class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer>list=new ArrayList<>();
            int[] result =new int[n*2];
             for (int i=0;i<n;i++)
           {
              result[2*i]=nums[i];
              result[2*i+1]=nums[i+n];
            }
        return result;
    }
}
