public class App {
    public static void main(String[] args) throws Exception {
        
        Pokemon pokemon1 = new Pokemon();
        pokemon1.name = "Rayquaza";
        pokemon1.hp = 100;
        pokemon1.attack = 25;


        Pokemon pokemon2 = new Pokemon();
        pokemon2.name = "Kyurem";
        pokemon2.hp = 150;
        pokemon2.attack = 10;

        System.out.println(pokemon1.name + " and " + pokemon2.name + " are fighting today!");
        System.out.println(pokemon1.name + ": " + pokemon1.hp + " hp");
        System.out.println(pokemon2.name + ": " + pokemon2.hp + " hp");


        while (pokemon1.hp != 0 && pokemon2.hp != 0) {
            pokemon2.hp -= pokemon1.attack;
            System.out.println(pokemon1.name + " attack " + pokemon2.name + " for " + pokemon1.attack + " hp! ");
            System.out.println(pokemon2.name + " has " + pokemon2.hp + " hp left ");
            if (pokemon2.hp == 0) {
                break;
            }
            pokemon1.hp -= pokemon2.attack;
            System.out.println(pokemon2.name + " attack " + pokemon1.name + " for " + pokemon2.attack + " hp! ");
            System.out.println(pokemon1.name + " has " + pokemon1.hp + " hp left ");
            if (pokemon1.hp == 0) {
                break;
            }
        }

        if (pokemon1.hp == 0) {
            System.out.println("The winner is " + pokemon2.name + " with " + pokemon2.hp + " hp left");
        } else {
            System.out.println("The winner is " + pokemon1.name + " with " + pokemon1.hp + " hp left");
        }

    }
}
