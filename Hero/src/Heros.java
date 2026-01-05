public final class Heros { //Cannot be extended
  public static final int ARCHER = 1;
  
  //2D array
  public static final int[][] MAX_HP = 
  new int[][] {
   {10,20,30,40,50,60,70,80,90,100},
   {10,20,30,40,50,60,70,80,90,100},
   {10,20,30,40,50,60,70,80,90,100}
  };

  public static int maxhp(int Role ,int level){
    return MAX_HP[Role][level-1];
  }
  
  /** abstract int getRole();
   * 
   * in child :
   * public int getRole(){
   * return Heros.1 ;}
   * 
   * get the info from child
  */
  

}
