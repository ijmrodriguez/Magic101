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
}
