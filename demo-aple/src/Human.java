// Human Max Hp = 100
// Sleep > full HP
public class Human {
  public static final int MAX_HP = 100; //不變的常數

  private String name;
  private int hp;

  public Human(String name ){
    this.name = name;
    this.hp = Human.MAX_HP;
  }

  public void eat(){
    this.hp += 10;
    if (this.hp > Human.MAX_HP){
      this.hp = Human.MAX_HP;
    }
  }

  public void sleep(){
    this.hp = Human.MAX_HP;
  }

  public void hurt(){
    this.hp -= 5;
  }

  public void dead(){

  }

  public static void main(String[] args) {
    
  }
  
}
