package ch02_pjt_02;

public class MyCalculator{
	
	public void calculate(int fNum, int sNum, ICalculator calculator) {
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result: " + value);
	}
}