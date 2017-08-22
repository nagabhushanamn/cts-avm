package com.app;

import com.app.service.TodoServiceImpl;

public class TodoApp {

	public static void main(String[] args) {

		TodoServiceImpl todoService = new TodoServiceImpl();

		todoService.addTodo("Learn Java");
		todoService.addTodo("Learn work");
		todoService.addTodo("Live life");

		// ------------------------------------------
		todoService.viewTodos();
		// ------------------------------------------
		todoService.completeTodo(1);
		// ------------------------------------------
		todoService.viewTodos();
		//--------------------------------------------
		
		
		
	}

}
