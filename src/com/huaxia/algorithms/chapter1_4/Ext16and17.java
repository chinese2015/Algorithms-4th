package com.huaxia.algorithms.chapter1_4;

import java.util.Arrays;

public class Ext16and17 {
	
	public static void getLeastDifferencePair (int[] nums){
		//归并排序时间成本为NlnN
		Arrays.sort(nums);
		int leastDifference = Math.abs(nums[0]-nums[1]);
		int flag = 0;
		//遍历时间成本为N
		for(int i=0;i<nums.length-1;i++){
			if(leastDifference>Math.abs(nums[i]-nums[i+1])){
				leastDifference=Math.abs(nums[i]-nums[i+1]);
				flag = i;
			}
		}
		System.out.println("MinDiffer:"+nums[flag]+","+nums[flag+1]);
		
		
		
	}
	public static void getMaxDifferencePair(int[] nums){
		
		//定义最小值和最大值后,直接遍历,若当前值比最小值小或最大值大,则更新最大值或最小值
		int[] a =nums;
		int min = a[0];
		int max = a[1];
		for(int i =0;i<nums.length;i++){
			if(a[i]>max){
				max=a[i];
			}else if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("MaxDiff:"+min+","+max);
	}
	public static void main(String[] args) {
		int[] arrs = {-2,3,55,46645,32223,1,244,9999};
		getLeastDifferencePair(arrs);
		getMaxDifferencePair(arrs);
	}

}
