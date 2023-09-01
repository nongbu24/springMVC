package ch04_pjt_01.ems.member.service;

import java.util.List;
import java.util.Map;

import ch04_pjt_01.ems.member.DBConnectionInfo;

public class EMSInformationService {
	private String info;
	private String copyRight;
	private String ver;
	private int sYear;
	private int sMonth;
	private int sDay;
	private int eYear;
	private int eMonth;
	private int eDay;
	private List<String> developers;
	private Map<String, String> administrators;
	private Map<String, DBConnectionInfo> dbInfors;
	
	public void printEMSInformation() {
		System.out.println("EMS INFORMATION PRINTING STARTS ----------");
		String devPeriod = sYear + "/" + sMonth + "/" + sDay + " ~ " + eYear + "/" + eMonth + "/" + eDay;
		System.out.println(info + "(" + devPeriod + ")");
		
	}
}
