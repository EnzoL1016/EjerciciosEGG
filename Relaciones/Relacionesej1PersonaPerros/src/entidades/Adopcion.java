
package entidades;


public class Adopcion {
   private Perro perros;
   private Persona personas;

    public Adopcion(Persona personas,Perro perros) {
        this.perros = perros;
        this.personas = personas;
    }

    public Perro getPerros() {
        return perros;
    }

    public void setPerros(Perro perros) {
        this.perros = perros;
    }

    public Persona getPersonas() {
        return personas;
    }

    public void setPersonas(Persona personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Adoptante: \n"+personas +"\nMascota: \n"+ perros;
    }
   
}
