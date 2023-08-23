public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 1;
        this.denominator = 2;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction multiplay(Fraction fract1, Fraction fract2) {
        Fraction res = new Fraction();
        res.setNumerator(fract1.getNumerator() * fract2.getNumerator());
        res.setDenominator(fract1.getDenominator() * fract2.getDenominator());
        return res;
    }

    public Fraction division(Fraction fract1, Fraction fract2) {
        Fraction res = new Fraction();
        res.setNumerator(fract1.getNumerator() * fract2.getDenominator());
        res.setDenominator(fract1.getDenominator() * fract2.getNumerator());
        return res;
    }

    public Fraction summ(Fraction fract1, Fraction fract2) {
        Fraction res = new Fraction();
        res.setNumerator(fract1.getNumerator() * fract2.getDenominator() + fract2.getNumerator() * fract1.getDenominator());
        res.setDenominator(fract1.getDenominator() * fract2.getDenominator());
        return res;
    }

    public Fraction subtraction(Fraction fract1, Fraction fract2) {
        Fraction res = new Fraction();
        res.setNumerator(fract1.getNumerator() * fract2.getDenominator() - fract2.getNumerator() * fract1.getDenominator());
        res.setDenominator(fract1.getDenominator() * fract2.getDenominator());
        return res;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String showFract(){
        String str = new String();
        str = String.format("%d/%d", this.numerator, this.denominator);
        return str;
    }
}
