public class App {
    public static void main(String[] args) throws Exception {
        
        Pokemon Rayquaza = new Pokemon("Rayquaza",100, 25);


        Pokemon Kyurem = new Pokemon("Kyurem",150,10);

        System.out.println(Rayquaza.name + " and " + Kyurem.name + " are fighting today!");
        System.out.println(Rayquaza.name + ": " + Rayquaza.hp + " hp");
        System.out.println(Kyurem.name + ": " + Kyurem.hp + " hp");


        while (Rayquaza.hp != 0 && Kyurem.hp != 0) {
            Kyurem.takeDamage(Rayquaza.attack);
            System.out.println(Rayquaza.name + " attack " + Kyurem.name + " for " + Rayquaza.attack + " hp! ");
            Kyurem.printStats();
            if (Kyurem.hp == 0) {
                break;
            }
            Rayquaza.takeDamage(Kyurem.attack);
            System.out.println(Kyurem.name + " attack " + Rayquaza.name + " for " + Kyurem.attack + " hp! ");
            Rayquaza.printStats();
            if (Rayquaza.hp == 0) {
                break;
            }
        }

        if (Rayquaza.hp == 0) {
            System.out.println("The winner is " + Kyurem.name + " with " + Kyurem.hp + " hp left");
        } else {
            System.out.println("The winner is " + Rayquaza.name + " with " + Rayquaza.hp + " hp left");
        }


        Pokemon groudon = new Pokemon("Groudon",-9,-8);

        Kyurem.printStats();






    }
}
