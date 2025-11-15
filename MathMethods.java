public class MathMethods {
    public static void main(String[] args) {

        System.out.println("1. Math.abs() : RETURNS THE ABSOLUTE (POSITIVE) VALUE");
        int a = -25;
        System.out.println("Absolute value of " + a + " is : " + Math.abs(a));
        System.out.println("<-------------------------------------------------->");

        System.out.println("2. Math.max() : RETURNS THE LARGER OF TWO VALUES");
        int x1 = 15, x2 = 40;
        System.out.println("Max of " + x1 + " and " + x2 + " is : " + Math.max(x1, x2));
        System.out.println("<-------------------------------------------------->");

        System.out.println("3. Math.min() : RETURNS THE SMALLER OF TWO VALUES");
        int y1 = 15, y2 = 40;
        System.out.println("Min of " + y1 + " and " + y2 + " is : " + Math.min(y1, y2));
        System.out.println("<-------------------------------------------------->");

        System.out.println("4. Math.pow() : RETURNS A RAISED TO THE POWER B");
        double p = 2, q = 5;
        System.out.println(p + " raised to " + q + " is : " + Math.pow(p, q));
        System.out.println("<-------------------------------------------------->");

        System.out.println("5. Math.sqrt() : RETURNS THE SQUARE ROOT OF A NUMBER");
        int n = 81;
        System.out.println("Square root of " + n + " is : " + Math.sqrt(n));
        System.out.println("<-------------------------------------------------->");

        System.out.println("6. Math.random() : RETURNS A RANDOM NUMBER BETWEEN 0 AND 1");
        double r = Math.random();
        System.out.println("Random number generated : " + r);
        System.out.println("<-------------------------------------------------->");

        System.out.println("7. Math.round() : ROUNDS A DECIMAL TO ITS NEAREST INTEGER");
        double d1 = 4.6;
        System.out.println("Round of " + d1 + " is : " + Math.round(d1));
        System.out.println("<-------------------------------------------------->");

        System.out.println("8. Math.ceil() : ROUNDS A DECIMAL UP TO THE NEXT INTEGER");
        double d2 = 7.2;
        System.out.println("Ceil of " + d2 + " is : " + Math.ceil(d2));
        System.out.println("<-------------------------------------------------->");

        System.out.println("9. Math.floor() : ROUNDS A DECIMAL DOWN TO THE PREVIOUS INTEGER");
        double d3 = 7.9;
        System.out.println("Floor of " + d3 + " is : " + Math.floor(d3));
        System.out.println("<-------------------------------------------------->");
    }
}
