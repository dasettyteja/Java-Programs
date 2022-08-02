package corejava;

class Solution {
    public Solution(Class<nums[]> class1, int target) {
		// TODO Auto-generated constructor stub
	}

	public int[] twoSum(int[] nums, int target)
    {     
        int arr[]=new int[2];
        for(int i=0;i<=nums.length;i++)
        {
             for(int j=i+1;j<=nums.length;j++)
            if(nums[i]+nums[j]==target)
            {
                arr[1]=i;
                arr[2]=j;
            }  
                
                
        }
     return arr;
        
    }
}



public class Info
{
    public static void main(String args[])
    {
        
        
        int nums[]={2,7,11,15};
        int target = 9;
       
        
        
    }
}