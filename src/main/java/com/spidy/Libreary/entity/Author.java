package com.spidy.Libreary.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "authors")
public class Author implements Serializable {

	@Id
	@Column(name = "id")
	@GenericGenerator(name = "id_auto", strategy = "increment")
	@GeneratedValue(generator = "id_auto")
	private int authorId;
	
	@Column(name = "name")
	private String authorName;
	
	@Column(name = "country")
	private String authorCountry;
	
	@Column(name = "age")
	private int authorAge;

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorCountry() {
		return authorCountry;
	}

	public void setAuthorCountry(String authorCountry) {
		this.authorCountry = authorCountry;
	}

	public int getAuthorAge() {
		return authorAge;
	}

	public void setAuthorAge(int authorAge) {
		this.authorAge = authorAge;
	}
}
