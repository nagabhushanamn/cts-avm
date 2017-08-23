package com.comp.app.model;

public class Todo {

	private int id;
	private String title;
	private boolean completed;
	private TodoCategory category;

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", completed=" + completed + ", category=" + category + "]";
	}

	public Todo() {
	}

	public Todo(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public TodoCategory getCategory() {
		return category;
	}

	public void setCategory(TodoCategory category) {
		this.category = category;
	}

}
