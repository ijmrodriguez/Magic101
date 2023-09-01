public class Unicorn extends MagicAnimal
{
    //Variable
    private double hornSharpness;
    private String fur;

    //Constructors
    public Unicorn(String name, String type, int speed, double weight, double hornSharpness, String fur)
    {
        super(name, type, speed, weight);
        this.hornSharpness = hornSharpness;
        this.fur = fur;
    }
    
    public Unicorn(String name)
    {
        super(name);
        this.name = name;
    }
}
