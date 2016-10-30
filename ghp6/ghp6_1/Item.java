/**
 * Created by hajizar on 10/28/2016.
 */
public class Item {
    protected String name;
    protected double weight;
    protected double value;
    Item() {
        this.name = "";
        this.weight = 0;
        this.value = 0;
    }
    Item(String name, double weight, double value){
        this.name = name;
        this.weight = weight;
        this.value = value;
    }
    protected String getName(){
        return this.name;
    }
    protected double getWeight(){
        return this.weight;
    }
    protected double getValue(){
        return this.value;
    }
    protected void setName(String name){
        this.name = name;
    }
    protected void setWeight(double weight){
        this.weight = weight;
    }
    protected void setValue(double value){
        this.value = value;
    }
    public String toString(){
        return String.format("///////////\nName: %s\nWeight: %.1f\nValue: %.1f\n", this.name, this.weight, this.value );
    }
}
