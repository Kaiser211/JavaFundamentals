package com.assignmentsfunjava;

import java.util.ArrayList;

public class BasicJava {
	
	public void print1to255() {
		for(int i=1; i<256; i++) {
			System.out.println(i);
		}
	}
	
	public void printOdds1to255() {
		for (int i=1; i<256; i=i+2) {
			System.out.println(i);
		}
	}
	
	public void printSums0to255() {
		int sum =0;
		for(int i=0; i<255; i++) {
			sum+=i;
			System.out.println("New Number: " + i + " Sum: " + sum);
		}
	}
	
	public void iterateArray() {
		int[] arr = {1,3,5,7,9,13};
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public void arrayMax() {
		int [] arr = {-3,-5-7};
		int max = arr[0];
		for (int i =0; i<arr.length; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
	}
	
	public void average() {
		double sum = 0;
		int [] arr ={2,10,3};
		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];
			}
		double avg = sum/ arr.length;
		System.out.println(avg);
	}	
	
//	public void oddArray1to255(){
//        ArrayList<Integer> y = new ArrayList<>();
//
//        for(int i=1;i<= 255;i++){
//            if(i%2 == 1){
//                y.add(i);
//            }
//        }
//	}

	public void oddArray1to255() {
		int[] oddArray;
		oddArray = new int[128];
		for (int i= 0; i< 128; i++) {
			oddArray[i] =i*2+1;
		}
		System.out.println(oddArray);
		for (int i =0; i<oddArray.length; i++) {
			System.out.println(oddArray[i]);
		}
		
	}
	public void greaterThanY() {
		int [] arr= {1, 3, 5, 7};
	   	int y = 3;
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > y) {
				num++;
			}
		}
		System.out.println(num);
	}
	
	public void squareArray() {
		int [] arr ={1, 5, 10, -2};
		for (int i =0; i < arr.length; i++) {
			arr[i] = arr[i]*arr[i];
		}
		//System.out.println(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void replaceNegatives() {
		int [] arr ={1, 5, 10, -2};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				arr[i] = 0;
			}
		}
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void maxMinAvg(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		double sum = arr[0];
		for(int i =0; i < arr.length; i++) {
			sum += arr[i];
			if(arr[i]> max) {
				max = arr[i];		
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		double avg = sum/arr.length;
		System.out.println(" Max: " + max + " Min: " + min + "  Average: " + avg);
		
	}

	public void shiftArray(int[] arr) {
		for(int i = 0; i <= arr.length-2; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-2] = 0;
		System.out.println(arr);
		
		for(int i = 0; i< arr.length+1; i++) {
			System.out.println(arr[i]);
		}
	}


}











