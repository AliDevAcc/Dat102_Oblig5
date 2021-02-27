package no.hvl.dat102;

import java.util.Random;

public class KlientBSTre {

	/**
	 * @param args
	 */
	
	
	private static int minHoyde(int n) {
		return n/2;
	}
	
	private static int maksHoyde(int n) {
		return n-1;
	}
	
	public static void main(String[] args) {
		final int ANTALL_NODER = 1024;
		final int ANTALL_TRE = 100;
		
		Random  tilfeldig = new Random();
		
		int maks= 0, min= ANTALL_NODER, samleth=0;
		
		for (int i =0; i < ANTALL_TRE; i++) {
		
		KjedetBinaerSokeTre bstre = new KjedetBinaerSokeTre();
		for(int j =0; j < ANTALL_NODER;  j++ ) {	
		int tall=tilfeldig.nextInt();
			bstre.leggTil(8192);
		}
		
		int h= bstre.hoyde();
		if (h > maks) {
			maks=h;
		}
		
		if( h < min) {
			min=h;
		}
		
		samleth=samleth + 1;
		
		
		}
		
		
		System.out.println("Kalkulert på papir og svaret ble 0.1103510627");
		double c=0.1103510627;
		
		

		
		double hoydeEx=c*8192;
		
		int snitt = samleth/ANTALL_TRE;

		
	System.out.println("i) " + ANTALL_NODER);
	System.out.println("ii) " + minHoyde(ANTALL_NODER));
	System.out.println("iii) " + maksHoyde(ANTALL_NODER));
	System.out.println("iv) " + min);
	System.out.println("v) " + maks);
	System.out.println("vi) " + snitt);
	System.out.println("c) " + hoydeEx + ",  Mån får forskjell svar mellom de forskjellige metodene");

	
	
	}
}
