import java.util.Random;

class dicegame{

    public static void main(String[] args){

	System.out.println("Rolling Dice...");
	
	Random r = new Random();
	int x = r.nextInt(6) + 1;
	int y = r.nextInt(6) + 1;
	int z = x + y;

	System.out.printf("Dice1: %d\nDice2: %d\nTotal value: %d\n",x,y,z);

	if(z>7){
	    System.out.println("you won");
	}
	else{
	    System.out.println("you lost");
	}
	

    }

}
