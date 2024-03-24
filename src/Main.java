
public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        TaxType taxType = new TaxType();
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        VATaxType vaTaxType = new VATaxType();
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();
        Bill[] payments = new Bill[] {new Bill(1000.115, incomeTaxType,taxService), new Bill(10000.155,vaTaxType, taxService),new Bill(10000.505,progressiveTaxType, taxService)};

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}