import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Reference reference = new Reference("");
        Dragon dragon = new Dragon("", "Dragon", 18, 20.000, 2, "Blue");
        Unicorn unicorn = new Unicorn("", "Unicorn", 200, 700.20, 7, "wool");
        Griffith griffith = new Griffith("", "Griffith", 70, 500.16, "red", 2);

        ArrayList<MagicAnimal> animals = new ArrayList<>();
        animals.add(dragon);
        animals.add(unicorn);
        animals.add(griffith);

        Scanner sc = new Scanner(System.in);

        System.out.println("Your name:");
        reference.setName(sc.nextLine());

        System.out.println("Dragon name:");
        dragon.setName(sc.nextLine());

        System.out.println("Unicorn name:");
        unicorn.setName(sc.nextLine());

        System.out.println("Griffith name:");
        griffith.setName(sc.nextLine());

        System.out.println(reference);
        System.out.println(dragon);
        System.out.println(unicorn);
        System.out.println(griffith);
    }
}