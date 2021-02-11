
class Box {
    double width;                   // Just a simple class
    double height;
    double length;
}

public class test {
    public static void main (String[] args)
    {
        System.out.println("Hell");
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.length = 30;

        vol = mybox.width * mybox.height * mybox.length;
        System.out.println(vol);
    }
}