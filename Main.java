
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
        
        kalkulatorAdvanced kalkulator3 = new kalkulatorAdvanced();
        System.out.println(kalkulator3.opA);
        System.out.println(kalkulator3.opB);
        System.out.println(kalkulator3.info);
        System.out.println(kalkulator3.penjumlahan(10,2));
        System.out.println(kalkulator3.pengurangan(10,2));
        System.out.println(kalkulator3.perkalian(10,2));
        System.out.println(kalkulator3.pembagian(10,2));
        hasil= kalkulator3.faktorial(12);
        System.out.println(hasil); 
        
        
        
        
        
        double hasilSin = 0;
        double hasilCos = 0;
        double hasilTan = 0;
        int hasiljumlah=0;
        double der = 90;
        double rad = 1.5707963267948966;
        
        kalkulatorTrigonometri ct1 = new kalkulatorTriDeg();
        //kalkulatorTrigonometri ct1 = new kalkulatorTrigonometri();
        hasiljumlah = ct1.penjumlahan(3,4);
        System.out.println("Nilai op awal = "+ct1.op);
        ct1.konversi(der);
        System.out.println("Nilai derajat = "+der+ " setelah konversi = "+ ct1.op);
        hasilSin = ct1.menghitungSin();
        System.out.println("Nilai sin = "+der+ " derajat adalah = "+ hasilSin);
        
        System.out.println("Nilai derajat = "+der+ " setelah konversi = "+ ct1.op);
        hasilCos = ct1.menghitungCos();
        System.out.println("Nilai cos = "+der+ " derajat adalah = "+ hasilCos);
        
        System.out.println("Nilai derajat = "+der+ " setelah konversi = "+ ct1.op);
        hasilTan = ct1.menghitungTan();
        System.out.println("Nilai tan = "+der+ " derajat adalah = "+ hasilTan);
        
        System.out.println("");
        System.out.println("");
        
        kalkulatorTrigonometri ct2 = new kalkulatorTriRad();
        //kalkulatorTrigonometri ct2 = new CalculatorTrigonometri();
        hasiljumlah = ct2.penjumlahan(3,4);
        System.out.println("Nilai op awal = "+ct2.op);
        ct2.konversi(rad);
        System.out.println("Nilai rad = "+rad+ " setelah konversi = "+ ct2.op);
        hasilSin = ct2.menghitungSin();
        System.out.println("Nilai sin = "+rad+ " radian  adalah = "+ hasilSin);
        
        System.out.println("Nilai rad = "+rad+ " setelah konversi = "+ ct2.op);
        hasilCos = ct2.menghitungCos();
        System.out.println("Nilai Cos = "+rad+ " radian  adalah = "+ hasilCos);
        
        System.out.println("Nilai rad = "+rad+ " setelah konversi = "+ ct2.op);
        hasilTan = ct2.menghitungTan();
        System.out.println("Nilai Tan = "+rad+ " radian  adalah = "+ hasilTan);
        
    }

   
}
