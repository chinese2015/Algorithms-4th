package com.huaxia.algorithms.chapter1_4;
/*
 * 
 * 计算已排序的数组中,和为0的整数对数量及三个数的数量,前者为线性级别,后者为平方级别
 * 
 */


public class Ext15 {
	/*
	 * 传入的数组为已排序的数组
	 * 数组第一位与最后一位相加,若为0,cnt++;若小于0,head++,若大于0,tail++
	 */
	public static int twoNumbersCount(int[] nums){
		int length = nums.length;
		int head = 0;
		int tail = length-1;
		int cnt = 0;
		while(tail>head){
			if(nums[head]+nums[tail]<0){
				head++;
			}else if(nums[head]+nums[tail]==0){
				cnt++;
				head++;
				tail--;
			}else if(nums[head]+nums[tail]>0){
				tail--;
			}
		}
		return cnt;
	}
	public static int threeNumbersCount(int[] nums){
		int length = nums.length;
		int tail = length-1;
		int cnt = 0;
		for(int i=0;i<length-2;i++){
			int head = i+1;
			while(tail>head){
				if(nums[head]+nums[tail]+nums[i]<0){
					head++;
				}else if(nums[head]+nums[tail]+nums[i]==0){
					cnt++;
					head++;
					tail--;
				}else if(nums[head]+nums[tail]+nums[i]>0){
					tail--;
				}
			}
		}
		return cnt;
		
	}
	public static void main(String[] args) {
		int[] nums = {-2,-1,0,1,2,3};
		int cnt = twoNumbersCount(nums);
		System.out.println(cnt);
		int cnt1 = threeNumbersCount(nums);
		System.out.println(cnt1);
	}
}
