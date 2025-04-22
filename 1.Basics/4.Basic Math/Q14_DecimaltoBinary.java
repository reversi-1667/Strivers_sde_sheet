public class Q14_DecimaltoBinary
{
public static void main(String[] args)
{
int decimal=9;
String binary=" ";
while(decimal>0)
{
binary=(decimal%2)+binary;
decimal=decimal/2;
}
System.out.println(binary);
}
}

