package stringStudy;

public class StringBufferBuilderStudy {
    static void main(String[] args) {
        String name="velocity";
        //name=name+"test";
         String name1=name.replace("v","V");
        System.out.println(name1);
        // String name1=name+"pune";
        //stem.out.println(name1);
//string >> if you are work  in string its not allowed to change origin string if you want to change then you have to  stored

        StringBuffer city =new StringBuffer("mumbai");
        city.append("MH");
        city.replace(0,1,"M");
        System.out.println(city);
        System.out.println(city.reverse());


        StringBuffer gender=new StringBuffer("male");
        gender.append("Gender");
        gender.insert(0,"Test");
        gender.delete(0,4);
        System.out.println(gender);

    }
}
