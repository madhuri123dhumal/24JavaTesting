package interfaceStudy;

public interface Mother {

    void nature();
    void kind();


    default void love()
    {
        System.out.println("Mother LOve ");
    }

    static void brave()
    {

        System.out.println("Mother brave");
    }
}

