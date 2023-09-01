package ch02_pjt_01;

public class MyCalculator{
	
	public void calAdd(int fNum, int sNum) {
		ICalculator calculator = new CalAdd();	//인터페이스지만 칼에드를 만든다 상위형 변환이 알아서 일어남
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result: " + value);
	}
	
	public void calSub(int fNum, int sNum) {
		ICalculator calculator = new CalSub();	//인터페이스지만 칼에드를 만든다 상위형 변환이 알아서 일어남
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result: " + value);
	}
	
	public void calMul(int fNum, int sNum) {
		ICalculator calculator = new CalMul();	//인터페이스지만 칼에드를 만든다 상위형 변환이 알아서 일어남
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result: " + value);
	}
	
	public void calDiv(int fNum, int sNum) {
		ICalculator calculator = new CalDiv();	//인터페이스지만 칼에드를 만든다 상위형 변환이 알아서 일어남
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result: " + value);
	}
}