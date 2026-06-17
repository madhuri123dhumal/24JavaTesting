package stringStudy;

public class StringMethods {

    static void main(String[] args) {
        String a1 = "Velocity";
        //1.length
        System.out.println(a1.length());
        int Stringlength = a1.length();
        System.out.println("the length is " + Stringlength);
        System.out.println("==================");

        String a2 = "";
        System.out.println(a2.length());
        int Stringlength1 = a2.length();
        System.out.println("the length is " + Stringlength);
        System.out.println("==================");

//        String a3=null;
//        System.out.println(a3.length());
//        int Stringlength2=a3.length();
//        System.out.println("the length is "+Stringlength);
//        System.out.println("==================");

        //2.uppercase
        String a4 = "Pune";
        System.out.println(a4.toUpperCase());
        String Stringlength3 = a4.toUpperCase();
        System.out.println("the length is " + Stringlength3);
        System.out.println("==================");

        //3.lowerCase

        String a5 = "Madhuri";
        System.out.println(a5.toLowerCase());
        String Stringlength4 = a5.toLowerCase();
        System.out.println("the length is " + Stringlength4);
        System.out.println("==================");

        //4.equals() check memory alloction
        // == check context

        String c1 = "pune";
        String c2 = "pune";
        String c3 = new String("pune");
        String c4 = new String("pune");
        System.out.println(c1.equals(c2));
        //5.equalIgnoreCase
        System.out.println(c1.equalsIgnoreCase(c2));

        System.out.println(c1 == c4); //false
        System.out.println(c1 == c2); //true
        System.out.println(c3 == c4);//true
        System.out.println(c1.equals(c2)); //true
        System.out.println(c1.equals(c3)); //false
        System.out.println("==================");

        //6 Contains
        String d1 = "katraj";
        boolean Result = d1.contains("aj");
        System.out.println(Result);
        String d2 = "Madhuri";
        boolean Result1 = d2.contains("sa");
        System.out.println(Result1);
//        String d3=null;
//        d3.contains("t");
        String d4 = " ";
        System.out.println(d4.contains("t"));
        System.out.println("==================");


        //7 isempty lenght 0>true length non zero>>False
        String e1 = "";
        System.out.println(e1.isEmpty());
        String e2 = "pune";
        System.out.println(e2.isEmpty());

        String e3 = " ";
        String e4 = "";
        String e5 = null;
        String e6 = "madhuri";
        //System.out.println(e5.length());
        System.out.println(e6.length());
        System.out.println(e3.length());
        System.out.println(e4.length());

        System.out.println(e3.isEmpty());
        System.out.println(e4.isEmpty());
        System.out.println(e3.isBlank());
        System.out.println(e4.isBlank());
        System.out.println("==================");

        //8char At
        String f1 = "Velocity Testing";
        System.out.println(f1.charAt(3));
        System.out.println(f1.charAt(9));
        //System.out.println(f1.charAt(90));
        System.out.println("==================");

        // 9.endwith

        String h1 = "selenium";
        String h2 = "Java";
        String h3 = "testing";
        System.out.println(h1.endsWith("m"));
        System.out.println(h1.endsWith("ium"));
        System.out.println(h1.endsWith("lenium"));
        System.out.println(h1.endsWith("sel"));
        System.out.println("==================");
        // 10startwith
        System.out.println(h1.startsWith("sel"));
        System.out.println(h2.startsWith("J"));

        //11 Substring
        String k1 = "Velocity Corporate training Center";
        String k2 = k1.substring(9);
        System.out.println(k2);
        String k3 = k1.substring(9, 22);
        System.out.println(k3);
        System.out.println("==================");

        //12 Concat
        String l1 = "java";
        String l2 = "Selenium";
        String l3 = l1.concat(l2);
        System.out.println(l3);

        System.out.println(l1.concat(" ").concat(l2));
        System.out.println(l1.concat(" ").concat("testing").concat(" ").concat(l2));
        System.out.println("==================");

        //13 indexof

        String J1 = "Pune";
        int index = J1.indexOf('n'); //index of first occurance
        System.out.println(index);
        System.out.println("==================");

        String J2 = "testing";
        System.out.println(J2.indexOf('t'));
        System.out.println(J2.lastIndexOf('t')); //user for last occurance
        System.out.println("==================");

        String J3 = "enginineeeringe";
        System.out.println(J3.indexOf('i', 4)); //ocuurence in middle
        System.out.println(J3.indexOf("in"));
        System.out.println(J3.lastIndexOf("in"));
        System.out.println(J3.indexOf('e', 7, 10));
        System.out.println(J3.indexOf("in", 4, 9));
        System.out.println(J3.indexOf('e', 7, 9));
        System.out.println("==================");

        //14 Replace

        String N = "testing";
        String test = N.replace('t', 'b'); // single character replace
        System.out.println(test);
        System.out.println(N.replace("tes", "mad"));

        String N1="engineering";
        System.out.println(N1.replace("in","MA")); //all occurence replace
        System.out.println(N1.replaceFirst("in","MA")); //first occureence replace

        String test1=N1.replaceAll("engineering","madhuridhuma"); // all string replace
        System.out.println(test1);

        System.out.println(N.replaceAll("testing","madhuri"));



    }
}