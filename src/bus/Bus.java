package bus;
public class Bus 
{
    private int penumpang;
    private int maxPenumpang;
    
    public Bus(int maxPenumpang)
    {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(int penumpang)
    {
        int temp;
        temp = this.penumpang+penumpang;
        if (temp >= maxPenumpang)
        {
            System.out.println("Penumpang melebihi kuota");
        }
        else
        {
            this.penumpang = temp;
        }
    }
    
    public void cetak()
    {
        System.out.println("Penumpang bus sekarang adalah "+ penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+ maxPenumpang);
        
    }
}


