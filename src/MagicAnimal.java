public class MagicAnimal
{
    //Variables
    public String name, type; int speed; double weight;

    //Constructor
    public MagicAnimal(String name, String type, int speed, double weight)
    {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.weight = weight;
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
    @Override
    public String toString()
    {
        return "MagicAnimal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed + '\'' +
                ", weight=" + weight +
                '}';
    }
}
