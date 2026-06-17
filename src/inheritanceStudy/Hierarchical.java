package inheritanceStudy;

public class Hierarchical {

    static void main(String[] args) {
        Mother mother=new Mother();
        Son1 son1=new Son1();
        Son2 son2=new Son2();
        son1.laptop();  // property of son1
        son1.mobile();   // property of son1
        son1.Nature();  // property of mother
        Mother.weight();  // son 1 accuire property of owned and mother


        son2.scooty(); //property of son2
        son2.watch();   //property of son2
        son2.Nature();   // property of mother
        Mother.weight();  //  son 2 accuire property of owned and mother it static method
                            // static methof of suprclass or sub class we can access both class name. method name



    }
}
