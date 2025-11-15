public class WrapperMethods {
    public static void main(String[] args) {

        System.out.println("1. Integer.parseInt() : CONVERTS STRING TO INTEGER");
        String s1 = "125";
        int n1 = Integer.parseInt(s1);
        System.out.println("String \"" + s1 + "\" converted to integer is : " + n1);
        System.out.println("<-------------------------------------------------->");

        System.out.println("2. Double.parseDouble() : CONVERTS STRING TO DOUBLE");
        String s2 = "45.67";
        double n2 = Double.parseDouble(s2);
        System.out.println("String \"" + s2 + "\" converted to double is : " + n2);
        System.out.println("<-------------------------------------------------->");

        System.out.println("3. String.valueOf() : CONVERTS ANY VALUE TO STRING");
        char x = 'A';
        String s3 = String.valueOf(x);
        System.out.println("Character " + x + " converted to string is : \"" + s3 + "\"");

        System.out.println("<-------------------------------------------------->");

        System.out.println("4. Integer.toString() : CONVERTS INTEGER TO STRING");
        int y = 250;
        String s4 = Integer.toString(y);
        System.out.println("Integer " + y + " converted to string is : \"" + s4 + "\"");
        System.out.println("<-------------------------------------------------->");

        System.out.println("5. Double.toString() : CONVERTS DOUBLE TO STRING");
        double z = 99.99;
        String s5 = Double.toString(z);
        System.out.println("Double " + z + " converted to string is : \"" + s5 + "\"");
        System.out.println("<-------------------------------------------------->");
    }
}
