package org.formation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.formation.model.Ecole;
import org.formation.model.Student;
import org.formation.model.SujetPFE;



public class StudentDAOImpl implements StudentDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
	EntityManager em = emf.createEntityManager();
	EntityTransaction txn = em.getTransaction();
	Student s = new Student();                                                                                                                                        
	@Override
	public Student findById(Long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Student s = null;
		try {
			txn.begin();
			s = em.find(Student.class, id);
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
	public void create(Ecole ec) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.persist(ec);
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
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
//		Student s = null;
//		try {
//			txn.begin();
//			s = em.find(Student.class, id)
//			em.merge(s);
//			txn.commit();
//			
//		}catch(Exception e) {
//			if(txn!=null) {
//				txn.rollback();
//			}
//			e.printStackTrace();
//			
//		}finally {
//			if(em!=null) {
//				em.close();
//			}
//			if(emf!=null) {
//				emf.close();
//			}
//		}
		
	}

	@Override
	public void delete(Student s) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
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

	@Override
	public void create(SujetPFE pfe) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.persist(pfe);
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
