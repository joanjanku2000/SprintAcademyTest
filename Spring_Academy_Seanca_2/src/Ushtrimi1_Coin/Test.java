package Ushtrimi1_Coin;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sa monedha deshironi te shtoni ?");
		int n = input.nextInt();
		Coin total_monedha[] = new Coin[n];
		for (int i = 0;i<n;i++) {
			total_monedha[i] = new Coin();
		}

		
		for (int i = 0; i < n;  i++) 
		{
			System.out.println("Sa here deshironi ta hidhni monedhen "+i);
			int h = input.nextInt();
			int j = 0;
					while(j<h) {
						total_monedha[i].flip();
						j++;
					}
		}
		
		for (int i = 0;i<n;i++) {
			System.out.println("Monedha " + (i+1) +" eshte hedhur "+
						total_monedha[i].totalNumberOfFlipsForThisCoin() + " here.");
		}
		System.out.println("Ne total jane kryer "+Coin.totalNumberOfFlipsForALlCoins() + " hedhje. ;) ");
		input.close();
	}
}