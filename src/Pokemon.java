public class Pokemon {
    protected String name;
    protected int hp;
    protected int maxHP;
    protected int attack; 
    protected double eva;


    public Pokemon(){

    }


    public Pokemon(String name, int hp, int attack, double eva){
        this.name = name;
        this.hp = hp;
        this.maxHP = hp;
        this.attack = attack;
        this.eva = eva; 

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

    // This is an overload method for creating Pikachu
    public Pokemon(String name){
        if (name == "p"){
            this.name = "Pikachu";
            this.hp = 55;
            this.attack = 10;
            this.eva = 0.25;
        } else {

        }
    }


    public void takeDamage(int damage){
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


    public void attacks(Pokemon attackedPokemon){
        attackedPokemon.takeDamage(this.attack);
    }

    public void heal(int amount){
        this.hp += amount;
        if (this.hp > this.maxHP){
            this.hp = this.maxHP;
        }
    }


    public int getHP(){ // This method is for getting the pokemon's hp stat in the main function
        return this.hp;
    }

    public String getName(){ // This method is for getting the pokemon name in the main function
        return this.name;
    }

    public int getAtk(){ // This method is for getting the pokemon's atk stat in the main function
        return this.attack; 
    }

    public double getEva(){ // This method is for getting the pokemon's evasion stat in the main function
        return this.eva;
    }


    public void sayName(){
        System.out.println("I am " + this.name + "!");
    }



}
