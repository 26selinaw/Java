public class Time
{
    public static void main(final String[] args) {
        System.out.println("started!");
        final Time t = new Time(9, 5, 11);
    }

    private int hrs;
    private int mins;
    private int secs;

    public Time() {
        /* implementation not shown */ }

    public Time(final int h, final int m, final int s) { /* implementation not shown */
        hrs = h;
        mins = m;
        secs = s;

        System.out.println("in construcotor method!");
    }

    public void resetTime(final int h, final int m, final int s) {
        /* implementation not shown */ }

    public void increment() {
        /* implementation not shown */ }

    /** @return true if this time equals t, false otherwise */
    public boolean equals(final Time t) { /* implementation not shown */
        return true;
    }

    /** @return true if this time is earlier than t, false otherwise */
    public boolean lessThan(final Time t)
    { /* implementation not shown */
        return true;
    }

    /** @return a String with the time in the form hrs:mins:secs */
    public String toString()
    { /* implementation not shown */
        return "hi";
    }
      
}
