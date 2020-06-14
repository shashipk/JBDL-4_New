package com.shashi.library.management.DataAccessLayer;

import javax.persistence.*;

@Entity
public class IssuedBooks {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "user_id")
	private int user_id;

	@Column(name = "book_id")
	private int book_id;

	@Column(name = "status")
	private String status;

	public IssuedBooks() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
}
