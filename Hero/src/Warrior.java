public class Warrior extends Hero{

  public Warrior(){
    super("Warrior");
    this.upLv();
    this.sethp();
    this.setmp();
  }

    public void upLv(){
    this.addlevel();
    this.setmaxhp(1.13);
    this.setmaxmp(1.11);
    this.setmp();
    this.sethp();;
    this.setag(1.12);
    this.setpapd(1.13);
    this.setmamd(1.11);
    this.setcc(1.11);
    this.setcd(1.13);
  }

  @Override
  public int getDamage(){
    double random = Math.random();
    //System.out.println("Warrior " + random + " | " + this.getcc());
    if (random < this.getcc()){
      return (int) Math.round((this.getma() + (this.getpa() * 3 ))* this.getcd()) ;
    } else {
      return (int) Math.round(this.getma() + this.getpa()* 3) ;
    }
    
  }




  public static void main(String[] args) {
    Warrior w1 = new Warrior();
    w1.upLv();
    Mage m1 = new Mage();
    w1.upLv();
    w1.upLv();
    System.out.println(w1 +" "+m1);
    w1.attack(m1);
    System.out.println(w1 +" "+m1);
    w1.upLv();
    w1.attack(m1);
    System.out.println(w1 +" "+m1);
    m1.upLv();
    m1.attack(w1);
    System.out.println(w1 +" "+m1);


  }

}
