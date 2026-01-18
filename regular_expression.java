public class regular_expression {
    public static void main(String[] args) {
        String str="8";
        String st1="a";
        String str2="a";
        String str3="7";
        String str4="abc";
        System.out.println(str.matches(".")); 
        // . mean single character
        System.out.println(st1.matches("[abc]"));
        // only one symabol 
        System.out.println(str2.matches("[^abc]"));
        // other symabols for this contains
        System.out.println(str3.matches("[a-z0-9]"));
        // limit beteen this range 
        System.out.println(str4.matches("abc"));
    }
    
}
