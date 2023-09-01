package ch02_pjt_exam01;

public class CalcAssembler {
  ICalculator calculator;

  public static ICalculator assemble(char operator) {
    switch (operator) {
    case '+':
      return new Add();

    case '-':
      return new Subtract();

    case '*':
      return new Multiply();

    case '/':
      return new Divide();

    case '%':
      return new Modulo();
    default:
      return null;
    }
  }
}