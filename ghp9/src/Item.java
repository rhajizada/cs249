/*  ghp6 part 1 Weapon Class
 Written by Rufat Hajizada for CS249
 Language: Java
*/
public class Item {
    protected String name; // item's name
    protected double weight; // item's weight
    protected double value; // item's value
    Item() {
        // default constructor
        this.name = "";
        this.weight = 0;
        this.value = 0;
    }
    Item(String name, double weight, double value){
        // constructor that sets the name weight and value of the item to the input
        this.name = name;
        this.weight = weight;
        this.value = value;
    }
    protected String getName(){
        // returns item's name
        return this.name;
    }
    protected double getWeight(){
        //returns item's weight
        return this.weight;
    }
    protected double getValue(){
        // returns item's value
        return this.value;
    }
    protected void setName(String name){
        // sets the name of item to the input one
        this.name = name;
    }
    protected void setWeight(double weight){
        // sets the weight of the item to the input one
        this.weight = weight;
    }
    protected void setValue(double value){
        // sets the value of the item to the input one
        this.value = value;
    }
    public String toString(){
        // overriden toString method returns the string contatining information aboutt the item
        return String.format("///////////\nName: %s\nWeight: %.1f\nValue: %.1f\n", this.name, this.weight, this.value );
    }
}
