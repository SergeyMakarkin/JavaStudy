import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Макаркин Сергей Сергеевич РИБО-01-21 ");

        Plant plant = new Plant();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter plant colour: ");
        plant.colour = in.nextLine();

        System.out.println("Enter cell type: ");
        plant.setType(in.nextLine());

        System.out.println("Enter protein solubility: ");
        plant.setSolubility(in.next());

        System.out.println(plant.toString());

    }
}