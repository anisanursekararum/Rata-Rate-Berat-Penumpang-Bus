package bus;
public class UjiBus 
{
    public static void main(String[] arg)
    {
        Bus busBesar = new Bus (40);
        busBesar.cetak();
        busBesar.addPenumpang(15);
        busBesar.cetak();
        busBesar.addPenumpang(5);
        busBesar.cetak();
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
}




