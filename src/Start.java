public class Start {
    enum months {January, February, March, April, May, June, July, August, September, October, November, December};
    public static void main(String[] args) {
       /* EnumMonths january = new EnumMonths(EnumMonths.Months.January);
        EnumMonths march = new EnumMonths(EnumMonths.Months.March);
        EnumMonths july = new EnumMonths(EnumMonths.Months.July);
        EnumMonths november = new EnumMonths(EnumMonths.Months.November);
        january.printMonths();
        march.printMonths();
        july.printMonths();
        november.printMonths();*/
        System.out.println(months.January + " ends with y");
        System.out.println(months.February + " ends with y");
        System.out.println(months.March + " doesn't end with y");
        System.out.println(months.April + " doesn't end with y");
        System.out.println(months.May + " ends with y");
        System.out.println(months.June + " doesn't end with y");
        System.out.println(months.July + " ends with y");
        System.out.println(months.August + " doesn't end with y");
        System.out.println(months.September  + " doesn't end with y");
        System.out.println(months.October + " doesn't end with y");
        System.out.println(months.November + " doesn't end with y");
        System.out.println(months.December + " doesn't end with y");
    }
}
