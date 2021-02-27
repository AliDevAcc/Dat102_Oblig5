package no.hvl.dat107;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
public class Hashset {
	public static void main(String[] args) {
		
		HashSet hs= new HashSet();
		int antElement=999999;
		int k=0;
		Integer tabell[]= new Integer[antElement];
		Integer t2[]= new Integer[10000];
		int tall=0;
		for (int i = 0; i < antElement; i++){ 
			// legg tall til i HashSet og tabell 
			   
			tall = (tall + 45713) % 1000000;// Sjå nedanfor om 45713 
			hs.add(tall);
			tabell[i]=tall;
			do {
				tall++;
			} while(tall%5==0 || tall%2==0);
			}
		
		Random rand = new Random();

		// Obtain a number between [0 - 49].
		while(k<10000) {
		int n = rand.nextInt(10000);
		t2[k]=n;
		k++;
		}
		
		
		Instant a=Instant.now();
		for(int j =0; j < t2.length; j++) {
			binaerSoek(tabell,0,tabell.length,t2[j]);
		}
		Instant b=Instant.now();
		
		Duration c=Duration.between(a, b);
		
		Instant d=Instant.now();
		sok(hs);
		Instant e=Instant.now();
		
		Duration f=Duration.between(d, e);
		System.out.println(c);
		
		System.out.println(f);
		
		
		}
	
	public static <T extends Comparable<T>> boolean binaerSoek(T[] data, int min, int maks, T element) {

		boolean funnet = false;
		int midtpunkt = (min + maks) / 2;
		if (data[midtpunkt].compareTo(element) == 0) {
			funnet = true;
		} else if (data[midtpunkt].compareTo(element) > 0) {
			if (min <= midtpunkt - 1) {
				funnet = binaerSoek(data, min, midtpunkt - 1, element);
			}
		} else if (midtpunkt + 1 <= maks) {
			funnet = binaerSoek(data, midtpunkt + 1, maks, element);
		}
		return funnet;
	}// metode
	
	public static 	int sok(HashSet hs) {
		int j=0;
		int funnet=0;
		HashSet hash= new HashSet();
		
		Random rand = new Random();

		// Obtain a number between [0 - 49].
		while(j<10000) {
		int n = rand.nextInt(10000);
		hash.add(n);
		j++;
		}
		
		Iterator ha=hash.iterator();
		Iterator ha2=hs.iterator();
		while(ha.hasNext()) {
			if(ha.next()==ha2.next()) {
				funnet++;
			}
		}
		
		return funnet;
	}
	
	}

