package com.assignmentsfunjava;

public class PuzzleJavaTest {
	public static void main(String[] args) {
		PuzzleJava p = new PuzzleJava();
		
//
//		 int[] arr = {3,5,1,2,7,9,8,13,25,32};
//		 int[] newArr = p.reduceArray(arr, 10);
//		 p.sumNums();
//		 p.iterateArray();
		

		 String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		 String[] newNames = p.shuffleNamesArray(names);
		 for (int i = 0; i < newNames.length; i++){
		 	System.out.println(newNames[i]);
		 }

		 //p.letters();

//	   int[] numbers = p.randomNumbers();
//		b.iterateArray(numbers);

		// p.randomSortedNumbers();

//		 String str = p.randomString();
//		 System.out.println(str);

//		 String[] strings = p.randomStrings();
//		 for (int i = 0; i < strings.length; i++){
//			System.out.println(strings[i]);
//		 }
 
	}
}