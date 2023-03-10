package com.pluralcamp.mvc;

import com.pluralcamp.mvc.Controllers.StudentController;
import com.pluralcamp.mvc.model.Student;
import com.pluralcamp.mvc.views.StudentView;

public class MVCPatternDemo {

	public static void main(String[] args) {
		
		 //fetch student record based on his roll no from the database
	      Student model  = retriveStudentFromDatabase();

	      //Create a view : to write student details on console
	      StudentView view = new StudentView();

	      StudentController controller = new StudentController(model, view);

	      controller.updateView();

	      //update model data
	      controller.setStudentName("Alex");

	      controller.updateView();
	
	}

	private static Student retriveStudentFromDatabase(){
	      Student student = new Student();
	      student.setName("Laura");
	      student.setRollNo("27");
	      return student;
	   }
	
}
