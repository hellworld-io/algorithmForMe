package main.java.algorithm.basic;

public class BasicAlgorithm {
	/**
	 * 1 ~ iTotalNumbers 까지의 합
	 * @param iTotalNumbers
	 * @return
	 */
	public int sumTotalNumbers(int iTotalNumbers) {
		int iSumVal = 0;
		
		for (int idx = 0; idx <= iTotalNumbers; idx++ ) {
			iSumVal += idx;
		}
		
		return iSumVal;
	}
	
	/**
	 * 피보나치 수열
	 * @param iFiboNum
	 * @return
	 */
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
	
	/**
	 * 평균값 구하기. 10,20,30,40,50
	 * @param arrPoints
	 * @return
	 */
	public float getAve(int[] arrPoints) {
		float fResult = 0f;
		int iSum = 0;
		
		for(int idx = 0; idx < arrPoints.length; idx++){
			iSum += arrPoints[idx];
		}
		
		fResult = iSum / arrPoints.length;
		
		return fResult;
	}
	
	/**
	 * 최대값 구하기 10, 15, 20, 50, 100
	 * 만약 들어올 수들의 값의 범위가 정해져 있지 않다면?
	 * @param arrNumbers
	 * @return
	 */
	public int getMaxNumber(int[] arrNumbers) {
		int iMax = -1;
		
		for (int idx = 0; idx < arrNumbers.length; idx++) {
			if(iMax < arrNumbers[idx]){
				iMax = arrNumbers[idx];
			}
		}
		return iMax;
	}
	
	/**
	 * 최소값 구하기. 10, 15, 20, 50, 100
	 * @param arrNumbers
	 * @return
	 */
	public int getMinNumber(int[] arrNumbers) {
		int iMin = 999;
		
		for (int idx = 0; idx < arrNumbers.length; idx++) {
			if(iMin > arrNumbers[idx]){
				iMin = arrNumbers[idx];
			}
		}
		return iMin;
	}
	
	/**
	 * 수들의 등수 만들기. 40, 13, 57,10,7
	 * @param arrNumbers
	 * @return
	 */
	public int[] setRank(int[] arrNumbers) {
		int[] arrResult = new int[arrNumbers.length];
		
		for (int idx = 0; idx < arrResult.length; idx++) {
			arrResult[idx] = 1;
		}
		
		int[] arrCompareNumbers = arrNumbers;
		
		for(int idx1 = 0; idx1 < arrNumbers.length; idx1++){
			for(int idx2 = 0; idx2 < arrCompareNumbers.length; idx2++){
				if(arrNumbers[idx1] < arrCompareNumbers[idx2]){
					arrResult[idx1]++;
				}
			}
		}
		
		return arrResult;
	}
	
	
	public static void main(String[] args) {
		BasicAlgorithm basic = new BasicAlgorithm();
		
		int result = basic.sumTotalNumbers(5);
		System.out.println("result =========> " + result);
		
		int[] arrFibo = basic.getFibo(8);
		
		for(int i =0; i < arrFibo.length; i++){
			System.out.println("Fibo =========> " + arrFibo[i]);
		}
		int[] arrPoints = {10,20,30,40,50};
		float fResult = basic.getAve(arrPoints);
		
		System.out.println("fResult =========> " + fResult);
		
		//[TODO] 만약 들어오는 숫자의 값의 범위나 값에 대한 정의가 명확하지 않은 경우에 대한 고민이 필요함.
		int[] arrNumbers = {10, 15, 20, 50, 100};
		int iMaxResult = basic.getMaxNumber(arrNumbers);
		int iMinResult = basic.getMinNumber(arrNumbers);
		System.out.println("iMaxResult =========> " + iMaxResult);
		System.out.println("iMinResult =========> " + iMinResult);
		
		int[] arrRankNumbers = {40, 13, 57,10,7};
		int[] arrRankResult = basic.setRank(arrRankNumbers);
		
		for(int i =0; i < arrRankResult.length; i++){
			System.out.println("arrRankResult =========> " + arrRankResult[i]);
		}
	}

}
