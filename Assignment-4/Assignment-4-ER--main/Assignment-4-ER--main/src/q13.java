public class Q13 {
    public static void main(String[] args) {
        double x=90;
        try{
            double ans=(Math.cos(x)*Math.sin(x))/(Math.cos(x)+Math.sin(x));
            System.out.println("Ans is : "+ans);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
