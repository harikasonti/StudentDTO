package com.student.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.app.entity.Student;

@Repository
public class CustomStudentRepositoryImpl implements CustomStudentRepository{
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<Student> getStudentsByCourse(String course) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Student s where s.course=:course";
		
		Query<Student> query = session.createQuery(queryString);
		query.setString("course", course);
		
		List<Student>  list = (List<Student>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Course Records not in DB");
		}
	}

}
