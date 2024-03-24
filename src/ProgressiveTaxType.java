import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    private BigDecimal under100 = new BigDecimal("0.1");
    private BigDecimal over100 = new BigDecimal("0.15");

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if(under100.compareTo(amount) <= 0){
            return amount.multiply(under100);
        }
        else{
            return amount.multiply(over100);

        }

    }
}
