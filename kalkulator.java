
/**
 * Write a description of class kalkulator here.
 *
 * @author nurul husna
 * @version 13.04
 */
public class kalkulator 
{
    // operasi 1 dan 2 untuk aplikasi kalkulator
    public int opA=0, opB=0;
    
    
    //informasi tentang class
    public static final String info="Aplikasi kalkulator By Nurul Husna";

    /**
     * Constructor untuk proyek kalkulator dengan parameter
     */
    public kalkulator(int opA, int opB)
    {
        this.opA=opA;
        this.opA=opB;
        System.out.println("Obyek Kalkulator dengan parameter telah dibuat");
    }
    
    /**
     * Constructor untuk proyek kalkulator tanpa parameter
     */
    public kalkulator()
    {
       
        System.out.println("Obyek Kalkulator tanpa parameter telah dibuat");
    }

    /**
     * penjumlahan
     *
     * @param  int operan 1
     * int operan 2
     * 
     * @return    int hasil penjumlahan operan 1 + operan 2
     */
    public int penjumlahan(int opA, int opB)
    {
        
        return opA + opB;
    }
    
      /**
     * pengurangan
     *
     * @param  int operan 1
     * int operan 2
     * 
     * @return    int hasil pengurangan operan 1 - operan 2
     */
    public int pengurangan(int opA, int opB)
    {
        
        return opA - opB;
    }
    
      /**
     * perkalian
     *
     * @param  int operan 1
     * int operan 2
     * 
     * @return    int hasil perkalian operan 1 * operan 2
     */
    public int perkalian(int opA, int opB)
    {
        
        return opA * opB;
    }
    
      /**
     * pembagian
     *
     * @param  double operan 1
     * double operan 2
     * 
     * @return    double hasil pembagian operan 1 / operan 2
     */
    public double pembagian(double opA, double opB)
    {
        
        return opA / opB;
    }
}
