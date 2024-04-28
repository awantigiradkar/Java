package aa2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BookReadWriteMain {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		float max_p = 0;
		Book B1 = new Book(1, "Life is precious", 500, "Philips", 40, "Nancy");
		Book B2 = new Book(2, "Life is all about secod chance", 450, "Jennifer", 32, "Pathan");
		Book B3 = new Book(3, "King", 350, "Luther", 22, "Nancy");
		Book B4 = new Book(4, "Queen", 300, "Reu", 60, "Nancy");
		Book B5 = new Book(5, "Life is Beautiful", 100, "Ranvjiay", 11, "Pathan");
		ArrayList<Book> BAL =  new ArrayList<>();
		BAL.add(B1);
		BAL.add(B2);
		BAL.add(B3);
		BAL.add(B4);
		BAL.add(B5);
		FileOutputStream FOS  = new FileOutputStream("C:\\Users\\user\\Desktop\\DBDA001");
		ObjectOutputStream OOS = new ObjectOutputStream(FOS);
		OOS .writeObject(BAL);
		FOS.close();
		OOS.close();
		
		FileInputStream FIS = new FileInputStream("C:\\Users\\user\\Desktop\\DBDA001");
		ObjectInputStream OIS = new ObjectInputStream(FIS);
		//Read all the  book objects from file
		for(Book aa:BAL) {
			aa.dispBook();
		}
		System.out.println("Give me the particular publication name");
		String pub_name = sc.next();
		for(Book c:BAL) {
			if(c.publication.equals(pub_name)) {
				System.out.println("Book of particular publication is: "+c.Book_name);
			}
		}
		//Reduce book prices of particular author and then show its object
		System.out.println("Tell me how many books prices to be reduce");
		int A = sc.nextInt();
		
		for(int i=0;i<A;i++) {
			System.out.println("Tell the author name");
			String aut_n = sc.next();
			for(Book r:BAL) {
				
				if(r.author_name.equals(aut_n)) {
					r.price = (float) (r.price - (0.1*r.price));
					r.dispBook();
				}
				
			}
		}
		
		//Remove the book of particular isbn_no
		int ind = 0;
		System.out.println("Tell the particular isbn no.: ");
		int ISBN_no = sc.nextInt();
		for(Book qq:BAL) {
			if(qq.isbn_no == ISBN_no) {
				 ind = BAL.indexOf(qq);
			}
			
		}
		BAL.remove(ind);
		for(Book u:BAL) {
			u.dispBook();
		}
		
		//Find the book name which has the maximum price of particular publication
		System.out.println("Tell the particular publication name");
		String PUB_name = sc.next();
		for(Book uu:BAL) {
			if((uu.publication.equals(PUB_name)) && ((uu.price > max_p))) {
				max_p = uu.price;
			}
		}
		System.out.println("Max price of book for a particular publication is "+max_p);
		
	}
	
	}
