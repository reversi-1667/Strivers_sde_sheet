public  class Q13_BinarytoDecimal
{
public static  void main(String[] args)
{
int binary=1000;
int base=2,power=0;
int decimal=0;
while(binary>0)
{
int rem=binary%10;
int result=rem*find_power(base,power);
decimal=decimal+result;
binary/=10;
power++;
}
System.out.println("binary to decimal is "+" "+decimal);
}
public static int find_power(int base, int power)
{
int result=1;
while(power>0)
{
result=result*base;
power--;
}
return result;
}
}


