import java.lang.Math;
/**
 * Class kalkulatorTrigonometri
 *
 * @author nurul husna
 * @version 15.04
 */
public abstract class kalkulatorTrigonometri extends kalkulator
{
    // instance variables - replace the example below with your own
    public double op=0;
    public abstract void konversi(double op);
    public double menghitungSin()
    {
        return Math.sin(this.op);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   public double menghitungCos()
    {
        return Math.cos(this.op);
    }
    
   public double menghitungTan()
    {
        return Math.tan(this.op);
    }
}
