public class Unicorn extends MagicAnimal
{
    //Variable
    double hornSharpness;

    //Constructor
    public Unicorn(String name, String type, int speed, double weight, double hornSharpness)
    {
        super(name, type, speed, weight);
        this.hornSharpness = hornSharpness;
    }
}
