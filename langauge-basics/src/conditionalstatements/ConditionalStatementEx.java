package conditionalstatements;

public class ConditionalStatementEx {

    public static void main(String[] args) {
        positiveNums(5);
        positiveNegatives(0);
        switchCase(2);
    }

    //if else
    public static void positiveNums(int n) {
        if (n > 0) {
            System.out.println(n + " is positive number");
        } else {
            System.out.println(n + " is negative or zero");
        }
    }

    /* if else if */
    public static void positiveNegatives(int n) {
        if (n > 0) {
            System.out.println(n + " positive");
        } else if (n < 0) {
            System.out.println(n + " negative");
        } else {
            System.out.println(" its zero");
        }

    }

    //switch case
    public static void switchCase(int day) {

        switch (day) {
            case 1:
                System.out.println("day 1");
                break;
            case 2:
                System.out.println("day 2");
                break;
            default:
                System.out.println("invalid");
        }

    }
}


