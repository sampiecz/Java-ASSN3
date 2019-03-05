public class Date 
{
    // data members
	private int day;
	private int month;
	private int year;


    // constructor 
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
        this.year= year;
	}

        // is leap year
    public boolean isLeapYear()
    {
        return this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0);
    }

    // days in month
    public int daysInMonth(int month)
    {
        if ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
        {
            return 31;
        }
        else if ( month == 4 || month == 6 || month == 9 || month == 11 )
        {
            return 30;
        }
        else if ( month == 2 )
        {
            return isLeapYear() ? 29 : 28;
        }
        else
        {
            return 0;
        }
    }

    // days since January first of this year
	public int daysSinceJan1()
	{
        int daysSince = 0;
        int startMonth = 1;
        int endMonth = this.month;

        while(startMonth != endMonth)
        {
            daysSince += daysInMonth(startMonth);
            startMonth++;
        }

        daysSince += this.day;

        return daysSince;

	}


}
