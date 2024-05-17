public class Trouser extends ClothingItem {

    public String fastening;
    private double legLength;

    public Trouser (double cost, double sellPrice, String material, String section, int size, String fastening, double leglength){
        super(cost,sellPrice,material,section,size);
        this.fastening = fastening;
        this.legLength = leglength;
    }
    public void hemming(double cutAmount){
        double newLength = this.legLength - cutAmount;
        setLegLength(newLength);
    }


    //    GETTERS AND SETTERS

    public String getFastening() {
        return fastening;
    }

    public void setFastening(String fastening) {
        this.fastening = fastening;
    }

    public double getLegLength() {
        return legLength;
    }

    public void setLegLength(double legLength) {
        this.legLength = legLength;
    }

}
