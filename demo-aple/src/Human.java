// Human Max Hp = 100
// Sleep > full HP
public class Human implements Eatable, Sleepable {
  public static final int MAX_HP = 100; //不變的常數

  private String name;
  private int hp;

  public Human(String name ){
    this.name = name;
    this.hp = Human.MAX_HP;
  }

  @Override
  public void eat(){
    this.hp += 10;
    if (this.hp > Human.MAX_HP){
      this.hp = Human.MAX_HP;
    }
  }

  @Override
  public void sleep(){
    this.hp = Human.MAX_HP;
  }

  public void hurt(int hit){
    this.hp -= hit;
    if (this.hp <= 0){
      this.hp = 0;
      this.dead();
    }
  }

  public void dead(){

  }

  public static void main(String[] args) {
    
  }
  
}
