import java.util.Random;
import java.util.Scanner;

class dicegame{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.printf("What is your name?\n>");
	String name = sc.next();
	System.out.println("Hello, " + name + "!");

	System.out.println("Rolling Dice...");
	
	Random r = new Random();
	int x = r.nextInt(6) + 1;
	int y = r.nextInt(6) + 1;
	int z = x + y;

	System.out.printf("Dice1: %d\nDice2: %d\nTotal value: %d\n",x,y,z);

	if(z>7){
	    System.out.println(name + " won!");
	}
	else{
	    System.out.println(name + " lost!");
	}
	

    }

}
