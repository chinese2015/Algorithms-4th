package com.huaxia.algorithms.chapter1_4;

import java.util.Arrays;

public class Ext16and17 {
	
	public static int[] getLeastDifferencePair (int[] nums){
		//�鲢����ʱ��ɱ�ΪNlnN
		Arrays.sort(nums);
		int leastDifference = Math.abs(nums[0]-nums[1]);
		int flag = 0;
		//����ʱ��ɱ�ΪN
		for(int i=0;i<nums.length-1;i++){
			if(leastDifference>Math.abs(nums[i]-nums[i+1])){
				leastDifference=Math.abs(nums[i]-nums[i+1]);
				flag = i;
			}
		}
		return {nums(flag),nums(flag+1)};
		
		
	}

}
