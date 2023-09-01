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

    //Getters
    public double getHornSharpness()
    {
        return hornSharpness;
    }
    public String getFur()
    {
        return fur;
    }

    //Setters
    public void setHornSharpness(double hornSharpness)
    {
        this.hornSharpness = hornSharpness;
    }

    public void setFur(String fur)
    {
        this.fur = fur;
    }

    //toString
    @Override
    public String toString() {
        return "Unicorn{" +
                "hornSharpness=" + hornSharpness +
                ", fur='" + fur + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
