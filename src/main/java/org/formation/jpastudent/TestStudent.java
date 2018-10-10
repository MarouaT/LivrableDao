package org.formation.jpastudent;

import org.formation.dao.StudentDAO;
import org.formation.dao.StudentDAOImpl;
import org.formation.model.Ecole;
import org.formation.model.Student;
import org.formation.model.SujetPFE;

public class TestStudent {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAOImpl();
		Student s1 = new Student();
		Student s2 = new Student();
		
		Ecole e = new Ecole();
		SujetPFE pfe1= new SujetPFE();
		SujetPFE pfe2= new SujetPFE();
		
		s1.setAge(20);
		s1.setEcole(e);
		s1.setFirstName("Matilda");
		s1.setLastName("Dupont");
		s1.setPfe(pfe1);
		s2.setAge(21);
		s2.setEcole(e);
		s2.setFirstName("Romeo");
		s2.setLastName("Lacroix");
		s2.setPfe(pfe2);
		e.setAddress("Paris");
		e.setName("Victoire");
		pfe1.setTitre("Création API Java");
		pfe2.setTitre("Création base de donnée répartie");
		e.addStudent(s1);
		e.addStudent(s2);
		dao.create(e);
		dao.create(pfe1);
		dao.create(pfe2);
		
	}

}
