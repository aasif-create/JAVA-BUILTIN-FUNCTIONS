public class StringMethods
{
    public static void main(String[] args) {

        System.out.println("1. length()");
        String s1 = "JAVA";
        System.out.println(s1.length());
        System.out.println("<-------------------------------------------------->");

        System.out.println("2. charAt()");
        String s2 = "Developer";
        System.out.println(s2.charAt(3));
        System.out.println("<-------------------------------------------------->");

        System.out.println("3. substring()");
        String s3 = "JavaProgramming";
        System.out.println(s3.substring(0, 4));
        System.out.println("<-------------------------------------------------->");

        System.out.println("4. equals()");
        String s4a = "Java";
        String s4b = "Java";
        System.out.println(s4a.equals(s4b));
        System.out.println("<-------------------------------------------------->");

        System.out.println("5. equalsIgnoreCase()");
        String s5a = "backend";
        String s5b = "BACKEND";
        System.out.println(s5a.equalsIgnoreCase(s5b));
        System.out.println("<-------------------------------------------------->");

        System.out.println("6. toLowerCase()");
        String s6 = "WELCOME DEVELOPER";
        System.out.println(s6.toLowerCase());
        System.out.println("<-------------------------------------------------->");

        System.out.println("7. toUpperCase()");
        String s7 = "learn daily";
        System.out.println(s7.toUpperCase());
        System.out.println("<-------------------------------------------------->");

        System.out.println("8. contains()");
        String s8 = "Java Developer Roadmap";
        System.out.println(s8.contains("Developer"));
        System.out.println("<-------------------------------------------------->");

        System.out.println("9. replace()");
        String s9 = "Junior Developer";
        System.out.println(s9.replace("Junior", "Senior"));
        System.out.println("<-------------------------------------------------->");

        System.out.println("10. trim()");
        String s10 = "   Code Smart   ";
        System.out.println(s10.trim());
        System.out.println("<-------------------------------------------------->");

        System.out.println("11. split()");
        String s11 = "Java Makes You Think";
        String[] parts = s11.split(" ");
        for (String p : parts) {
            System.out.println(p);
        }
        System.out.println("<-------------------------------------------------->");

    }
}
