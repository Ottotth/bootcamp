public class Studentt {
  public final Subject[] subjects = new Subject[]{
    new Subject("Chinese" , 0),
    new Subject("English" , 0),
    new Subject("Math", 0)};

    public void changeSub(int index , Subject subject){
      this.subjects[index] = subject;
    }

    public void showSubject(){
      for (int i = 0 ; i < subjects.length ; i++){
        System.out.println(subjects[i].getSubject() + "|" + subjects[i].getScore());
      }
    }

    public static void main(String[] args) {
      Studentt s1 = new Studentt();

      s1.changeSub(1, new Subject("History" , 60));
      s1.showSubject();
    }
}
