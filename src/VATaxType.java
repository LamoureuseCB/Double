import java.math.BigDecimal;

public class VATaxType extends TaxType{
    private BigDecimal vaTax = new BigDecimal("0.18");
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(vaTax);
    }
}
