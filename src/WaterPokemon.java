public class WaterPokemon extends Pokemon {
    public boolean usedDiveInPreviousTurn;



    public WaterPokemon(String name, int hp, int attack, double eva){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.eva = eva;
        this.usedDiveInPreviousTurn = false; 

        if (hp < 0){
            this.hp = 100; 
            System.out.println(name + " hp has been auto set to 100 because hp can not be negative!");
        }

        if (attack < 0){
            this.attack = 10;
            System.out.println(name + " attack has been auto set to 10 because attack can not be negative!");
        }

        if (eva < 0 || eva > 1){
            this.eva = 0.5;
            System.out.println(name + " eva has been auto set to 0.5 because the value specified is outside of acceptable range!");
        }
    }


    public void useDive(){
        this.usedDiveInPreviousTurn = true;
        System.out.println(this.name + " used Dive!");
    }

    public void takeDamageAsWaterPokemon(int damage){
        if (this.usedDiveInPreviousTurn == true){
            System.out.println(this.name + " is underwater so it does not take any damage!");
        } else {
            if (Math.random() < this.eva){
                System.out.println(this.name + " evaded the attack and took no damage");
            } else {
                this.hp -= damage;
                if(this.hp < 0){
                this.hp = 0;
                }

                if (this.hp > 0){
                    System.out.println(this.name + " took " + damage + " damage and have " + this.hp + " hp left!");
                } else {
                    System.out.println(this.name + " took " + damage + " damage and have no remaining hp left");
                    System.out.println(this.name + " has fainted!");
                }
            }
        }
    }



}
