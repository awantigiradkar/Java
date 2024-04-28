package aa2;

import java.io.Serializable;

public class Book implements Serializable {
	int Bookid;
	String Book_name;
	float price;
	String author_name;
	int isbn_no;
	String publication;
	
	
	public Book(int bookid, String book_name, float price, String author_name, int isbn_no, String publication) {
		Bookid = bookid;
		Book_name = book_name;
		this.price = price;
		this.author_name = author_name;
		this.isbn_no = isbn_no;
		this.publication = publication;
	}
	
	
	public void dispBook() {
		System.out.println(Bookid+" "+Book_name+" "+price+" "+author_name+" "+isbn_no+" "+publication+" ");
	}
	

}
