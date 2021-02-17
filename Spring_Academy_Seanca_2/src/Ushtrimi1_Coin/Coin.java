package Ushtrimi1_Coin;

import java.util.Random;

public class Coin {
	
		private final int heads = 0;
		private final int tails = 1;
		
		private int face;
		
		private int numFlips ;
		static int totalNumberOfFlips_for_all=0;
		
		public Coin() {
			numFlips = 0;
		}
		public void flip() {
			Random r = new Random();
			face = r.nextInt(2);
			numFlips++;
			totalNumberOfFlips_for_all++;
		}
		
		public int totalNumberOfFlipsForThisCoin() {
			return numFlips;
		}
		
		public static int totalNumberOfFlipsForALlCoins() {
			return totalNumberOfFlips_for_all;
		}
}
