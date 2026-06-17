package inheritanceStudy;
// multilevel inheritance of grandfather father and daughter
public class Daughter extends Father {


    public void bike(){
        super.house();
        super.land();
        System.out.println("The owned bike of daughter");

    }




    public void degree(){
        System.out.println("The owned degree of Daughter");
    }

    static void main(String[] args) {
        Daughter daughter=new Daughter();
        daughter.house();  // property of father
        daughter.car();  // property of father
        daughter.bike(); // property of daughter
        daughter.degree(); //property of daughter
        daughter.land();  // property of grandfather
        Daughter.gold();  // proper of grandfather
        GrandFather grandFather=new GrandFather();
        grandFather.house();
        daughter.land();






    }



}


// in multilevel i have dout if same property is grandfather and father then he gave the father property