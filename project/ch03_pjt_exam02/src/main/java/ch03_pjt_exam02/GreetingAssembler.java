package ch03_pjt_exam02;

import java.util.Scanner;

public class GreetingAssembler {
	GreetingPrinter gp;
	GreetingKorean kr;
	GreetingEnglish en;
	
	public GreetingAssembler(GreetingKorean kr, GreetingEnglish en, GreetingPrinter gp) {
		this.kr = kr;
		this.en = en;
		this.gp = gp;
	}
	
	public void print() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 1) {
			gp.printer(kr);
		}else {
			gp.printer(en);
		}
		sc.close();
	}
}