package project;
import java.util.Random;
import java.util.Scanner;
class Game{
	public int number;
	public int noOfguesses=0;
    public int inputNumber;
public int getNoOfGuesses() {
	return noOfguesses;
	
}
public void setNoOfGuesse() {
	this.noOfguesses=noOfguesses;
	
}
Game(){
	Random r=new Random();
	this.number=r.nextInt(100);
}
void UserInput() {
	System.out.println("Guess the number");
	Scanner sc= new Scanner(System.in);
	inputNumber=sc.nextInt();
	
}
boolean isCorrectNumber() {
	noOfguesses++;
	if(inputNumber==number) {
		System.out.format("Yes you guessed it right,it was %d\nYou guessed it in %d\n attempts",number,noOfguesses);
		return true;
	}
	if(inputNumber>number) {
		System.out.format("Number entered is larger than the number");}
	if(inputNumber<number) {
		System.out.format("Number entered is smaller than the number");}
		return false;
}
}

public class Guesstheno_lec50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g=new Game();
		boolean b=false;
		while(!b) {
			g.UserInput();
			b=g.isCorrectNumber();
		}

	}

}
