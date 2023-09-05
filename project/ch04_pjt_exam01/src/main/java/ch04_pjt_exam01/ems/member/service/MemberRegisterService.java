package ch04_pjt_exam01.ems.member.service;

import ch04_pjt_exam01.ems.member.dao.MemberDAO;
import ch04_pjt_exam01.ems.member.dao.MemberDO;

public class MemberRegisterService {
	private MemberDAO memberDao;
	
	public MemberRegisterService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void register(MemberDO memberDo) {
		if(verify(memberDo.getId())) {
			memberDao.insert(memberDo);
		} else {
			System.out.println("The Member has already been registered");
		}
	}
	
	public boolean verify(String id) {
		MemberDO memberDo = memberDao.select(id);
		
		return memberDo == null ? true : false;
	}
	
}