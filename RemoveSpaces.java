public class RemoveSpaces{
public static void main(String[]args){
String inputstring="hello   World";
String Withoutspace=inputstring.replaceAll("\\s","");
System.out.println("Input String: " + inputstring);
System.out.println("Without Space: " + Withoutspace);
}
}

