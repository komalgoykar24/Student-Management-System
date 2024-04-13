package com.tka;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Library {
@Id
int book_id;
String book_title;
String author;
boolean availability_status;
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}
public String getBook_title() {
	return book_title;
}
public void setBook_title(String book_title) {
	this.book_title = book_title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public boolean isAvailability_status() {
	return availability_status;
}
public void setAvailability_status(boolean availability_status) {
	this.availability_status = availability_status;
}
@Override
public String toString() {
	return "Library [book_id=" + book_id + ", book_title=" + book_title + ", author=" + author
			+ ", availability_status=" + availability_status + "]";
}

}
