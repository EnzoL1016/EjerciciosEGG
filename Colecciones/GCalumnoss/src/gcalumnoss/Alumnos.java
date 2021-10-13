
package gcalumnoss;

import java.util.ArrayList;
import java.util.Scanner;




public class Alumnos {
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");   
    ArrayList <Integer> Listanotas;
    private String nombre;
    private Integer notafinal;
    private Integer n1;
    private Integer n2;
    private Integer n3;
   
    public Alumnos() {
        this.Listanotas = new ArrayList();
    }

    public Alumnos(ArrayList<Integer> Listanotas, String nombre, Integer notafinal,Integer n1, Integer n2, Integer n3) {
        this.Listanotas = Listanotas;
        this.nombre = nombre;
        this.notafinal = notafinal;
         this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public Alumnos(ArrayList<Integer> Listanotas, String nombre,Integer notafinal) {
        this.Listanotas = Listanotas;
        this.nombre=nombre;
        this.notafinal=notafinal;
       
    }

    
  

    public ArrayList<Integer> getListanotas() {
        return Listanotas;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNotafinal() {
        return notafinal;
    }

    public Integer getN1() {
        return n1;
    }

    public Integer getN2() {
        return n2;
    }

    public Integer getN3() {
        return n3;
    }
    
    

    public void setListanotas(ArrayList<Integer> Listanotas) {
        this.Listanotas = Listanotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotafinal(Integer notafinal) {
        this.notafinal = (n1+n2+n3)/3;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    public void setN3(Integer n3) {
        this.n3 = n3;
    }
}
