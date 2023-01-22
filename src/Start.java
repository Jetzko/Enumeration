import javax.swing.event.SwingPropertyChangeSupport;

public class Start {
    public static void main(String[] args) {
        EnumMonths january = new EnumMonths(EnumMonths.Months.January);
        EnumMonths march = new EnumMonths(EnumMonths.Months.March);
        EnumMonths july = new EnumMonths(EnumMonths.Months.July);
        EnumMonths november = new EnumMonths(EnumMonths.Months.November);
        january.printMonths();
        march.printMonths();
        july.printMonths();
        november.printMonths();
    }
}
