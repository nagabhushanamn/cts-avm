package com.app.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.app.model.Todo;

public class TodoServiceImpl {

	private static int id = 0;
	private Map<Integer, Todo> todos = new HashMap<>();

	// --------------------------------------------------

	public void addTodo(String title) {
		Todo todo = new Todo(id + 1, title);
		todos.put(todo.getId(), todo);
		id++;
	}

	public void completeTodo(int id) {
		Todo todo = todos.get(id);
		todo.setCompleted(true);
	}

	public void editTodo(int id, String newTitle) {
	}

	public void deleteTodo(int id) {

	}

	public void completeAll() {

	}

	public void clearCompleted() {

	}

	public void viewTodos() {
		System.out.println();
		Set<Integer> keySet = todos.keySet();
		for (Integer key : keySet) {
			System.out.println(todos.get(key));
		}
	}

}
