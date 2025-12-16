public class Teacher {
  private Candy[] candies;
  private Student[] students;

  // A teacher has 22 candies
  // 5 student
  // mian : send candy to all student
  // teacher send all candy
  // show all candy for each student

  public Teacher(int candyNum) {
    Candy[] candies = new Candy[candyNum];
    for (int i = 0; i < candies.length;) {
      candies[i] = Candy.ofRed();
      i++;
      if (i >= candies.length)
        break;
      candies[i] = Candy.ofYellow();
      i++;
      if (i >= candies.length)
        break;
      candies[i] = Candy.ofBlue();
      i++;
    }
    this.candies = candies;
  }

  public Candy checkCandy(int i) {
    return this.candies[i];
  }

  public void addStudent(int studentNum) {
    Student[] studentsT = new Student[studentNum];
    for (int i = 0 ; i < studentNum ; i++ ){
      studentsT[i] = new Student();
    }
    this.students = studentsT;
  }

  public Student getStudent(int i) {
    return this.students[i];
  }

  public void sendCandy() {
    int j = 0;
    for (int i = 0; i < this.candies.length; i++) {
      for ( j = 0; j < this.students.length; j++) {
        this.students[j].getCandy(this.candies[i]);
        i++;
        if (i > candies.length -1) break;
      }
      i--;
      j = 0;
   }
  }

  public void listAllStudentCandies(){
    int j = 0;
    
    for(int i = 0 ; i < this.students.length ; i++ ){
      for (j = 0 ;j < this.students[j].getCandiesList().length ; j++){
          System.out.println(this.students[i].checkCandy(j).getColor());
      }
      j = 0;
    }
  }



  public static void main(String[] args) {
    Teacher t = new Teacher(22);
    t.addStudent(5);
    t.sendCandy();
    t.listAllStudentCandies();
    System.err.println(t.students.length);
  }

}
