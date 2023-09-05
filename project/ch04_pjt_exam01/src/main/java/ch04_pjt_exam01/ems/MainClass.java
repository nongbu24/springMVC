package ch04_pjt_exam01.ems;

import org.springframework.context.support.GenericXmlApplicationContext;

import ch04_pjt_exam01.ems.member.Member;
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
		String[] mNums = initSampleData.getmNums();
		String[] mIds = initSampleData.getmIds();
		String[] mPws = initSampleData.getmPws();
		String[] mHps = initSampleData.getmHps();
		String[] mEmails = initSampleData.getmEmails();
		String[] newDate = initSampleData.getNewDate();
		String[] lastDate = initSampleData.getLastDate();
		
		MemberRegisterService registerService =
				ctx.getBean("memberRegisterService", MemberRegisterService.class);
		
		for(int i = 0; i < mNums.length; i++) {
			registerService.register(new Member(mNums[i], mIds[i], mPws[i], mHps[i], mEmails[i], newDate[i], lastDate[i]));
		}
		
		PrintMemberInformationService printMemberInformationService =
				ctx.getBean("printMemberInformationService", PrintMemberInformationService.class);
		printMemberInformationService.printMemberInfo();
		
		registerService = ctx.getBean("memberRegisterService", MemberRegisterService.class);
		registerService.register((new Member("pjw0002", "pig", "p0002", "010-2222-2222", "324@org", "2023-05-03", "2023-09-05")));
		
		printMemberInformationService.printMemberInfo();
		
		MemberSelectService selectService =
				ctx.getBean("memberSelectService", MemberSelectService.class);
		Member selectedMember = selectService.select("pjw0002");
		
		System.out.println("MEMBER START");
		System.out.println("mNum : " + selectedMember.getmNum() + "\t"); 
		System.out.println(" | mId : " + selectedMember.getmId() + "\t"); 
		System.out.println(" | mPw : " + selectedMember.getmPw() + "\t"); 
		System.out.println(" | mHp : " + selectedMember.getmHp() + "\t"); 
		System.out.println(" | mEmail : " + selectedMember.getmEmail() + "\t"); 
		System.out.println(" | newDate : " + selectedMember.getNewDate() + "\t"); 
		System.out.println(" | lastDate : " + selectedMember.getLastDate()); 
		System.out.println("END");
		
		MemberModifyService modifyService =
				ctx.getBean("memberModifyService", MemberModifyService.class);
		modifyService.modify(new Member("pjw0003", "pig", "p0003", "010-3333-3333", "pig@pp.org", "2023-05-03", "2023-09-05"));
		
		printMemberInformationService.printMemberInfo();
		
		MemberDeleteService deleteService = 
				ctx.getBean("memberDeleteService", MemberDeleteService.class);
		deleteService.delete("pjw0003");
		
		printMemberInformationService.printMemberInfo();
		
		ctx.close();
	}

}
