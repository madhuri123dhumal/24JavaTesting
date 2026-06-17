package controlFlowStatement;

public class SwitchStatementStudy {

    static void main(String[] args) {

        //ATM options (1-Check Balance, 2-Withdraw, 3-Deposit)
        //case 1:check balabce
        //case2: withdrawal balance
        //case 3:deposit
        //default:select option between 1to 3

        int option=2;
        switch(option)
        {
            case 1:
                System.out.println("check Balanced");
                break;
            case 2:
                System.out.println("Withdrwal balanced");
                break;
            case 3:
                System.out.println("Deposit");
                break;
            default:
                System.out.println("select option between 1 to 3");
                break;

        }









    }









}
