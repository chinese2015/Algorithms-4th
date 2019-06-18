package com.huaxia.algorithms.chapter1_1;

public class Practise1_1_13 {
	public static void main(String[] args) {
		//将一个二维数组的杭与列转置
/*		{1,2,3}
		{4,5,6}
		{7,8,9}
		{10,11,12}
		转置成
		{1,4,7,10}
		{2,5,8,11}
		{3,6,9,12}*/
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		martixPrinting(matrix);
		int[][] transposedMatrix = matrixTransposition(matrix);
		martixPrinting(transposedMatrix);
	}
	public static int[][] matrixTransposition(int[][] matrix){
		//新矩阵行数为传入矩阵的列数,则
		int rowsNum = matrix[0].length;
		int colsNum = matrix.length;
		int [][] transposedMatrix = new int[rowsNum][colsNum];
		//遍历并赋值
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				transposedMatrix[j][i]=matrix[i][j];
			}
			
		}
		//最后返回
		return transposedMatrix;
	}
	public static void martixPrinting(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j =0; j<matrix[i].length;j++){
				System.out.println(matrix[i][j]);
			}
		}
	}
}
