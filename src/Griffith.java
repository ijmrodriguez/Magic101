public class Griffith extends MagicAnimal
{
    //Variables
    private String featherColor;
    private int wings;

    //Constructors
    public Griffith(String name, String type, int speed, double weight, String featherColor, int wings)
    {
        super(name, type, speed, weight);
        this.featherColor = featherColor;
        this.wings = wings;
    }

}
