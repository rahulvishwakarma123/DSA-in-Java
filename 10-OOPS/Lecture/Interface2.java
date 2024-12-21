public class Interface2 {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eats();
    }
}

interface Herbivore{
    public void eats();
}

interface Carnivore{
    public void eats();
}

class Bear implements Herbivore, Carnivore{
    public void eats(){
        System.out.println("Eats Grass and Meat both.");
        
    }
}