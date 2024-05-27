package com.cgs.designpattern.prototype;

public class StudentProto implements Cloneable {

	private String id;
	private String name;
	private String subject;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Object getClone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return clone;
	}

	@Override
	public String toString() {
		return "StudentProto [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}

}
