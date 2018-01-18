package com.assignmentsfunjava;

 class HumanTest {
	 public static void main(String[] args) {
		Human h = new Human();
		h.regulateTemerature();
		h.startSleeping();
		h.goToWork();
		boolean sleeping = h.isSleeping();
		
		if(sleeping) {
			System.out.println("The human is sleeping");
		}
	}

}
