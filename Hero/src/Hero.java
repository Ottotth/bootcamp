import java.math.BigDecimal;

public abstract class Hero implements HeroAction {

  private static int idadd = 100;
  private int id;
  private String role;
  private int level;
  private int maxhp;
  private int hp;
  private int maxmp;
  private int mp;
  private double pa;
  private double pd;
  private double ma;
  private double md;
  private double ag;
  private double cc;
  private double cd;

  public Hero(String role) {
    this.role = role;
    Hero.idadd += 1;
    this.id = Hero.idadd;
    this.maxhp = 100;
    this.maxmp = 100;
    this.level = 0;
    this.pa = 1;
    this.pd = 1;
    this.ma = 1;
    this.md = 1;
    this.ag = 1;
    this.cc = 0.1;
    this.cd = 1;
  }

  public String getRole(){
    return this.role;
  }

  public int getlevel() {
    return this.level;
  }

  public void setmaxhp(double up) {
    this.maxhp = BigDecimal.valueOf(this.maxhp).multiply(BigDecimal.valueOf(up))
        .intValue();
  }

  public int getmaxhp() {
    return this.maxhp;
  }

  public void sethp(){
    this.hp = maxhp;
  }

  public int gethp(){
    return this.hp;
  }

  public void setmaxmp(double up) {
    this.maxmp = BigDecimal.valueOf(this.maxmp).multiply(BigDecimal.valueOf(up))
        .intValue();
  }

  public int getmaxmp() {
    return this.maxmp;
  }

  public void setmp(){
    this.hp = maxhp;
  }

  public int getmp(){
    return this.mp;
  }

  public void setag(double up) {
    this.ag = BigDecimal.valueOf(this.ag).multiply(BigDecimal.valueOf(up))
        .doubleValue();
  }

  public double getag() {
    return this.ag;
  }

  public void setpapd(double up) {
    this.pa = BigDecimal.valueOf(this.pa).multiply(BigDecimal.valueOf(up))
        .doubleValue();
    this.pd = BigDecimal.valueOf(this.pd).multiply(BigDecimal.valueOf(up))
        .doubleValue();
  }

  public double getpa() {
    return this.pa;
  }

  public double getpd() {
    return this.pd;
  }

  public void setmamd(double up) {
    this.md = BigDecimal.valueOf(this.ma).multiply(BigDecimal.valueOf(up))
        .doubleValue();
    this.ma = BigDecimal.valueOf(this.ma).multiply(BigDecimal.valueOf(up))
        .doubleValue();
  }

  public double getma() {
    return this.ma;
  }

  public double getmd() {
    return this.md;
  }

  public void setcc(double up) {
    this.cc = BigDecimal.valueOf(this.cc).multiply(BigDecimal.valueOf(up))
        .doubleValue();
  }

  public double getcc() {
    return this.cc;
  }

  public void setcd(double up) {
    this.cd = BigDecimal.valueOf(this.cd).multiply(BigDecimal.valueOf(up))
        .doubleValue();
  }

  public double getcd() {
    return this.cd;
  }



  public int getId() {
    return this.id;
  }

  public boolean isAlive(){
    return this.hp < 0;
  }

  

  @Override
  public void attack(Hero hero) {
    int damage = this.getDamage();
    hero.damage(damage);
  }

  abstract void upLv();

  abstract int getDamage();


  @Override
  public void damage(int damage) {
    damage = (int) Math.round(damage - this.pd - this.md);
    this.hp = this.hp - damage;
    if (this.hp < 0) this.hp = 0;
  }

  public void addlevel() {
    this.level++;
  }

  @Override
  public String toString(){
  return this.role + " Level :" + this.level + " | Hp:" + this.hp; 
  }



}
