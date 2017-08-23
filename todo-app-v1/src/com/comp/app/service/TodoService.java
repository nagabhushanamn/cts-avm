package com.comp.app.service;

public interface TodoService {

	void addTodo(String title);
	void deleteTodo(int id);
	void editTodod(int id, String newTitle);
	void completeTodo(int id);
	void completeAll();
	void clearCompleted();
	void viewTodos(TodoFilter filter);

}
