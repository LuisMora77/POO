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
public class Cafetera {
     //Atributos
     public int capacMaxima;
     public int cantActual;
     //

     //constructores
    public Cafetera(){
        capacMaxima = 1000;
        cantActual = 0;
    }
    
   public Cafetera(int nCapMaxima){
       capacMaxima = nCapMaxima;
       cantActual = nCapMaxima;
   }
   
   public Cafetera(int nCapMaxima, int nCantActual){
       if (nCantActual > nCapMaxima){
           capacMaxima = nCapMaxima;
           cantActual = nCapMaxima;
       }
       else{
           capacMaxima = nCapMaxima;
           cantActual = nCantActual;
       }
   }
   //
   
   //Setters y getters
    public void setCapacMaxima(int capacMaxima) {
        this.capacMaxima = capacMaxima;
    }
    
     public double getCapacMaxima() {
        return capacMaxima;
    }
     
    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
    
    public double getCantActual() {
        return cantActual;
    }
     //
     
    //Funciones
    
   public double llenarCafetera(){
       if (cantActual < capacMaxima){
        System.out.println("Cafetera llenada con exito");
        return cantActual = capacMaxima;
       }
       else{
           System.out.println("La cafetera ya se encuentra llena, no se le puede agregar mas contenido");
           return 0;
       }
    }
   
   public int servirTaza(int capacidad){
       int taza=0;
       if (cantActual > capacidad){
           taza += capacidad;
           cantActual -= capacidad;
           return taza;
       }
       if((cantActual < capacidad) && (cantActual >0)){
           taza += cantActual; 
           cantActual = 0;
           return taza;
       }
       else {
           System.out.println("No hay cafe para servir");
           return 0;
       }
   }
   
  public String vaciarcafetera(){
       cantActual =0;
       return "la cafetera ha sido vaciada"; 
   }
  
  public int agregarCafe(int cantidad){
      if (cantActual ==capacMaxima){
          System.out.println("la cafetera esta llena, no se puede agregar mas cafe");
          return 0;
      }
     if ((cantActual < capacMaxima) && ((cantActual + cantidad) <= capacMaxima)){
      cantActual += cantidad;
      return cantActual;
  }
     else{
         System.out.println("La cantidad de cafe que quiere agragar supera el limite, no puede hacerlo");
         return 0;
     }
  }
}

