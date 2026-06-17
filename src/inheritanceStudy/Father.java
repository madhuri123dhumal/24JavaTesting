package inheritanceStudy;

public class Father  extends GrandFather{


    public void car(){
        System.out.println("owner car of father ");

    }

    public void house()
    { super.land();
        System.out.println("the owned housed of father");
    }



    static void main(String[] args) {
        Father father= new Father();
        father.house();
        father.car();
        GrandFather.gold();
        father.land();

    }



}

