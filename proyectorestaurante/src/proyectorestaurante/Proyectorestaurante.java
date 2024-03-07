package proyectorestaurante;
import java.util.Scanner;
/**
 *
 * @author Jhon Valencia
 */
public class Proyectorestaurante {
    public static void main(String[] args) {
        double cobro, cobroTotal, cobroDescuento;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor ingrese el el valor de la compra: ");
        cobro = sc.nextDouble();
        
        if(cobro >= 200000){
            cobroDescuento = (cobro * 15) / 100;
            cobroTotal = cobro - cobroDescuento;
            System.out.print("Tienes un 15% de descuento, el valor total de la cuenta es de: " + cobroTotal);
        } else if(cobro >= 50000){
            cobroDescuento = (cobro * 2) / 100;
            cobroTotal = cobro - cobroDescuento;
            System.out.print("Tienes un 2% de descuento, el valor total de la cuenta es de: " + cobroTotal);
        } else if (cobro >= 20000){
            cobroDescuento = (cobro * 1.5) / 100;
            cobroTotal = cobro - cobroDescuento;
            System.out.print("Tienes un 1.5% de descuento, El valor total de la cuenta es de: " + cobroTotal);
        } else {
            System.out.print("El valor total de la cuenta es de: " + cobro);
        }
    }
    
}
