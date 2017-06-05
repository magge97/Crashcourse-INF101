// OPPGAVE 11/13
public class MyFraction implements IFraction {

  private final long numerator;
  private final long denominator;

  public MyFraction(long numerator, long denominator) {
    if (denominator == 0) {
      throw new IllegalArgumentException("Denominator can't be 0.");
    }
    if (denominator < 0) {
      //normalize sign
      numerator = -numerator;
      denominator = -denominator;
    }

    long gcd = gcd(numerator, denominator);

    this.numerator = numerator/gcd;
    this.denominator = denominator/gcd;
  }

  // OPPGAVE 14
  // Datainvariant:
  // - normalisert fortegn (ikke negativ nevner)
  // - nevner ulik 0
  // - forenklet
  public boolean checkState() {
    if (!(denominator > 0)) {
      throw new IllegalStateException("blablabla");
    }
    if (gcd(numerator, denominator) != 1) {
      throw new IllegalStateException("blablabla");
    }
    return true;
  }


}
