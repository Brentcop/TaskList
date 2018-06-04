package com.taskList.TaskList.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_tasks", query = "select p from Task p")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="email")
	private String idemail;
	@Column(name="description")
	private String description;
	@Column(name="duedate")
	private String dueDate;
	@Column(name="complete")
	private boolean complete;

	public Task() {
		// TODO Auto-generated constructor stub
	}

	public Task(int id, String idemail, String description, String dueDate, boolean complete) {
		super();
		this.id = id;
		this.idemail = idemail;
		this.description = description;
		this.dueDate = dueDate;
		this.complete = complete;
	}
	public Task(String idemail, String description, String dueDate, boolean complete) {
		super();
		this.idemail = idemail;
		this.description = description;
		this.dueDate = dueDate;
		this.complete = complete;
	}
	public Task(String description, String dueDate, boolean complete) {
		this.description = description;
		this.dueDate = dueDate;
		this.complete = complete;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getIdemail() {
		return idemail;
	}

	public void setIdemail(String idemail) {
		this.idemail = idemail;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", idemail=" + idemail + ", description=" + description + ", dueDate=" + dueDate
				+ ", complete=" + complete + "]";
	}



}
