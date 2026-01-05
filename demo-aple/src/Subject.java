public class Subject {
  private String name;
  private int score;

  public Subject(String name , int score){
    this.name = name;
    this.score = score;
  }

  public String getSubject(){
    return this.name;
  }

  public int getScore(){
    return this.score;
  }

  public void setScore(int score){
    this.score = score;

  }
}
