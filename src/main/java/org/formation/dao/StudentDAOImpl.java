package org.formation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.formation.model.Student;



public class StudentDAOImpl implements StudentDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
	EntityManager em = emf.createEntityManager();
	EntityTransaction txn = em.getTransaction();
	Student s = new Student();
	@Override
	public Student findById(int id) {
		try {
			txn.begin();
			Student s=em.find(Student.class, id);
			System.out.println(s);
			txn.commit();
			
		}catch(Exception e) {
			if(txn!=null) {
				txn.rollback();
			}
			e.printStackTrace();
			
		}finally {
			if(em!=null) {
				em.close();
			}
			if(emf!=null) {
				emf.close();
			}
		}
		return s;
	}

	@Override
	public void create(Student s) {
		try {
			txn.begin();
			em.persist(s);
			txn.commit();
			
		}catch(Exception e) {
			if(txn!=null) {
				txn.rollback();
			}
			e.printStackTrace();
			
		}finally {
			if(em!=null) {
				em.close();
			}
			if(emf!=null) {
				emf.close();
			}
		}
		
	}

	@Override
	public void update(Student s) {
		try {
			txn.begin();
			em.merge(s);
			txn.commit();
			
		}catch(Exception e) {
			if(txn!=null) {
				txn.rollback();
			}
			e.printStackTrace();
			
		}finally {
			if(em!=null) {
				em.close();
			}
			if(emf!=null) {
				emf.close();
			}
		}
		
	}

	@Override
	public void delete(Student s) {
		try {
			txn.begin();
			em.remove(s);
			txn.commit();
			
		}catch(Exception e) {
			if(txn!=null) {
				txn.rollback();
			}
			e.printStackTrace();
			
		}finally {
			if(em!=null) {
				em.close();
			}
			if(emf!=null) {
				emf.close();
			}
		}
		
		
	}

}
