class Book {
 	private static String libraryName = "City Library"; 
 	private final String isbn; 
 	private String title;
 	private String author;

 	
 	public Book(String isbn, String title, String author) {
     	this.isbn = isbn;
     	this.title = title;
     	this.author = author;
 	}

 	public void displayBookDetails() {
     	if (this instanceof Book) { 
			System.out.println("Book details :\n");
         	System.out.println("Library : " + libraryName);
         	System.out.println("ISBN : " + isbn);
         	System.out.println("Title : " + title);
         	System.out.println("Author : " + author);
  	   }
 	}

 	public static void displayLibraryName() {
     	System.out.println("Library Name : " + libraryName);
 	}
 }

 
 public class LibrarySystem {
 	public static void main(String[] args) {
     	Book book1 = new Book("A215", "Advanced Java", "ABC");
     	Book book2 = new Book("C234", "SQL", "XYZ");

     	book1.displayBookDetails();
     	book2.displayBookDetails();
     	Book.displayLibraryName();
 	}
 }

