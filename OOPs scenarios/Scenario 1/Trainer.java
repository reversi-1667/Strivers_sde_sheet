public class Trainer {
String dept= "Java";
String institute= "Payilagam";
private int salary=10000;

public int getSalary()
{
    return this.salary;
}

public void training()
{
    System.out.println("currently undergoing training");
}

public Trainer()
{

}


public Trainer(String dept, String institute)
{
    System.out.println(dept+" "+ institute);
}


public static void main(String[] args)
{
    Trainer trainerAlex = new Trainer("CSE","Payilagam");
}

}
