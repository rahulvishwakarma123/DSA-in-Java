public class ClassesAndObjects {
    public static void main(String args[]){
        Pen p = new Pen(); // created a pen object named p
        p.setColor("red");
        System.out.println(p.color);
        
    }   
}

class Pen{
    int tip;
    String color;

    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}
