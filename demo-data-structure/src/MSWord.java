import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class MSWord {
  private StringBuilder text; 
  private Deque<Character>  words;
  private Deque<Character> temp;

  public MSWord() {
    this.words = new LinkedList<>();
    this.temp = new LinkedList<>();
  }

  

  public void addWord(char character){
    this.words.addLast(character);
    this.temp.clear();
  }

  public void undo(){
    if(this.words.size() == 0 ) return;
    char tempchar = this.words.pollLast();
    this.temp.addLast(tempchar);
  }

  public void redo(){
    if(this.temp.size() == 0 ) return;
    char tempchar = this.temp.pollLast();
    this.words.addLast(tempchar);
  }

  @Override
  public String toString(){
    this.text = new StringBuilder();
    for (char c : this.words){
      this.text.append(c);
    }
    return this.text.toString();
  }

  public static void main(String[] args) {
    MSWord msWord = new MSWord();
    msWord.addWord('a');
    msWord.addWord('b');
    msWord.addWord('c');
    msWord.undo();
    msWord.undo();
    msWord.addWord('!');
    msWord.undo();
    msWord.redo();
    System.out.println(msWord);
    
    
  }
}
