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
        System.out.println("--------------------------------------------------------");

        // Fight 1 
        while (Rayquaza.getHP() != 0 && Kyurem.getHP() != 0) {
            Rayquaza.attacks(Kyurem);;
            if (Kyurem.getHP() == 0) {
                break;
            }
            Kyurem.attacks(Rayquaza);;
            if (Rayquaza.getHP() == 0) {
                break;
            }
        }

        if (Rayquaza.getHP() == 0) {
            System.out.println("The winner is " + Kyurem.getName() + " with " + Kyurem.getHP() + " hp left");
            System.out.println("--------------------------------------------------------");
        } else {
            System.out.println("The winner is " + Rayquaza.getName() + " with " + Rayquaza.getHP() + " hp left");
            System.out.println("--------------------------------------------------------");
        }

        
        // User pokemon's opponent
        Pokemon Groudon = new Pokemon("Groudon",100,70, 0.5);


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
            userPkm.attacks(Groudon);
            if (Groudon.getHP() == 0) {
                break;
            }
            Groudon.attacks(userPkm);
            if (userPkm.getHP() == 0) {
                break;
            }
        }


        if (userPkm.getHP() == 0) {
            System.out.println("The winner is " + Groudon.getName() + " with " + Groudon.getHP() + " hp left");
            System.out.println("--------------------------------------------------------");
        } else {
            System.out.println("The winner is " + userPkm.getName() + " with " + userPkm.getHP() + " hp left");
            System.out.println("--------------------------------------------------------");
        }

        // Check for bug code
        System.out.println(userPkm.getAtk());
        System.out.println(userPkm.getHP());
        System.out.println(userPkm.getEva());
        System.out.println("--------------------------------------------------------");


        WaterPokemon Kyogre = new WaterPokemon("Kyogre",200, 30, 0.3);
        Pokemon Pigey = new Pokemon("Pigey",60,50,0.99);

    
        while (Kyogre.getHP() != 0 && Pigey.getHP() != 0) {
            Kyogre.attacks(Pigey);
            if (Pigey.getHP() == 0) {
                break;
            }


            Pigey.attacks(Kyogre);
            if (Kyogre.getHP() == 0) {
                break;
            }
        }

        if (Kyogre.getHP() == 0) {
            System.out.println("The winner is " + Pigey.getName() + " with " + Pigey.getHP() + " hp left");
            System.out.println("--------------------------------------------------------");
        } else {
            System.out.println("The winner is " + Kyogre.getName() + " with " + Kyogre.getHP() + " hp left");
            System.out.println("--------------------------------------------------------");
        }

        Pokemon Pikachu = new Pokemon("p");

        System.out.println(Pikachu.getEva());

        Pikachu.sayName();

        Kyogre.sayName();

        
        Potion potion1 = new Potion("Max potion", 500, 100);

        potion1.use(Kyurem);
        System.out.println(Kyurem.getHP());
        




    }
}
