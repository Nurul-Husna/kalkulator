
/**
 * class Main 
 *
 * @author nurulhusna
 * @version 13.04
 */
public class Main 
{
   
    public static void Main(String args[])
    {
        int hasil;
        kalkulator kalkulator1 = new kalkulator();
        System.out.println(kalkulator1.opA);
        System.out.println(kalkulator1.opB);
        System.out.println(kalkulator1.info);
        
        kalkulator kalkulator2 = new kalkulator(4,5);
        System.out.println(kalkulator2.opA);
        System.out.println(kalkulator2.opB);
        System.out.println(kalkulator2.info);
        System.out.println(kalkulator2.penjumlahan(10,2));
        System.out.println(kalkulator2.pengurangan(10,2));
        System.out.println(kalkulator2.perkalian(10,2));
        System.out.println(kalkulator2.pembagian(10,2));
    }

   
}
