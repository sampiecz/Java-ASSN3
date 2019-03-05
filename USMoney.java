/************************************************************
 *                                                          *
 *  CSCI 470-1   Assignment 3 Pt 1              Spring 2019 *
 *                                                          *
 *  Programmer:  Samuel Piecz                               * 
 *               z1732715                                   *
 *                                                          *
 *                                                          *
 *                                                          *
 *  Date Due:    3/06/19                                    *
 *                                                          *
 ************************************************************/

public class USMoney
{
	private int dollars;
	private int cents;

	// Create a USMoney class with two private integer instance variables named dollars and cents.  Add a constructor with two parameters for initializing a USMoney object.  The constructor should check that the cents value is between 0 and 99 and, if not, transfer some of the cents to the dollars variable to make it between 0 and 99.

    public USMoney(int cents, int dollars)
    {
		this.cents = cents;
		this.dollars = dollars;

		while(this.cents > 99 || this.cents < 0)
		{
			if (this.cents > 99 )
			{
				this.cents = this.cents - 100;
				this.dollars = this.dollars + 1;
			}
			else if (this.cents < 0)
			{
				try {
					this.dollars = this.dollars - 1;
					this.cents = this.cents + 100;
				}
				catch ( Exception e )
				{
					System.out.print("You can't have negative nums.");
				}
			}
		}
    }

	public int getDollars()
	{
		return this.dollars;
	}

	public int getCents()
	{
		return this.cents;
	}

	public USMoney plus(USMoney param)
	{
		return new USMoney(this.cents + param.getCents(), this.dollars + param.getDollars());
	}
}
