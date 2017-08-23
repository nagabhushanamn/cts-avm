package com.comp.app;

import com.comp.app.service.TodoFilter;
import com.comp.app.service.TodoService;
import com.comp.app.service.TodoServiceImpl;

public class TodoApp {

	public static void main(String[] args) {

		TodoService todoService = new TodoServiceImpl();

		todoService.addTodo("Item-1");
		todoService.addTodo("Item-2");
		todoService.addTodo("Item-3");

		todoService.completeTodo(2);

		todoService.clearCompleted();
		// todoService.editTodod(1, "Item-11");
		// todoService.completeTodo(1);

		// todoService.completeAll();

		// todoService.deleteTodo(2);

		// ------------------------------------------

		todoService.viewTodos(TodoFilter.ALL);
		System.out.println();

		// todoService.viewTodos(TodoFilter.COMPLETED);
		// System.out.println();
		// todoService.viewTodos(TodoFilter.ACTIVE);

	}

}
