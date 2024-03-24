import java.math.BigDecimal;

public class IncomeTaxType extends TaxType{
    private BigDecimal incomeTax = new BigDecimal("0.13");
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(incomeTax);
    }
}
