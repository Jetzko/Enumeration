
public class EnumMonths {
    Months months;
    enum Months {January, February, March, April, May, June, July, August, September, October, November, December};
    public EnumMonths(Months months){
       this.months = months;
    }
    public void printMonths(){
        switch (months){
            case January:
                System.out.println("January ends with y");
                break;
            case February:
                System.out.println("February ends with y");
                break;
            case March:
                System.out.println("March doesn't end with y");
                break;
            case April:
                System.out.println("April doesn't end with y");
                break;
            case May:
                System.out.println("May ends with y");
                break;
            case June:
                System.out.println("June doesn't end with y");
                break;
            case July:
                System.out.println("July ends with y");
                break;
            case August:
                System.out.println("August doesn't end with y");
                break;
            case September:
                System.out.println("September doesn't end with y");
                break;
            case October:
                System.out.println("October doesn't end with y");
                break;
            case November:
                System.out.println("November doesn't end with y");
                break;
            case December:
                System.out.println("December doesn't end with y");
                break;


        }
    }
}
