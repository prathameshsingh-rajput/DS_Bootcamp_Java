public class LeftRightShift{
    public int rightShift(int a, int b){
        return a >> b;
    }

    public int leftShift(int a, int b){
        return a << b;
    }

    public static void main(String[]a){
        LeftRightShift obj = new LeftRightShift();
        System.out.println(obj.rightShift(4, 2));
        System.out.println(obj.leftShift(4, 2));
    }
}