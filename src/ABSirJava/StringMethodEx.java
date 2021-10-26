package ABSirJava;

public class StringMethodEx {
    public static void main(String[] args) {
        String str = "java program";
        String str10 = "java programming";
        String str9 = new String("JAVA PROGRAM");


        int l=str.length();
        String str1=str.toLowerCase();
        String str2 = str.toUpperCase();
        String str3 = str.trim();
        String str4 = str.substring(1);//Takes Only Starting Index.
        String str5 = str.substring(1,4);//Takes Both Starting And Ending after it print's in Between.
        String str6 = str.replace('j','m');
        //System.out.println(str.endsWith("program"));
        //System.out.println(str.startsWith("java"));
        //System.out.println(str.charAt(4));
        //System.out.println(str.indexOf(" "));
        //System.out.println(str.lastIndexOf("m"));
        //System.out.println(str.equals(str9));
        //System.out.println(str.compareTo(str9));
        //System.out.println(str.compareToIgnoreCase(str9));
        //System.out.println(str.equalsIgnoreCase(str9));
        System.out.println(str.contains("java"));
        System.out.println(str.concat(str9));

    }
}
