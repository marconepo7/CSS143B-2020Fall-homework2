package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword

    }

    public MovieAction(MovieAction anotherMovie) {
        // homework
        // tip: use the 'super' keyword
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        int lateFees;
        if (numOfDaysPastDue > 5) {
            lateFees = 2 * numOfDaysPastDue * lateFeePerDayInDollar;
            return lateFees;
        }
        else
        {
            lateFees = numOfDaysPastDue * lateFeePerDayInDollar;
            return lateFees;
        }
    }
}
