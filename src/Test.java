class House
{
    public final void MaintainMethod()
    {
        System.out.println("MaintainMethod");
    }
}

public class Test extends House
{
    public static void main(String argv[])
    {
        House h = new House();

        h.MaintainMethod();
    }
}
