package fr.dauphine.ja.guedidihedi.td00;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PrimeCollection {
	ArrayList<Integer> number;
	PrimeCollection(){
		number = new ArrayList<>();
	}
	public void initRandom(int n,int m) {
		ThreadLocalRandom random =ThreadLocalRandom.current();
		for (int i=0;i<n;i++) {
			number.add(random.nextInt(0,m+1));
		}
	}
	public static boolean isPrime(int p) {
		if(p==1 || p==0) {
			return false;
		}
		if(p==2) {
			return true;
		}
		for(int i=2;i<p/2;i++){
			if((p%i)==0) {
				return false;
			}
		}
		return true;
	}
	
	public void printPrimes() {
		for(Integer i : number) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		PrimeCollection primeCollection=new PrimeCollection();
		primeCollection.initRandom(100,2000);
		System.out.println("les eniters premiers sont :");
		primeCollection.printPrimes();
	}
}
