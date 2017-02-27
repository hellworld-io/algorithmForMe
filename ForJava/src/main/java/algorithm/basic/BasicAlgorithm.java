package main.java.algorithm.basic;

public class BasicAlgorithm {
	public int sumNumbers(int iLoopNumbers) {
		int iSumVal = 0;
		
		for (int idx = 0; idx <= iLoopNumbers; idx++ ) {
			iSumVal += idx;
		}
		
		return iSumVal;
	}
	
	public int[] getFibo(int iFiboNum) {
		int[] arrResult = new int[iFiboNum];
		int iNext = 2;
		
		arrResult[0] = 0;
		arrResult[1] = 1;
		for (int idx = 0; idx < iFiboNum-2; idx++) {
			arrResult[iNext] = arrResult[iNext-2] + arrResult[iNext-1];
			iNext++;
		}
		
		 
		
		return arrResult;
	}
	
	public static void main(String[] args) {
		BasicAlgorithm basic = new BasicAlgorithm();
		
		int result = basic.sumNumbers(5);
		System.out.println("result =========> " + result);
		
		int[] arrFibo = basic.getFibo(8);
		
		for(int i =0; i < arrFibo.length; i++){
			System.out.println("Fibo =========> " + arrFibo[i]);
		}
		
		
	}

}
