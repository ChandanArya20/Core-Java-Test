enum Color{
    RED,BLACK,YELLOW;
}


public class Enum {
    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println(color);
        System.out.println("Color is "+Color.RED);

        Color[] values = Color.values();
        for (Color color1:values){
            System.out.println(color1.ordinal());
        }
        Color.RED.toString();
    }
}
