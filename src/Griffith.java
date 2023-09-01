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

    public Griffith(String name)
    {
        super(name);
        this.name = name;
    }

    //Getters
    public String getFeatherColor()
    {
        return featherColor;
    }

    public int getWings()
    {
        return wings;
    }

    //Setters
    public void setFeatherColor(String featherColor)
    {
        this.featherColor = featherColor;
    }

    public void setWings(int wings)
    {
        this.wings = wings;
    }

    //toString
    @Override
    public String toString() {
        return "Griffith{" +
                "featherColor='" + featherColor + '\'' +
                ", wings=" + wings +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
