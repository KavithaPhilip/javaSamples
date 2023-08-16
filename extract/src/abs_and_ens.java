abstract class Shape
{
    String size="round";
    public abstract void draw();
}
class Circle extends Shape
{
    //implementing functionality of the abstract method
    public void draw()
    {
        int degree=180;
        System.out.println("Circle! degree is "+degree );
    }
}
//main class
public class abs_and_ens
{
    public static void main(String[] args)
    {
        Shape circle = new Circle();
//invoking abstract method draw()
        circle.draw();
    }
}