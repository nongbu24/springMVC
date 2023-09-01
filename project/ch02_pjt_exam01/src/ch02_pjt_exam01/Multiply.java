package ch02_pjt_exam01;

public class Multiply implements ICalculator {
	@Override
	public int doOperation(int firstNum, int secondNum) {
		return firstNum * secondNum;
	}
}