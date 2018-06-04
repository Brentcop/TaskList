package com.taskList.TaskList.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.taskList.TaskList.entity.Task;

@Repository
@Transactional
public class TaskDao {
	
	@PersistenceContext
	EntityManager eManager;
	public List<Task> findAll(){
		TypedQuery<Task> namedQuery = eManager.createNamedQuery("find_all_tasks",Task.class);
		return namedQuery.getResultList();
	}
	public Task findById(int idTask) {
		//Task t = findById(idTask);
		return eManager.find(Task.class, idTask);
	}
	public Task update(Task t) {
		return eManager.merge(t);
	}
	public void deleteById(int id) {
		Task t= findById(id);
		eManager.remove(t);
	}

}
