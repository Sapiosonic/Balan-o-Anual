import java.text.DecimalFormat;
public class BalancoAnual {
    public static void main(String[] args) throws Exception {
       DecimalFormat df = new DecimalFormat("0.00");
        double[] meses = new double[12];

        meses[0] = -500.65;
        meses[1] = -650.52;
        meses[2] = -200.00;
        meses[3] = -50.41;
        meses[4] = 10.6;
        meses[5] = 60.50;
        meses[6] = 70.41;
        meses[7] = 70.62;
        meses[8] = -5.63;
        meses[9] = 10.68;
        meses[10] = 30.62;
        meses[11] = 50.31;

        String profit = "##----------------LUCRO----------------##";
        String loss = "!!----------------PREJUIZO----------------!!";
        double total = 0;

        for(int i = 0; i < 11; i++){
            total = total + meses[i];
        }

            if(total < 0){
                System.out.println(loss);
            }
            else{
                System.out.println(profit);
            }
        
        System.out.println("Total: " + df.format(total));
    }
}
