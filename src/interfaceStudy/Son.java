package interfaceStudy;
//mother father son
public class Son implements Father,Mother {

    static void main(String[] args) {
        Son son=new Son();
        son.hardwork();  //father method compl in Son class
        son.hohest();  //father method compl in Son class
        son.kind();    //mother method compl in Son class
        son.nature();   //mother method compl in Son class
        son.love();      //same method two class  then call  method with classname.Super.methodname
        Father.clever(); // this is satatic method to called in son class
        Mother.brave();   // this is satatic method to called in son class

    }
    @Override
    public void hohest() {
        System.out.println("Father honest is comleted in Son class");


    }

    @Override
    public void hardwork() {
        System.out.println("Father hardwork is comleted in Son class");


    }

    @Override
    public void love() {
        Father.super.love();
    }




    @Override
    public void nature() {
        System.out.println("Mother  nature  is comleted in Son class");


    }

    @Override
    public void kind() {
        System.out.println("MOther  kind is comleted in Son class");


    }
}
