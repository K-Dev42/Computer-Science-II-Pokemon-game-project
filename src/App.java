import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // New pokemon 1 
        Pokemon Rayquaza = new Pokemon("Rayquaza",100, 25,0.5);

        // New pokemon 2 
        Pokemon Kyurem = new Pokemon("Kyurem",150,10, 0.5);


        // Anouncement 
        System.out.println(Rayquaza.getName() + " and " + Kyurem.getName() + " are fighting today!");
        System.out.println(Rayquaza.getName() + ": " + Rayquaza.getHP() + " hp");
        System.out.println(Kyurem.getName() + ": " + Kyurem.getHP() + " hp");

        // Fight 1 
        while (Rayquaza.getHP() != 0 && Kyurem.getHP() != 0) {
            Kyurem.takeDamage(Rayquaza.getAtk());
            System.out.println(Rayquaza.getName() + " attack " + Kyurem.getName() + " for " + Rayquaza.getAtk() + " hp! ");
            Kyurem.printStats();
            if (Kyurem.getHP() == 0) {
                break;
            }
            Rayquaza.takeDamage(Kyurem.getAtk());
            System.out.println(Kyurem.getName() + " attack " + Rayquaza.getName() + " for " + Kyurem.getAtk() + " hp! ");
            Rayquaza.printStats();
            if (Rayquaza.getHP() == 0) {
                break;
            }
        }

        if (Rayquaza.getHP() == 0) {
            System.out.println("The winner is " + Kyurem.getName() + " with " + Kyurem.getHP() + " hp left");
        } else {
            System.out.println("The winner is " + Rayquaza.getName() + " with " + Rayquaza.getHP() + " hp left");
        }


        Pokemon Groudon = new Pokemon("Groudon",100,70, 0.5);

        Kyurem.printStats();


        // User input portion
        Scanner s = new Scanner(System.in);
        System.out.print("Give a name to your pokemon: ");
        String input1 = s.next();

        System.out.print("Give your pokemon the health stat: ");
        int input2 = s.nextInt();

        System.out.print("Give your pokemon the atk stat: ");
        int input3 = s.nextInt();

        System.out.print("Give your pokemon the eva stat: ");
        double input4 = s.nextDouble();

        s.close();
        
        
        // This pokemon will be created by the user
        Pokemon userPkm = new Pokemon(input1,input2,input3,input4);


        // Fight 2
        while (userPkm.getHP() != 0 && Groudon.getHP() != 0) {
            Groudon.takeDamage(userPkm.getAtk());
            System.out.println(userPkm.getName() + " attack " + Groudon.getName() + " for " + userPkm.getAtk() + " hp! ");
            Groudon.printStats();
            if (Groudon.getHP() == 0) {
                break;
            }
            userPkm.takeDamage(Groudon.getAtk());
            System.out.println(Groudon.getName() + " attack " + userPkm.getName() + " for " + Groudon.getAtk() + " hp! ");
            userPkm.printStats();
            if (userPkm.getHP() == 0) {
                break;
            }
        }


        if (userPkm.getHP() == 0) {
            System.out.println("The winner is " + Groudon.getName() + " with " + Groudon.getHP() + " hp left");
        } else {
            System.out.println("The winner is " + userPkm.getName() + " with " + userPkm.getHP() + " hp left");
        }




    }
}
