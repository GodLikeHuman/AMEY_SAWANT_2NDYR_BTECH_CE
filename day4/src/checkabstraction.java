public class checkabstraction extends abstraction
{
     //annotation

    @Override
    void showData() {
        System.out.println("Inside show data.");

    }

    public static void main (String[] args)
    {
        checkabstraction abstraction=new checkabstraction();
        abstraction.showData();
    }
}
