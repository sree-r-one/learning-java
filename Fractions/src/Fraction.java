
/**
 * Represents a fraction class with a numerator and a denominator 
 */
public class Fraction {

    // Instance Vars 

    /**
     * Numerator for the fraction
     */
    int numerator; 

    /**
     * Denominator for the fraction
    */
    int denominator;

    // Constructor
    
    /**
     * Creates a fraction with the given numerator and denominator 
     * @param numerator of the fraction 
     * @param denominator of the fraction
     */
    public Fraction(int numerator, int denominator){
        this.numerator = numerator; 
        this.denominator = denominator;
    }

    /**
     * Compares two fractions for equality by comparing their numerator and denominator
     */
    @Override
    public boolean equals(Object obj) {

        // Cast given object to fraction 
        Fraction otherFraction = (Fraction) obj; 

        // Compare the numerator and denominator 
        return (this.numerator == otherFraction.numerator && this.denominator == otherFraction.denominator);
    }



    
}
