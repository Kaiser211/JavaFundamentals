package com.assignmentsfunjava;

import java.util.ArrayList;
import java.lang.RuntimeException;

	public class Exceptions {
		public static void main(String[] args) {
			
			// Create ArrayList

			ArrayList<Object> myList = new ArrayList<Object>();
			myList.add("13");
			myList.add("hello world");
			myList.add(48);
			myList.add("Goodbye World");
			
			// Try to cast each element to an Integer
			// Use try/catch blocks to handle the exceptions

			
			for (int i = 0; i < myList.size(); i++){
				try {
					Integer castedValue = (Integer) myList.get(i);
				} catch (ClassCastException e){
					System.out.println("ERROR ON INDEX {" + i + "}");
					System.out.println(e.getMessage());
				}
			}

			// Remove try/catch blocks and use generics to prevent compilation

			/*
			ArrayList<Integer> myList = new ArrayList<Integer>();
			myList.add("13");
			myList.add("hello world");
			myList.add(48);
			myList.add("Goodbye World");
		
			for (int i = 0; i < myList.size(); i++){
				Integer castedValue = myList.get(i);
			}
			*/
		}
	}

