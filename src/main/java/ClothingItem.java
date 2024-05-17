public class ClothingItem implements ISell{

    public double sellPrice;
    public double Cost;
    public String material;
    public String section;
    public int size;


    public ClothingItem (double inputsellPrice,double inputCost, String inputmaterial,String inputsection,int inputSize){
        this.sellPrice= inputsellPrice;
        this.Cost=inputCost;
        this.material = inputmaterial;
        this.section = inputsection;
        this.size = inputSize;

    }

    //getters and setters - setters change the value and getter change the value

    public double getSellPrice(){
        return sellPrice;
    }

    public void setSellPrice(double sellPrice){
        this.sellPrice = sellPrice;
    }

    public double getCost(){
        return Cost;
    }

    public void setCost(double Cost){
        this.Cost = Cost;
    }


    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }


    public String getSection(){
        return section;
    }

    public void setSection(String section){
        this.section = section;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }


    ///Calculate Margin

    public double calculateMargin(){
        double margin = this.sellPrice - this.Cost;
        return margin;
    }

}
