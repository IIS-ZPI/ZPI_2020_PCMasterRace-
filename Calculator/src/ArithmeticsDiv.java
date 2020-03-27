public class ArithmeticsDiv implements IArithmeticsDiv {  // krzysiek1
    @Override
    public double Division(double A, double B) throws ArithmeticException {
        if (B == 0)
            throw new ArithmeticException(); // bartek3
        return A / B;
    }
}
// KOMENTARZ DO USUNIECIA KRZYSIEK