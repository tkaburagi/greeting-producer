package com.example.demo;

public class Greeting {
	private String id;
    private String message;
    private String name;
    private int age;

    public Greeting(String id, String message, String name) {
        this.id = id;
        this.message = message;
        this.name = name;
        this.age = age;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    

}
