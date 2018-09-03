package bus;
public class TestSiswa 
{
    public static void main(String args[])
    {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAge(23);
        siswa.setAddress("Malang");
        
        System.out.print("Nama : " + siswa.getName()
        + " Absen : " + siswa.getAbsen() + " Address : "
        + siswa.getAddress());
    }
}
