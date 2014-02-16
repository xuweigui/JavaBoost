public class ExceptionTest
{
	static class A 
	{
		void process() throws Exception 
		{ 
			throw new Exception(); 
		}
	}
	
	static class B extends A
	{
        @Override
		void process()
		{
            System.out.println("B");
		}
	}
	public static void main(String[] args)
	{
        new B().process();
        A a = new B();
        try
        {
            a.process();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
