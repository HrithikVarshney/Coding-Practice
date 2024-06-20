package Oops;

public class Fraction {

    private int numerator ;
    private int denominator ;

    public void setNumerator(int num){
        this.numerator = num ;
        simplify();
    }
    public int getNumerator(){
        return numerator;
    }
    public void setDenominator(int num){
        if (num == 0)
            denominator = 1;
        this.denominator = num;
        simplify();
    }
    public int getDenominator(){
        return denominator;
    }
    public Fraction(int numerator , int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    public void print(){
        System.out.println(numerator + "/" + denominator);
    }
    public void simplify(){
        int gcd = 1;
        int min = Math.min(numerator,denominator);
        for(int i = 2 ; i<=min ; i++){
            if(numerator%i == 0 && denominator%i==0){
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }
    public void increment(){
        numerator = numerator + denominator;
        simplify();
    }

    public void add(Fraction F2 ){
        this.numerator = this.numerator * F2.denominator + this.denominator * F2.numerator;
        this.denominator = this.denominator * F2.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1 , Fraction f2){
        int newNumerator = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int newDenominator = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newNumerator ,newDenominator);
        return f3;
    }
}
