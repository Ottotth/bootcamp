public class Librarian {
  public static int idCount =  0;
  private int staffId;
  private Library library;

  public Librarian(){
    this.staffId = ++staffId;
  }

  public int getStaffId(){
    return this.staffId;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }

  public Book findBook(int id){
    if (library == null) {
      return null;
    }
    for (int i = 0; i < library.getBooks().length; i++) {
      Book book = library.getBooks()[i];
      if (book.getBookId() == id) {
        return book;
      }
    }
    return null;
  }

  public Library getLibrary() {
    return this.library;
  }

  public static void main(String[] args) {
    Library library = new Library();
    Librarian librarian = new Librarian();
    librarian.setLibrary(library);

    library.addBook(101, "Java Programming");
    library.addBook(102, "Data Structures");

    Book foundBook = librarian.findBook(101);
    if (foundBook != null) {
      System.out.println("Found Book: " + foundBook.getBookName());
    } else {
      System.out.println("Book not found.");
    }
  }


  
}
