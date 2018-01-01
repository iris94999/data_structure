package leetcode;

import java.util.HashMap;

public class twoSum {
	
	public static int[] TwoSum(int[] nums, int target){
		if(nums == null || nums.length < 2){
			return new int[]{-1,-1};
		}
		
		int[] res = new int[]{-1,-1};
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(target - nums[i])){
				res[0] = map.get(target - nums[i]);
				res[1] = i;
				break;
			}
			map.put(nums[i],i);
		}
		return res;
	}
	public static void main(String[] args){
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] res = TwoSum(nums,target);
		System.out.println(res[0]+","+res[1]);
	}
}
