package ch04_pjt_exam01.ems.member.service;

import ch04_pjt_exam01.ems.member.Member;
import ch04_pjt_exam01.ems.member.dao.MemberDAO;

public class MemberRegisterService {
	private MemberDAO memberDao;
	
	public MemberRegisterService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void register(Member member) {
		if(verify(member.getmNum())) {
			memberDao.insert(member);
		} else {
			System.out.println("The Member has already been registered");
		}
	}
	
	public boolean verify(String mNum) {
		Member member = memberDao.select(mNum);
		
		return member == null ? true : false;
	}
}
