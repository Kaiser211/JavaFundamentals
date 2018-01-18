package com.assignmentsfunjava;

public class StringManipulatorTesting {
	
	public static void main(String[] args) {
		
		StringManipulator iD = new StringManipulator();

        String value = iD.trimAndConcat("    Hello   ", "   World  ");

        System.out.println(value); 

        Integer value1 = iD.getIndexOrNull("Hello", 'K');

        System.out.println(value1); 


        Integer value2 = iD.getIndexOrNull("Hello", "llo");

        System.out.println(value2); 

        String value3 = iD.concatSubstring("Hello", 1, 2, "World");

        System.out.println(value3); 

    }

}
