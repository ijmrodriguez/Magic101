import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Reference karen = new Reference("Karen");
        Dragon ice = new Dragon("Ice", "Dragon", 18, 20.000, 2, "Blue");
        Unicorn sparkles = new Unicorn("Sparkles", "Unicorn", 200, 700.20, 7, "wool");
        Griffith andrew = new Griffith("Andrew", "Griffith", 70, 500.16, "red", 2);

        ArrayList<MagicAnimal> animals = new ArrayList<>();
        animals.add(ice);
        animals.add(sparkles);
        animals.add(andrew);
    }
}