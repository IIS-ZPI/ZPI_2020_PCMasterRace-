public class ArithmeticsDiv implements IArithmeticsDiv {
    @Override
    public double Division(double A, double B) throws ArithmeticException {
        if (B == 0)
            throw new ArithmeticException();
        return A / B;
    }
}