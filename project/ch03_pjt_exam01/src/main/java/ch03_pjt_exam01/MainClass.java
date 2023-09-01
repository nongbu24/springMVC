package ch03_pjt_exam01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		HelloAssembler helloAssembler =
				ctx.getBean("helloAssembler", HelloAssembler.class);
		helloAssembler.assemble();
		
		ctx.close();
	}

}