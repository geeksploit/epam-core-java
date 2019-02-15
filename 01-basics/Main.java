public class Main {

    public static void main(String[] args) {
        QuadraticEquation.solve(0, 1, 1); // not a quadratic equation
        QuadraticEquation.solve(1, 1, 1); // imaginary roots
        QuadraticEquation.solve(1, 2, 1); // a single root
        QuadraticEquation.solve(1, 4, 1); // two real roots
    }

}
