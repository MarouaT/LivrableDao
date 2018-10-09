package org.formation.dao;

import org.formation.model.Student;



public interface StudentDAO {
	public Student findById(int id);
	public void create (Student s);
	public void update (Student s);
	public void delete (Student s);
}
