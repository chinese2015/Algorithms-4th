package com.huaxia.algorithms.chapter1_4;

import java.util.Arrays;

public class Ext16and17 {
	
	public static void getLeastDifferencePair (int[] nums){
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
		System.out.println("MinDiffer:"+nums[flag]+","+nums[flag+1]);
		
		
		
	}
	public static void getMaxDifferencePair(int[] nums){
		
		//������Сֵ�����ֵ��,ֱ�ӱ���,����ǰֵ����СֵС�����ֵ��,��������ֵ����Сֵ
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
