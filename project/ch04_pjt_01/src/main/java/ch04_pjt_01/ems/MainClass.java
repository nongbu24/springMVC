package ch04_pjt_01.ems;

import org.springframework.context.support.GenericXmlApplicationContext;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.service.EMSInformationService;
import ch04_pjt_01.ems.member.service.PrintStudentInformationService;
import ch04_pjt_01.ems.member.service.StudentDeleteService;
import ch04_pjt_01.ems.member.service.StudentModifyService;
import ch04_pjt_01.ems.member.service.StudentRegisterService;
import ch04_pjt_01.ems.member.service.StudentSelectService;
import ch04_pjt_01.ems.utils.InitSampleData;

public class MainClass {

	public static void main(String[] args) {
		String[] appCtxs = {"classpath:appCtx1.xml",
							"classpath:appCtx2.xml",
							"classpath:appCtx3.xml"};
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(appCtxs);
		// 이렇게 길면 보기가 어렵기 때문에 일반적으로 배열 형태로 파일을 저장해준다.
		
		ctx = new GenericXmlApplicationContext("classpath:appCtxImport.xml");
		// 임포트 해줬으니까 괜찮다 (?) 위나 아래 둘 중에 하나로 쓰면 된다고 하심
		
		InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);
		String[] sNums = initSampleData.getsNums();
		String[] sIds = initSampleData.getsIds();
		String[] sPws = initSampleData.getsPws();
		String[] sNames = initSampleData.getsNames();
		int[] sAges = initSampleData.getsAges();
		char[] sGenders = initSampleData.getsGenders();
		String[] sMajors = initSampleData.getsMajors();
		
		StudentRegisterService registerService =
				ctx.getBean("studentRegisterService", StudentRegisterService.class);
		
		for(int i = 0; i < sNums.length; i++) {
			registerService.register(new Student(sNums[i], sIds[i], sPws[i], sNames[i], sAges[i], sGenders[i], sMajors[i]));
		}
		
		PrintStudentInformationService printStudentInformationService =
			ctx.getBean("printStudentInformationService", PrintStudentInformationService.class);
		printStudentInformationService.printStudentInfo();
		
		registerService = ctx.getBean("studentRegisterService", StudentRegisterService.class);
		registerService.register((new Student("hbs006", "deer", "p0006", "mellisa", 26, 'W', "Music")));

		printStudentInformationService.printStudentInfo();
		
		StudentSelectService selectService =
				ctx.getBean("studentSelectService", StudentSelectService.class);
		Student selectedStudent = selectService.select("hbs006");
		
		System.out.println("STUDENT START ---------------------");
		System.out.println("sNum: " + selectedStudent.getsNum() + "\t");
		System.out.println("|sId: " + selectedStudent.getsId() + "\t");
		System.out.println("|sPw: " + selectedStudent.getsPw() + "\t");
		System.out.println("|sName: " + selectedStudent.getsName() + "\t");
		System.out.println("|sGender: " + selectedStudent.getsGender() + "\t");
		System.out.println("|sMajor: " + selectedStudent.getsMajor());
		System.out.println("END ----------------------------");
		
		StudentModifyService modifyService =
				ctx.getBean("studentModifyService", StudentModifyService.class);
		modifyService.modify(new Student("hbs006", "pig", "p0066", "mellisa", 27, 'W', "Computer"));
		
		printStudentInformationService.printStudentInfo();
		
		StudentDeleteService deleteService =
				ctx.getBean("studentDeleteService", StudentDeleteService.class);
		deleteService.delete("hbs005");
		
		printStudentInformationService.printStudentInfo();
		
		EMSInformationService emsInformationService =
				ctx.getBean("EMSInformationService", EMSInformationService.class);
		
		ctx.close();
	}
}