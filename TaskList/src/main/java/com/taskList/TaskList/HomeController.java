package com.taskList.TaskList;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.taskList.TaskList.Dao.TaskDao;
import com.taskList.TaskList.entity.Task;

@Controller
public class HomeController {

	@Autowired
	TaskDao t;
	@RequestMapping("/")
	public ModelAndView index() {
	
	return new ModelAndView("welcome","test","Hello World!");
}
	@RequestMapping("/tasklist")
	public ModelAndView tasklist() {
		ArrayList<Task> test =(ArrayList<Task>) t.findAll();
		for (int i = 0; i< test.size(); i++) {
			System.out.println(test.get(i));
		}
		
		return new ModelAndView("tasklist","task",t.findAll());
	}
	@RequestMapping("/taskform")
	public ModelAndView taskform() {
		
		return new ModelAndView("taskform","task",t.findAll());
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView add(@RequestParam("idemail")String idemail,@RequestParam("description")String description,@RequestParam("dueDate")String dueDate,@RequestParam("complete")Boolean complete) {
		if(complete==null) {
			complete = false;
		}
		Task t1 = new Task(idemail,description,dueDate,complete);
		t.update(t1);
		return new ModelAndView("tasklist","task",t.findAll());
	}
	@RequestMapping(value="/delete")
	public ModelAndView delete(@RequestParam("id")int id) {
		t.deleteById(id);
		
		return new ModelAndView("tasklist","task",t.findAll());
	}
	@RequestMapping(value="/update")
	public ModelAndView update(@RequestParam("id")int id) {
		Task t1 = t.findById(id);
		t.update(t1);
		return new ModelAndView("taskform","task",t.findAll());
	}
}