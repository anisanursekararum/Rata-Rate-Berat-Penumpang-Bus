package bus;
public class EncapSiswa 
{
    private String name;
    private String address;
    private int absen;
    
    public int getAbsen()
    {
        return absen;
    }
    public String getName()
    {   
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAge(int newAbsen)
    {
        absen = newAbsen;
    }
    public void setName(String newNama)
    {
        name = newNama;
    }
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
}
