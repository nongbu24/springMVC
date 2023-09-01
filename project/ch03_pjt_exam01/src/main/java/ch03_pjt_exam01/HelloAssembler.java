package ch03_pjt_exam01;

public class HelloAssembler {
	MyHello hello;
	
	public HelloAssembler(MyHello hello) {
		this.hello = hello;
	}
	
	public void assemble() {
		hello.hello();
	}
}