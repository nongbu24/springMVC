package ch03_pjt_exam02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Select Language 1.Korea 2.English");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		GreetingAssembler as = ctx.getBean("as", GreetingAssembler.class);

		as.print();

		ctx.close();
	}

}