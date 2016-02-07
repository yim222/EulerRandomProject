package fateProgram;

import java.util.ArrayList;

public class FateDraft extends ReadyMethods {
	 
	public static void programExecutionDraft(){
		ArrayList<Integer> rnd = new ArrayList<Integer>();
		
		
		rnd = rangeNumbersToList(25, 50);
		System.out.println("Primary list:\n" + rnd);
		rnd.addAll(someNumbersToList(93,14 ,101, 26, 45 ,99));
		System.out.println("List after adding some numbers : \n" + rnd);
		rnd = excludeNumbers(rnd, 38,43);
		System.out.println("List after exculding specific range: \n" + rnd);
		rnd = excludeNumbers(rnd, 27,29,31);
		System.out.println("List after excluding some numbers" + rnd);
		rnd = chooseNRandoms(rnd, 3);
		System.out.println(); 
		System.out.println("This is the generated Randoms: \n" +rnd);
		
	}
	
	public static void programExecutionDraftWithIO(){
		ArrayList<Integer> rnd = new ArrayList<Integer>();
		//System.out.println(rnd);
		System.out.println("Enter start number for the range");
		//..
		System.out.println("Enter end number for the range");
		//..
		System.out.println("This is the list:");
		//...
		
		System.out.println("Enter  range to exclude from the list\n start : ");
		
		//...
		System.out.println("end:");
		//..
		rnd = rangeNumbersToList(25, 50);
		//System.out.println(rnd);
		System.out.println("Enter single numbers to add to the list seperated by ,:");
		//... ?? how to
		
		rnd.addAll(someNumbersToList(93,14 ,101, 26, 45 ,99));
		
		//System.out.println(rnd);
		
		System.out.println("enter range to exclude");
		//...
		rnd = excludeNumbers(rnd, 38,43);
		
		//System.out.println(rnd);
		
		System.out.println("enter single numbers to exclude:");
		//...
		rnd = excludeNumbers(rnd, 27,29,31);
		//System.out.println(rnd);
		
		System.out.println("enter the amount of randoms u want to generate. ");
		//...
		//System.out.println(rnd); 
		
		System.out.println("This is your original list:");
		//...
		rnd = chooseNRandoms(rnd, 3);
		
		System.out.println("And this is the generated randoms:");
		System.out.println(rnd);
		
	}
	
	public static void main(String[] args) {
		
		programExecutionDraft();
		programExecutionDraftWithIO();
		
	}
	

}
