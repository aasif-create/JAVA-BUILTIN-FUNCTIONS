public class StringMethods {
    public static void main(String[] args) {

        System.out.println("1. length() : RETURNS THE NUMBER OF CHARACTERS IN THE STRING (INCL. SPACES)");
        String s1 = "JAVA";
        System.out.println("No. of characters in \"" + s1 + "\" is : " + s1.length());
        System.out.println("<-------------------------------------------------->");

        System.out.println("2. charAt() : RETURNS THE CHARACTER AT THE SPECIFIED INDEX");
        String s2 = "Developer";
        System.out.println("Character at index 3 in \"" + s2 + "\" is : " + s2.charAt(3));
        System.out.println("<-------------------------------------------------->");

        System.out.println("3. substring() : EXTRACTS A PART OF THE STRING");
        String s3 = "JavaProgramming";
        System.out.println("Substring(0,4) of \"" + s3 + "\" is : " + s3.substring(0, 4));
        System.out.println("<-------------------------------------------------->");

        System.out.println("4. equals() : CHECKS CASE-SENSITIVE EQUALITY");
        String s4a = "Java";
        String s4b = "Java";
        System.out.println("Are \"" + s4a + "\" and \"" + s4b + "\" equal? : " + s4a.equals(s4b));
        System.out.println("<-------------------------------------------------->");

        System.out.println("5. equalsIgnoreCase() : CHECKS EQUALITY IGNORING CASE");
        String s5a = "backend";
        String s5b = "BACKEND";
        System.out.println("Are \"" + s5a + "\" and \"" + s5b + "\" equal (ignore case)? : " + s5a.equalsIgnoreCase(s5b));
        System.out.println("<-------------------------------------------------->");

        System.out.println("6. toLowerCase() : CONVERTS STRING TO LOWERCASE");
        String s6 = "WELCOME DEVELOPER";
        System.out.println("Lowercase of \"" + s6 + "\" is : " + s6.toLowerCase());
        System.out.println("<-------------------------------------------------->");

        System.out.println("7. toUpperCase() : CONVERTS STRING TO UPPERCASE");
        String s7 = "learn daily";
        System.out.println("Uppercase of \"" + s7 + "\" is : " + s7.toUpperCase());
        System.out.println("<-------------------------------------------------->");

        System.out.println("8. contains() : CHECKS IF STRING CONTAINS A WORD");
        String s8 = "Java Developer Roadmap";
        System.out.println("Does \"" + s8 + "\" contain \"Developer\"? : " + s8.contains("Developer"));
        System.out.println("<-------------------------------------------------->");

        System.out.println("9. replace() : REPLACES WORDS/CHARACTERS IN STRING");
        String s9 = "Junior Developer";
        System.out.println("Replacing Junior with Senior in \"" + s9 + "\" gives : " + s9.replace("Junior", "Senior"));
        System.out.println("<-------------------------------------------------->");

        System.out.println("10. trim() : REMOVES LEADING AND TRAILING SPACES");
        String s10 = "   Code Smart   ";
        System.out.println("Trimmed version of \"" + s10 + "\" is : " + s10.trim());
        System.out.println("<-------------------------------------------------->");

        System.out.println("11. split() : SPLITS STRING INTO MULTIPLE PARTS");
        String s11 = "Java Makes You Think";
        System.out.println("Splitting \"" + s11 + "\" gives : ");
        String[] parts = s11.split(" ");
        for (String p : parts) {
            System.out.println(p);
        }
        System.out.println("<-------------------------------------------------->");
    }
}
