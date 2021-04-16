/**
 * Class kalkulator advanced
 *
 * @author nurul husna
 * @version 14.04
 */
public class kalkulatorAdvanced extends kalkulator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class kalkulatorAdvanced
     */
    public kalkulatorAdvanced()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Hitung faktorial
     *
     * @param opA
     * @return hasil faktorial
     */
    public int faktorial(int opA)
    {

        int hasil = 1;
        for (int i=opA; i>0; i--){
            hasil *=i;
        }
        return hasil;
    }
}