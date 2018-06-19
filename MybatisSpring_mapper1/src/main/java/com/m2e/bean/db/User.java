package com.m2e.bean.db;

public class User {

	private int id;
	private String menu_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", menu_name=" + menu_name + "]";
	}
}
