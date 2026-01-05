import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Libraryy {
  public Map<Integer , Book> bookMap1;
  public Map<BookType , List<Book>>bookMap2;
  private static int idx = 100;

  public static enum BookType{
   CHINESE, MATH,ENGHISH;
  }

  public Libraryy(){
    this.bookMap1 = new HashMap<>();
    this.bookMap2 = new HashMap<>();
  }

  public void add(BookType booktype, Book book){
    int id = ++idx;
    book.setId(id);
    List<Book> bookTypeList = this.bookMap2.get(booktype);
    bookTypeList.add(book);
    bookMap2.put(booktype, book);
  }

  public boolean search(int id){
    return bookMap.get(id) != null;
  }

  public void searchType(BookType booktype){
    Map<Integer,Book> bookTypeList = this.bookMap.get(booktype);
    for(int i = 0 ; i < bookTypeList.size();i++){
      
    }
  }

//-------------------------

  public class Book{
    private Integer id;
    private String name;

    public Book(String name){
      this.name = name;
    }

    public void setId(int id){
      this.id = id;
    }

    public String getName(){
      return this.name;
    }


    }
  

  //-------------------------

  public static void main(String[] args) {

    Libraryy lib = new Libraryy();

    lib.add(BookType.CHINESE ,lib.new Book("Chinese01"));
    lib.add(BookType.MATH , lib.new Book("Math01"));
    lib.add(BookType.ENGHISH , lib.new Book("English01"));

    System.out.println(lib.search(102));
    


  }
  
}
