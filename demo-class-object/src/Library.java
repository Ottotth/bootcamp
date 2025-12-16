public class Library {
  public static int idCount =  0;
  private int libraryId;
  private Book[] books;

  public Library(){
    this.libraryId = ++idCount;
    this.books = new Book[0];
  }

  public int getLbraryId(){
    return this.libraryId;
  }

  public Book[] getBooks(){
    return this.books;
  }

  public void addBook(int id, String bookName) {
    Book[] temp = new Book[this.books.length + 1];
    for(int i = 0 ; i < this.books.length ; i++){
      temp[i] = this.books[i];
    }
    temp[this.books.length] = new Book(id, bookName);
    this.books = temp;
  }

}
