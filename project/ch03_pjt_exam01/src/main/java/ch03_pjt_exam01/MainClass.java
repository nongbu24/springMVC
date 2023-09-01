package ch03_pjt_exam01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Greeting gt = ctx.getBean("gt", Greeting.class);
		gt.message();
		
		ctx.close();
	}
}