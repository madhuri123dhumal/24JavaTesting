package casting;

public class ClassCastingStudy {

    static void main(String[] args) {
//here creating a super class object so all super class method call
        Father father=new Father();
        father.bike(); //mahindra
        father.car();// m80


        System.out.println("========================================");

        //here we are creating a sub class object call subclass method
        Son son=new Son();
        son.bike();  //tesla
        son.car(); //bugati
        son.education();//mcom

        System.out.println("========================================");

        //here  creating a subclass object and aplied the datatye is Father superclass so here only common method  of
        //father and son call
        Father son1=new Son();
        son1.car(); //tesla
        son1.bike(); //bugati
        son1.nature();




    }
}
