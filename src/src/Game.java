package src;
import java.util.Random;

public class Game {

	private int[] numbers;
	private Random lotto = new Random();
	
	public Game(){
		numbers = new int[6];
		setNumbers();
	}
	
	private void setNumbers(){
		for(int i = 0; i < numbers.length; i++){
			int randomNumber = lotto.nextInt(48)+1;			
			if(!checkNumber(randomNumber)) numbers[i] = randomNumber;
			else i--;
		}
	}
	
	private boolean checkNumber(int number){
		boolean match = false;
		
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] == number) match = true;
		}	
		return match;
	}
	
	public int[] getNumbers(){
		return numbers;
	}
}
