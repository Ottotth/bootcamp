public class Archer extends Hero{


  public Archer(){
    super("Archer");
    this.upLv();
    this.sethp();
    this.setmp();
  }

    public void upLv(){
    this.addlevel();
    this.setmaxhp(1.11);
    this.setmaxmp(1.12);
    this.sethp();
    this.setmp();
    this.setag(1.13);
    this.setpapd(1.12);
    this.setmamd(1.12);
    this.setcc(1.13);
    this.setcd(1.11);
  }

    @Override
  public int getDamage(){
    double random = Math.random();
    //System.out.println(random + " | " + this.getcc());
    if (random < this.getcc()){
      return (int) Math.round((this.getpa() * 2 + (this.getma() * 1.5 ))* this.getcd()) ;
    } else {
      return (int) Math.round(this.getpa() * 2 + this.getma()* 1.5) ;
    }
    
  }

}
