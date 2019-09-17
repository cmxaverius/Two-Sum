import java.util.Arrays;

public class TwoSum {
	     public int[] twoSum(int[] nums, int target) {
		 int[] index = new int[2];
		 
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i!=j) {
					if(nums[i]+nums[j]==target){
						index[0]=j;
						index[1]=i;		
					}
				}
			}		
		}
	  return index;	
	 }
	 
	 public static void main(String[] args){
		 int[] myNums = new int[]{2,3,4,7,11,15}; 
		 int myTargetNums = 15;
		 TwoSum idx = new TwoSum();
		 int[] result = idx.twoSum(myNums, myTargetNums);
		 
		 System.out.println(Arrays.toString(result));
		 	 
	 }
}
