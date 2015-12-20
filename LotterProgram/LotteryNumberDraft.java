package helper;

import java.util.Random;

public class LotteryNumberDraft {
	
	static Random random = new Random();
	static public int bound = 10;
	static public int[] numbers = {6,8,22,88,15,73,43,34};
	
	
	//ctor.
	public  LotteryNumberDraft(){
		
	}
	
	public static  void check(){
		
				
		System.out.println("\nRandom value-");
		
		System.out.println(random.nextInt());
		
	}
	
	//method for return and output specific amount of Randoms
	
	public static int[] choosedNumbers(int amount){
		
		int[] numbers = new int[amount];
		                        
		for(int i =0; i< numbers.length;i++){
			
			numbers[i] = random.nextInt(bound);
			//case for identify number is needed here!!!
			System.out.print(numbers[i] +" ");
		}
		return numbers;
	}
	//how to do manual choosing? - it's not for now
	
	//let's try first between 5-10. use choosenumber(4) for good testing-it's problem the method don't defined good
	
	public static void rangeRandom2(int min, int max){
		
		
		//int x = random.nextInt(min )+min+1;this only good to 5-10. not to other ranges. 
		
		//maybe possible with recusion - yeah it's work 
		int x = new Random().nextInt(max+1);//because I want that max will be "include". 
		
		if(x < min){
			rangeRandom(min, max);
			return;
		}
		
		System.out.println("random between "/*+min+" to "+max*/+" = "+x); 
		
		
		
	}
	
	//Ok- this is the math smart way. 
	public static void rangeRandom(int min, int max ){
		
		int x = new Random().nextInt(max - min );
		x += min;
		System.out.println(x);
		
		
	}
	
	
	public static void chooseFromArray(int[] numbers){
		//for the good order I love to make local of the length
		int length = numbers.length;
		int index = new Random().nextInt(length);//not needed -1 because it's not include anyway!!!
		System.out.println("the random is  :"+numbers[index]);
		
	}
	
	
	
	public static void main(String[] args) {
		
		//6,8,22,88,15,73,43,34
		for(int i =0;i<=50;i++){
			chooseFromArray(numbers);
		}
		
		//new Random().nextInt(bound);
	}
	
	

}
