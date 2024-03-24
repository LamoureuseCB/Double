public class ProgressiveTaxType extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        if(amount < 100000){
            return 0.1;
        }
        else
        return 0.15;
    }
}
