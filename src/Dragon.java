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
    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public int getSpeed()
    {
        return speed;
    }

    public double getWeight()
    {
        return weight;
    }

    public int getNumsWings()
    {
        return numsWings;
    }

    private String getScaleColor()
    {
        return scaleColor;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    //toString
    public String toString()
    {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed + '\'' +
                ", weight=" + weight + '\'' +
                ", wings='" + numsWings + '\'' +
                ", color='" + scaleColor +
                '}';
    }
}
