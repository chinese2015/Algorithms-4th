package com.huaxia.algorithms.chapter1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;

public class Practise1_2_2 {

	public static void main(String[] args) {
		Interval1D[] intervals  = new Interval1D[5];
		for(int i =0;i<5;i++){
			intervals[i] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
		}
		printIntersectIntervals(intervals);
		
		
	}
	
	public static void printIntersectIntervals(Interval1D[] intervals){
		for(int i =0;i<intervals.length-1;i++){
			for(int j = i+1;j<intervals.length;j++){
				if(intervals[i].intersects(intervals[j]));
				System.out.println(intervals[i]+"½»"+intervals[j]);
			}
		}
		
	}
	
}
