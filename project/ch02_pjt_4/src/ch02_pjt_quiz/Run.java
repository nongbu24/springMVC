package ch02_pjt_quiz;

public class Run {
	public static void main(String[] args) {
		Calc calc = new Calc(10, 5);
		calc.showCalcResult('+');
		calc.showCalcResult('-');
		calc.showCalcResult('*');
		calc.showCalcResult('/');
		calc.showCalcResult('%');
	}
}