package basic;

public class ControlStructures {
	
	public static void main(String[] args) {
		
		/* 
		 	If & Else  
		 	
		 	Control structures are a way to take decisions based on a certain condition
		 	For example, i could say: 
		 	
		 	IF today is raining outside, i'm going to watch TV series 
		 	ELSE I will take my dog for walk.
		 	
		*/
		
		boolean isRaining = true;
		
		if (isRaining) {
			System.out.println("I'm going to watch TV series");
		} else {
			System.out.println("I will take my dog for walk.");
		}
		 	
		/* 	Else-if
			
			You can use it to add more conditions, for example:
		 	
		 	IF this summer is too hot, I'll eat ice cream
		 	ELSE IF  this summer is not too hot, i'll travel to Florida
		 	ELSE i'm going to stay home
		 	
		*/
		
		int temperature = 45;
		
		if (temperature > 45) {
			System.out.println("I'll eat ice cream");
		} else if (temperature < 45 && temperature > 30) {
			System.out.println("I'll travel to Florida");
		} else {
			System.out.println("I'm going to stay home");
		}
		
	}

}
