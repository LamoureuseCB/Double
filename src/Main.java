import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        TaxType taxType = new TaxType();
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        VATaxType vaTaxType = new VATaxType();
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();
        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal("1000.505"), incomeTaxType,taxService),
                new Bill(new BigDecimal("2000.200"),vaTaxType, taxService),
                new Bill(new BigDecimal("5005.5001"),progressiveTaxType, taxService)};

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}