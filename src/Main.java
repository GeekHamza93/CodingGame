//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {


    public class QuadraticEquationSolver {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Demander à l'utilisateur d'entrer les coefficients a, b et c
            System.out.println("Enter the coefficient 'a':");
            double a = scanner.nextDouble();

            System.out.println("Enter the coefficient 'b':");
            double b = scanner.nextDouble();

            System.out.println("Enter the coefficient 'c':");
            double c = scanner.nextDouble();

            // Calculer le discriminant
            double discriminant = b * b - 4 * a * c;

            // Calculer les racines en fonction du discriminant
            if (discriminant > 0) {
                // Deux racines réelles distinctes
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The roots are real and distinct:");
                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            } else if (discriminant == 0) {
                // Une racine réelle double
                double root = -b / (2 * a);
                System.out.println("The root is real and double:");
                System.out.println("Root = " + root);
            } else {
                // Pas de racines réelles (racines complexes)
                System.out.println("The equation has no real roots.");
            }

            scanner.close();
        }
    }
}