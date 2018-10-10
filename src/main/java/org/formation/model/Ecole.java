package org.formation.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.formation.model.Student;

@Entity
public class Ecole {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
Long id;
String name;
String address;
@OneToMany(mappedBy="ecole")
Set<Student>students=new HashSet<>();
public Ecole(Long id, String name, String address, Set<Student> students) {
	
	this.id = id;
	this.name = name;
	this.address = address;
	this.students = students;
}
public Ecole() {

}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Set<Student> getStudents() {
	return students;
}
public void setStudents(Set<Student> students) {
	this.students = students;
}
public void addStudent(Student s) {
	students.add(s);
	s.setEcole(this);
}
}
