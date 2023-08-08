import java.util.Scanner;

class TemperatureConverter{
    public static double celsiusTofahrenheight(double celsius) {
            double fahrenheight=celsius*9/5+32;
            return fahrenheight;
    }
    public static double fahrenheightTocelsius(double fahrenheight) {
        double celsius=(fahrenheight-32)*5/9;
        return celsius;
}
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the temperature in F or C.");
      int temperater=sc.nextInt();
      //System.out.println("Enter the temperature:");
      System.out.println("Enter the scale(F OR C):");
      String scale=sc.next();
      switch(scale.toUpperCase()){

        case "F":
        System.out.println(celsiusTofahrenheight(temperater)+"F");
        break;
        
        case "C":
        System.out.println(fahrenheightTocelsius(temperater)+"C");
        break;

        default:
        System.out.println("Please enter the correct scale C or F.");
        break;
      }
    }
}
