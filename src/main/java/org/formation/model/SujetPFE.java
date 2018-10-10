package org.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SujetPFE {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String titre;
	@OneToOne(mappedBy="pfe")
	Student student;
	public SujetPFE(Long id, String titre, Student student) {
		super();
		this.id = id;
		this.titre = titre;
		this.student = student;
	}
	public SujetPFE() {
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
