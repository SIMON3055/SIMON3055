class Solution {
    public int findDuplicate(int[] nums) {
        
    int i = 0;
    while(i <nums.length)
     {
         int correct = nums[i]-1;
         if(i!=correct && nums[i]!=nums[correct])
         {
             int temp = nums[i];
             nums[i] = nums[correct];
             nums[correct] = temp;             
         }   
        else
        {
            i++;
        }
     }
    
        for(i = 0 ; i < nums.length; i++)
        {
            if(i != nums[i]-1)
                return nums[i];
        }
        return 0;
 }
}