public class Pokemon {
    private String name;
    private int hp;
    private int attack; 
    private double eva;


    public Pokemon(String name, int hp, int attack, double eva){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.eva = eva; 

        if (hp < 0){
            hp = 100; 
            System.out.println(name + " hp has been auto set to 100 because hp can not be negative!");
        }

        if (attack < 0){
            attack = 10;
            System.out.println(name + " attack has been auto set to 10 because attack can not be negative!");
        }
    }

    public void printStats(){
        if (this.hp > 0){
            System.out.println(this.name + " has " + this.hp + " HP left");
        } else {
            System.out.println(this.name + " has no HP left and has fainted...");
        }
    }

    public void takeDamage(int damage){
        this.hp = this.hp - damage;

        if (this.hp < 0){
            this.hp = 0;
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
}
