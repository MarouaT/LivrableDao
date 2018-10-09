package org.formation.jpastudent;

import org.formation.dao.StudentDAO;
import org.formation.dao.StudentDAOImpl;
import org.formation.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAOImpl();
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setAge(23);
		s1.setFirstName("Jean");
		s1.setLastName("Luc");
		s2.setAge(20);
		s2.setFirstName("Laura");
		s2.setLastName("Pausini");
		dao.create(s1);
		dao.create(s2);
		dao.delete(s1);
		dao.findById(1);
	}

}
