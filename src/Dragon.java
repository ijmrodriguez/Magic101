public class Dragon extends MagicAnimal
{
 //Variables
 private int numsWings;
 private String scaleColor;

 //Constructors
 public Dragon(String name, String type, int speed, double weight, int numsWings, String scaleColor)
 {
  super(name, type, speed, weight);
  this.numsWings = numsWings;
  this.scaleColor = scaleColor;
 }

 public Dragon(String name)
 {
  super(name);
  this.name = name;
 }

 //Getters
 public int getNumsWings()
 {
  return numsWings;
 }
 public String getScaleColor()
 {
  return scaleColor;
 }

 //Setters
 public void setScaleColor(String scaleColor)
 {
  this.scaleColor = scaleColor;
 }
 public void setNumsWings(int numsWings)
 {
  this.numsWings = numsWings;
 }
}