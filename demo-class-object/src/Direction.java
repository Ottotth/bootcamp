//JVM -> Class Loader -> create enum -> main()

public enum Direction {
  EAST('E',-1), WEST('W',1), NORTH('N',-2), SOUTH('S',2),;

  private char value;
  private int op;

   //enum constructor is private
  Direction(char value , int op){ // for JVM , so it is private
    this.value = value;
    this.op = op;
  }


  public boolean isOppsite(Direction direction){
    return this.op + direction.getOp() == 0;
  }

  public int getOp(){
    return this.op;
  }

  public Direction oppsite(){
    for (Direction d : Direction.values()){
      if ( d.getOp() + this.op == 0){
        return d;
      } 
    }
    return null;
  }

  public static void main(String[] args) {
     
    System.out.println(Direction.EAST.oppsite());
  }

 

  
}
