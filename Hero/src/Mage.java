public class Mage extends Hero {


  public Mage(){
    super("Mage");
    this.upLv();
    this.sethp();
    this.setmp();
  }

    public void upLv(){
    this.addlevel();
    this.setmaxhp(1.12);
    this.setmaxmp(1.13);
    this.sethp();
    this.setmp();
    this.setag(1.11);
    this.setpapd(1.11);
    this.setmamd(1.13);
    this.setcc(1.12);
    this.setcd(1.12);
  }


   @Override
  public int getDamage(){
    double random = Math.random();
    //System.out.println("Mage " + random + " | " + this.getcc());
    if (random < this.getcc()){
      return (int) Math.round((this.getpa() + (this.getma() * 3 ))* this.getcd()) ;
    } else {
      return (int) Math.round(this.getpa() + this.getma()* 3) ;
    }
    
  }

  
}
