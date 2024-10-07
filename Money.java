/* 
Java QAP 2 
By: Brian Jackman
2024/10/08
 */

public class Money {
    private long dollars;
    private long cents;

    // Constructors
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Add method
    public Money add(Money otherAmount) {
        long totalCents = this.cents + otherAmount.cents;
        long totalDollars = this.dollars + otherAmount.dollars + totalCents / 100;
        totalCents = totalCents % 100;
        return new Money(totalDollars + totalCents / 100.0);
    }

    // Subtract method
    public Money subtract(Money otherAmount) {
        long totalCents = this.cents - otherAmount.cents;
        long totalDollars = this.dollars - otherAmount.dollars;
        if (totalCents < 0) {
            totalCents += 100;
            totalDollars -= 1;
        }
        return new Money(totalDollars + totalCents / 100.0);
    }

    // CompareTo method
    public int compareTo(Money other) {
        if (this.dollars > other.dollars || (this.dollars == other.dollars && this.cents > other.cents)) {
            return 1;
        } else if (this.dollars < other.dollars || (this.dollars == other.dollars && this.cents < other.cents)) {
            return -1;
        } else {
            return 0;
        }
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}