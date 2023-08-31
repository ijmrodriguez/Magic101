public class Reference
{
    //Variables
    String name;

    //Constructors
    public Reference(String name)
    {
        this.name = name;
    }

    public Reference()
    {
        String name;
    }

    //Getter
    public String getName()
    {
        return name;
    }

    //Setter
    public void setName(String name)
    {
        this.name = name;
    }

    //toString
    @Override
    public String toString()
    {
        return "Reference{" +
                "name='" + name + '\'' +
                '}';
    }
}
