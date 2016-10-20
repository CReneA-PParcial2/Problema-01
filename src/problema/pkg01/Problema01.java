/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg01;
import java.util.*;
/**
 *
 * @author charl_000
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CALCULAR SI UN AÑO ES BISIESTO O NO
        int year;
        year = solicitarNumero();
        mostrarResultado(year);
    }
    
    //Solicitar el año para hacer el calculo
    public static int solicitarNumero(){
        int year;
        System.out.println("Ingresa el año:");
        Scanner entradaNumero = new Scanner(System.in);
        year = entradaNumero.nextInt();
        return year;
    }
    
    //Calcular si el año es bisisesto o no
    public static void mostrarResultado(int year){
        if (year%4==0){
            System.out.println("Si es año bisisesto");
        }else{System.out.println("No es año bisisesto");
    }
    }
}
