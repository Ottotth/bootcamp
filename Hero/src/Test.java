public class Test {
  public static void main(String[] args) {
    Warrior w1 = new Warrior();
    w1.upLv();
    Archer a1 = new Archer();
    w1.upLv();
    w1.upLv();
    System.out.println(w1 +" "+a1);
    w1.attack(a1);
    System.out.println(w1 +" "+a1);
    w1.upLv();
    w1.attack(a1);
    System.out.println(w1 +" "+a1);
    a1.upLv();
    a1.attack(w1);
    System.out.println(w1 +" "+a1);
    a1.upLv();
    w1.upLv();
    System.out.println(w1 +" "+a1);
    a1.upLv();
    a1.upLv();
    a1.upLv();
    a1.attack(w1);
    System.out.println(w1 +" "+a1);

    // Object ref type can be different, but i must be parent
    Hero w2 = new Warrior();
    // it can make a hero array
    Hero[] myHeros = new Hero[2];
    myHeros[0] = new Warrior();
    myHeros[1] = new Mage();

    myHeros[1].attack(w2);

    myHeros[1].upLv(); // add abstract method in ref type
    // 1. During complie time , Java won't confirm the actual object type
    // 2. Based on Object Ref Type for calling method

    // Object as ref type , it can point to all type of object
    // Object cat = new Cat();

    Object[] heros = new Object[2];
    heros[1] = new Warrior();
    // heros[1].attack(); // error:Based on Object Ref Type for calling method

    Hero[] heros2 = new Hero[2];
    heros2[0] = new Warrior();
    heros2[0].attack(w2);

    


  }
  
}
