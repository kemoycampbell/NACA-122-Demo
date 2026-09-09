package moreonclassreview;

public class Year 
{
    public final static int DAYS_IN_YEAR  = 365;

    public int daysInYear(int year)
    {
        if(!isLeapYear(year))
            return DAYS_IN_YEAR;

        return DAYS_IN_YEAR + 1;
        
        // if(year%4!=0)
        //     return DAYS_IN_YEAR;

        // if(year % 400 == 0 && year % 100== 0)
        //         return DAYS_IN_YEAR;
        
        // return DAYS_IN_YEAR + 1;
    }

    private boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 400 == 0 && year% 100!=0;

    }

}
