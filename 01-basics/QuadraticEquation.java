public class QuadraticEquation {

    public static void solve(float a, float b, float c) {

       if (Float.compare(a, 0)) {
           System.out.println("Not a quadratic equation.");
           return;
       }
      
      String out;

       float discriminant = b * b - 4 * a * c;

       switch (Float.compare(discriminant, 0)) {
           case -1:
             out = "Imaginary roots. Machines lack imagination, thus I'm out.";
             break;
           case 0:
             float x = -b / (2 * a);
             out = String.format("A single root found:\nx = %f", x);
             break;
           case 1:
             float divisor = -2 * a;
             float x1 = (b + discriminant) / divisor;
             float x2 = (b - discriminant) / divisor;
             out = String.format("Multiple roots found:\nx1 = %f\nx2 = %f", x1, x2);
             break;
           default:
             out = "Something went wrong. Switch user and press any key.";
       }

       System.out.println(out);

    }

}
