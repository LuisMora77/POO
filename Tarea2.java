/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Luis
 */

public class Tarea2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuentaLuis = new CuentaBancaria(1223342,200000,10000);
        System.out.println("DNI: " + cuentaLuis.getDni());
        System.out.println("Saldo actual: " + cuentaLuis.getSaldoactual());
        System.out.println("interes anual para esta cuenta: " + cuentaLuis.getInteres());
        System.out.println("Numero de cuenta: " + cuentaLuis.getNumcuenta());
        System.out.println("saldo menos un dia de interes: " + cuentaLuis.ActualizarSaldo());
        System.out.println("Deposito exitoso, su monto acutal es de: " + cuentaLuis.ingresar(50000));
        System.out.println(cuentaLuis.getDatosCuenta());
        System.out.println("Saldo luego del retiro: " + cuentaLuis.retirar(220000));
       
        
       /* CuentaBancaria cuentaFabian = new CuentaBancaria();
        System.out.println("cuenta: " + cuentaFabian.getNumcuenta());
        cuentaFabian.setDni(7891011);
        System.out.println("DNI: " + cuentaFabian.getDni());
        cuentaFabian.setSaldoactual(500000);
        System.out.println("Saldo actual: " + cuentaFabian.getSaldoactual());
        cuentaFabian.setInteres(20000);
        System.out.println("interes anual para esta cuenta: " + cuentaFabian.getInteres());
        System.out.println("Saldo con el rebajo diario: " + cuentaFabian.ActualizarSaldo());
        System.out.println("Datos completos de la cuenta: " + cuentaFabian.getDatosCuenta());
        */
       
         System.out.println("\n-------------------------------------------------------------------------\n");
         
         Cafetera cafetera1 = new Cafetera(3000,1500);
          System.out.println("La capacidad maxima es: " + cafetera1.capacMaxima + " c.c");
          System.out.println("La cantidad actual es: " + cafetera1.cantActual + " c.c");
          //System.out.println(cafetera1.llenarCafetera() + " c.c"); descomentar para hacer pruebas
          System.out.println("taza servida: " + cafetera1.servirTaza(700));
           System.out.println("La cantidad actual es: " + cafetera1.cantActual + " c.c");
           //System.out.println(cafetera1.vaciarcafetera()); descomentar para hacer pruebas
           System.out.println("La cantidad actual es: " + cafetera1.cantActual + " c.c");
           System.out.println("se agregó el cafe con exito, ahora la cantidad es de: " + cafetera1.agregarCafe(500));
           System.out.println("La cantidad actual es: " + cafetera1.cantActual + " c.c");
           
             System.out.println("\n-------------------------------------------------------------------------\n");
             
             
           
    }    
      
}

class CuentaBancaria {
    public static long numcuenta = 100001;
    public long dni;
    public int saldoactual;
    public int interes;
    

    //Constructor por defecto.
    public CuentaBancaria(){
        this.dni = 0;
        this.saldoactual = 200000;
        this.interes = 10000;
        numcuenta+=1;
    }

    //Contructor con dni, saldo actual e interes
    public CuentaBancaria(long dni, int saldoactual, int interes) {
        this.dni = dni;
        this.saldoactual = saldoactual;
        this.interes = interes;
        numcuenta+=1;
    }
     
    public long getNumcuenta() {
        return numcuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(int saldoactual) {
        this.saldoactual = saldoactual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    
    public String getDatosCuenta(){
        return "cuenta:" + numcuenta + " " + "saldo:" + saldoactual + " " + "DNI:" + dni + " " + "interes:" + interes;
    }
     
     public int ActualizarSaldo(){
        if (saldoactual > interes){
        return saldoactual = saldoactual-(interes/365);
                }
        else {
            return saldoactual = 0;
        }  
    }
     
    public double ingresar(double nIngreso){
        return saldoactual += nIngreso;
    }
    
    public double retirar(double nRetiro){
        if (saldoactual >= nRetiro){
            
            return saldoactual -= nRetiro;   
        }
        else{
           System.out.println("error, fondos insuficientes para retiro");
           return 0;
        }
    }
    
    }

