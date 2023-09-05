package ch04_pjt_exam01.ems;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.support.GenericXmlApplicationContext;

import ch04_pjt_exam01.ems.member.dao.MemberDO;
import ch04_pjt_exam01.ems.member.service.MemberDeleteService;
import ch04_pjt_exam01.ems.member.service.MemberModifyService;
import ch04_pjt_exam01.ems.member.service.MemberRegisterService;
import ch04_pjt_exam01.ems.member.service.MemberSelectService;
import ch04_pjt_exam01.ems.member.service.PrintMemberInformationService;
import ch04_pjt_exam01.ems.utils.InitSampleData;

public class MainClass {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);
		String[] ids = initSampleData.getIds();
		String[] passwords = initSampleData.getPasswords();
		String[] contacts = initSampleData.getContacts();
		String[] emails = initSampleData.getEmails();
		LocalDateTime[] registeredDates = initSampleData.getRegisteredDates();
		LocalDateTime[] modifiedDates = initSampleData.getModifiedDates();
				
		MemberRegisterService registerService =
				ctx.getBean("memberRegisterService", MemberRegisterService.class);
		
		for(int i = 0; i < ids.length; i++) {
			registerService.register(new MemberDO(ids[i], passwords[i], contacts[i], emails[i], registeredDates[i], modifiedDates[i]));
		}
		
		PrintMemberInformationService printMemberInformationService =
				ctx.getBean("printMemberInformationService", PrintMemberInformationService.class);
		printMemberInformationService.printMemberInfo();
		
		registerService = ctx.getBean("memberRegisterService", MemberRegisterService.class);
		registerService.register(new MemberDO("p001", "p001", "000-0000-1111", "p001@ctx.com", LocalDateTime.now(), LocalDateTime.now()));
		
		printMemberInformationService.printMemberInfo();
		
		MemberSelectService selectService =
				ctx.getBean("memberSelectService", MemberSelectService.class);
		MemberDO selectedMember = selectService.select("p001");
		
		System.out.println("MEMBER START");
		System.out.println(" | Id : " + selectedMember.getId() + "\t");
		System.out.println(" | password : " + selectedMember.getPassword() + "\t");
		System.out.println(" | contact : " + selectedMember.getContact() + "\t");
		System.out.println(" | Email : " + selectedMember.getEmail() + "\t");
		System.out.println(" | RegisteredDate : " + selectedMember.getRegisteredDate() + "\t");
		System.out.println(" | modifiedDate : " + selectedMember.getModifiedDate() + "\t");
		System.out.println("END");
		
		MemberModifyService modifyService =
				ctx.getBean("memberModifyService", MemberModifyService.class);
		modifyService.modify(new MemberDO("p002", "p002", "000-0000-2222", "p002@ctx.org", LocalDateTime.now(), LocalDateTime.now()));
		
		printMemberInformationService.printMemberInfo();
		
		MemberDeleteService deleteService =
				ctx.getBean("memberDeleteService", MemberDeleteService.class);
		deleteService.delete("p002");
		
		printMemberInformationService.printMemberInfo();
		
		ctx.close();
	}

}
