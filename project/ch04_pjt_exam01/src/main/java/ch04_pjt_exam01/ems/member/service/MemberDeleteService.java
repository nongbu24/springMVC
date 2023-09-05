package ch04_pjt_exam01.ems.member.service;

import ch04_pjt_exam01.ems.member.dao.MemberDAO;
import ch04_pjt_exam01.ems.member.dao.MemberDO;

public class MemberDeleteService {
	private MemberDAO memberDao;
	
	public MemberDeleteService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void delete(String id) {
		if(verify(id)) {
			memberDao.delete(id);
		} else {
			System.out.println("Member information is unavailable");
		}
	}
	
	public boolean verify(String id) {
		MemberDO memberDo = memberDao.select(id);
		return memberDo != null ? true : false;
	}
	
}