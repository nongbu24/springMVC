package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDAO;

public class StudentRegisterService {	//학생 정보를 데이터베이스에 저장하는 역할
	private StudentDAO studentDao;
	
	public StudentRegisterService(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
	
	public void register(Student student) {
		if(verify(student.getsNum())) {
			studentDao.insert(student);
		} else {
			System.out.println("The Student has already been registered");
		}
	}
	
	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		
		return student == null ? true : false;
	}
}
