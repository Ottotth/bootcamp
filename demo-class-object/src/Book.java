public class Book {
  private int bookId;
  private String bookName;

  public Book(int id , String bookName){
    this.bookId = id; 
    this.bookName = bookName;
  }

  public int getBookId(){
    return this.bookId;
  }

  public String getBookName(){
    return this.bookName;
  }

}
