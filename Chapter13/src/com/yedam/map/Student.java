package com.yedam.map;

public class Student {
	public int id;
	public String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			return (id == std.id) && (name == std.name);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id+name.hashCode();
	}

	
	
	
	
	
}
