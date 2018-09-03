package bus;
import java.io.*;
import static java.lang.Integer.parseInt;
public class UjiBus3 
{
    public static void main (String[] abc) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        Bus3 Bus = new Bus3(5);
        System.out.print("Password : ");
        int password = parseInt(br.readLine());
        if (password==24)
        {
            Bus.getpenumpang(24);
            Bus.cetakpenumpang();
            Bus.getpenumpang(24);
            Bus.cetakpenumpang();
            Bus.addpenumpang(2);
            Bus.cetakpenumpang();
            Bus.addpenumpang(1);
            Bus.cetakpenumpang();
            Bus.addpenumpang(2);
            Bus.cetakpenumpang();
            Bus.addpenumpang(2);
            Bus.cetakpenumpang();
        }
        else
        {
            Bus.getpenumpang(10);
        }
        
    }
}
