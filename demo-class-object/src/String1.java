public class String1 {
  private char[] chararray;

  public String1(String s){
    if( s == null) this.chararray = new char[0];
    else this.chararray = s.toCharArray();
  }

  public char charAt(int index){
    return this.chararray[index];
  }

  public boolean contains(char ch){
    for (char c : this.chararray) {
      if (c == ch) return true;
    }
    return false;
  }

  public int length(){
    return this.chararray.length;
  }

  public boolean isEmpty(){
    return this.chararray.length == 0;
  }

  public String1(char[] chararray){
    this.chararray = chararray;
  }

  public String1 replace(char from, char to){
    char[] replace = this.chararray;
    for( int i = 0 ; i < this.chararray.length ; i++){
      if(this.chararray[i] == from)
        replace[i] = to;
    }
    return new String1(replace);
  }

  public static void main(String[] args) {

    String1 s1 = new String1("hello");
    

   
  }
  
}
