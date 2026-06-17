package interfaceStudy;

public interface Father {

    void hohest();
    void hardwork();


    default void love() {
        System.out.println("Father Love");
    }

    static void clever() {
       System.out.println("Father cleverness");
    }
}