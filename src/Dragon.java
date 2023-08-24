public class Dragon extends MagicAnimal
{
 //Variables
 int numsWings;
 String scaleColor;

 //Constructor
 public Dragon(String name, String type, int speed, double weight, int numsWings, String scaleColor)
 {
  super(name, type, speed, weight);
  this.numsWings = numsWings;
  this.scaleColor = scaleColor;
 }
}
