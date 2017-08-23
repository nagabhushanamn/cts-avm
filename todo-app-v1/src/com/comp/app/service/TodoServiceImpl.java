package com.comp.app.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.comp.app.model.Todo;
import com.comp.app.model.TodoCategory;

public class TodoServiceImpl implements TodoService {

	private static int todoIdx = 0;
	private Map<Integer, Todo> todos = new HashMap<Integer, Todo>();// data-structure

	@Override
	public void addTodo(String title) {

		Todo newTodo = new Todo(todoIdx + 1, title);
		// newTodo.setId(todoIdx + 1);
		// newTodo.setTitle(title);
		newTodo.setCompleted(false);
		newTodo.setCategory(TodoCategory.PERSONAL);

		todos.put(newTodo.getId(), newTodo);

		todoIdx++;
	}

	@Override
	public void deleteTodo(int id) {
		todos.remove(id);
	}

	@Override
	public void editTodod(int id, String newTitle) {
		Todo todo = todos.get(id);
		todo.setTitle(newTitle);
	}

	@Override
	public void completeTodo(int id) {
		Todo todo = todos.get(id);
		todo.setCompleted(true);
	}

	@Override
	public void completeAll() {
		Set<Integer> set = todos.keySet();
		for (Integer key : set) {
			Todo todo = todos.get(key);
			todo.setCompleted(true);
		}
	}

	@Override
	public void clearCompleted() {
		Set<Integer> set = todos.keySet();

		// for (Integer key : set) {
		// Todo todo = todos.get(key);
		// if (todo.isCompleted()) {
		// todos.remove(key);
		// }
		// }

		Iterator it = todos.entrySet().iterator();
		while (it.hasNext()) {
			Entry item = (Entry) it.next();
			Todo todo = (Todo) item.getValue();
			if (todo.isCompleted())
				it.remove();
		}

	}

	@Override
	public void viewTodos(TodoFilter filter) {
		if (filter == TodoFilter.ALL) {
			Set<Integer> set = todos.keySet();
			for (Integer key : set) {
				Todo todo = todos.get(key);
				System.out.println(todo);
			}
		}
		if (filter == TodoFilter.COMPLETED) {
			Set<Integer> set = todos.keySet();
			for (Integer key : set) {
				Todo todo = todos.get(key);
				if (todo.isCompleted())
					System.out.println(todo);
			}
		}
		if (filter == TodoFilter.ACTIVE) {
			Set<Integer> set = todos.keySet();
			for (Integer key : set) {
				Todo todo = todos.get(key);
				if (!todo.isCompleted())
					System.out.println(todo);
			}
		}
	}

}
