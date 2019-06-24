package com.huaxia.algorithms.chapter1_2;

import edu.princeton.cs.algs4.Point2D;

public class Practise1_2_1 {
	
	public static void main(String[] args) {
		int N  = 1000;
		//��������������
		Point2D[] points = new Point2D[N]; 
		//ѭ����������ɵĵ��������
		
		for(int i =0; i<N;i++){
			points[i] = new Point2D(Math.random(),Math.random());
			points[i].draw();
			System.out.println("���ǵ�"+i+"����");
		}
		
		double min = getMinDistance(points);
		System.out.println(min);
		
		
	}
	public static double getMinDistance(Point2D[] points){
		double min = points[0].distanceTo(points[1]);
		for(int i =0;i<points.length-1;i++){
			for(int j =i+1;j<points.length;j++){
				if(points[i].distanceTo(points[j])<min){
					min = points[i].distanceTo(points[j]);
				}
			}
		}
		return min;
	}

}
