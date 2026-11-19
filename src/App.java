import java.util.Scanner;
import javax.swing.*;
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


        WaterPokemon Kyogre = new WaterPokemon("Kyogre",200, 45, 0.3);
        Pokemon Pigey = new Pokemon("Pigey",60,60,0.1);

        Potion potion1 = new Potion("Potion", 300, 20);
        Potion potion2 = new Potion("Super Potion", 700, 50);

    
        while (Kyogre.getHP() != 0 && Pigey.getHP() != 0) {
            if (Kyogre.getHP() < 20 && potion1.getHasBeenUsed() == false){
                Kyogre.heal(potion1.getHealingValue());
                potion1.setUsageToTrue();
                System.out.println("Kyogre used a " + potion1.getName()+  " and heal " + potion1.getHealingValue() + " hp!");
            } else {
            Kyogre.attacks(Pigey);
            if (Pigey.getHP() == 0) {
                break;
            }
        }
        

            if (Pigey.getHP() < 20 && potion2.getHasBeenUsed() == false){
                Pigey.heal(potion2.getHealingValue());
                potion2.setUsageToTrue();
                System.out.println("Pigey used a " + potion2.getName() + " and heal " + potion2.getHealingValue() + " hp!");
            } else {
            Pigey.attacks(Kyogre);
            if (Kyogre.getHP() == 0) {
                break;
            }
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

        
  
        LegendaryWaterPokemon Palkia = new LegendaryWaterPokemon("Palkia", 200, 200, 0.1);
        Pokemon Onix = new Pokemon("Onix", 500, 60,0.5);


        JFrame frame = new JFrame("Pokemon Game");
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel palkiaLabel = new JLabel("Palkia", JLabel.CENTER);
        JLabel onixLabel = new JLabel("Onix", JLabel.CENTER);

        JLabel palkiaHP = new JLabel(String.valueOf(Palkia.getHP()), JLabel.CENTER);
        JLabel onixHP = new JLabel(String.valueOf(Onix.getHP()), JLabel.CENTER);


        palkiaLabel.setBounds(150, 70, 100, 30);
        onixLabel.setBounds(500, 70, 100, 30);

        palkiaHP.setBounds(150, 85, 100, 30);
        onixHP.setBounds(500, 85, 100, 30);


        frame.add(onixLabel);
        frame.add(palkiaLabel);
        frame.add(palkiaHP);
        frame.add(onixHP);
        frame.setLayout(null);
        frame.setVisible(true);



        Scanner s1 = new Scanner(System.in);


        while (Palkia.getHP() != 0 && Onix.getHP() != 0){

            String input = s1.nextLine();

            Palkia.attacks(Onix);
            onixHP.setText(String.valueOf(Onix.getHP()));
            if (Onix.getHP() == 0){
                break;
            }

            Onix.attacks(Palkia);
            palkiaHP.setText(String.valueOf(Palkia.getHP()));
            if (Palkia.getHP() == 0){
                break;
            }

        }

        s1.close();


        if (Palkia.getHP() == 0) {
            System.out.println("The winner is " + Onix.getName() + " with " + Onix.getHP() + " hp left");
            System.out.println("--------------------------------------------------------");
        } else {
            System.out.println("The winner is " + Palkia.getName() + " with " + Palkia.getHP() + " hp left");
            System.out.println("--------------------------------------------------------");
        }
        




    }
}
