package inheritanceStudy;

public class Multilevel {

    static void main(String[] args) {
            Daughter daughter=new Daughter();
            Father father=new Father();
            GrandFather grandFather=new GrandFather();

            daughter.house();  // property of father
            daughter.car();  // property of father
            daughter.bike(); // property of daughter
            daughter.degree(); //property of daughter
            daughter.land();  // property of grandfather
            Daughter.gold();  // proper of grandfather
    }


}
