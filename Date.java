public class Date 
{
    // data members
	private integer day;
	private integer month;
	private integer year;


    // constructor 
	public Date(day, month, year)
	{
		this.day = day;
		this.month = month;
        this.year= year;
	}

    // is leap year?
    public bool leapYear()
    {
        
    }

    // days since January first of this year
	public int daysSinceJan1()
	{
        int daysSince = 0;
        int startMonth = 1;
        int endMOnth = this.month;

        while(startMonth != endMonth)
        {
            daysSince += daysInMonth(startMonth());
            startMonth++;
        }

        daysSince += this.days;

        return daysSince;

	}

    // is leap year
    public boolean isLeapYear()
    {
        return this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0)
    }

    // days in month
    public int daysInMonth()
    {
        if ( this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12 )
        {
            return 31
        }
        else if ( this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11 )
        {
            return 30
        }
        else if ( this.month == 2 )
        {
            return isLeapYear() ? 29 : 28;
        }
        else
        {
            return 0;
        }
    }
}
