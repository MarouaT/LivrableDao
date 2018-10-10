package org.formation.dao;

import org.formation.model.Ecole;
import org.formation.model.Student;
import org.formation.model.SujetPFE;



public interface StudentDAO {
	public Student findById(Long id);
	public void create (Ecole e);
	public void create (SujetPFE pfe);
	public void update (Student s);
	public void delete (Student s);
	
	
}
