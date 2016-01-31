package src;

public class Player {

	private String name;
	private Game[] games;
	
	private Player(int games, String name){
		this.name = name;
		this.games = new Game[games];
		
		for(int i = 0; i < games; i++){
			this.games[i] = new Game();
		}
	}
	
	private void displayGameNumbers(){
		System.out.println("+++++ Player: " + name + " +++++");
		System.out.println();
		for(int i = 0; i < games.length; i++){
			int[] actualNumbers = games[i].getNumbers().clone();
			System.out.println("Game #" + (i+1));
			System.out.println();
			for(int j = 0; j < 6; j++){
				System.out.println("(" + (j+1) + ")   =   " + actualNumbers[j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Player test = new Player(30, "Tossmann");
		test.displayGameNumbers();
	}
}
