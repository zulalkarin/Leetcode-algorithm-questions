import java.util.HashMap;

class Solution {
   	 public static int[] twoSum(int[] nums, int target) {
		 HashMap map = new HashMap();  //value : index
		 int[] solution = new int[2];
		 
		 for(int i =0; i<nums.length; i++) {
			 int neededNumber = target-nums[i];
			 if(map.containsKey(neededNumber)) {
				 solution[0] = (int)map.get(neededNumber);
				 solution[1] = i;
				 break;
			 }
			 map.put(nums[i], i);
		 }
         return solution;
		 
	 }

	public static void main(String args[]){
      

	int[] nums = {2,7,11,15};
	int target = 9;

	System.out.println(twoSum(nums, target));


	 }
}