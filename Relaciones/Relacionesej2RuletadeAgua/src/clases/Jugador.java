
package clases;


public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;
    
    public Jugador(String nombre,int id) {
        this.id=id;
        this.nombre=nombre;
        this.mojado=true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
     public void disparo(Revolver r){
         System.out.println("El jugador "+(id+1)+" "+nombre+", se apunta con el revolver...");
         if(r.mojar()){
             this.mojado=false;
             System.out.println(nombre+" se ha mojado!! ");
             System.out.println("-------------------------------------------------------");
         }else{
             System.out.println(nombre+" está seco, el juego continua...");
             System.out.println("-------------------------------------------------------");
         }
    }
}
