
package ejercicio10extratriangulos;

import static java.lang.StrictMath.sqrt;
import java.util.Scanner;



public class Triangulo implements Comparable <Triangulo>{
    
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    private int ladoa;
    private int ladob;
    private int ladoc;
    int area;
    private int perimetro;
    

    public Triangulo() {
        ladoa=0;
        ladob=0;
        ladoc=0;
        area=0;
        perimetro=0;
    }

    public Triangulo(int ladoa, int ladob, int ladoc, int area, int perimetro) {
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
        this.area = area;
        this.perimetro = perimetro;      
    }

    public Scanner getLeer() {
        return leer;
    }

    public int getLadoa() {
        return ladoa;
    }

    public int getLadob() {
        return ladob;
    }

    public int getLadoc() {
        return ladoc;
    }

    public int getArea() {
        return area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    
    

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setLadoa(int ladoa) {
        this.ladoa = ladoa;
    }

    public void setLadob(int ladob) {
        this.ladob = ladob;
    }

    public void setLadoc(int ladoc) {
        this.ladoc = ladoc;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
 
    
    
    public void ingresartriangulo(){ 
            comprobartriangulo();                                              
    }
    public void comprobartriangulo(){
        System.out.println("Se comprobara que el triángulo ingresado sea Isosceles: ");
        if(getLadoa()==getLadoc() || getLadoc()==getLadob()||getLadob()==getLadoa()){
            System.out.println("El triángulo es Isosceles.");
           
            calculararea();
        }else{ System.out.println("El triangulo no es Isosceles, vuelva a ingresar las medidas.");      
        }       
    }
    public int calculararea(){
        
        int altura = ((int) sqrt(3*getLadoc()))/2;
        System.out.println("El area del triangulo es  "+(getLadoc()*altura)/2);
        setArea(getLadoc()*altura/2);
        return area;          
    }
    public int calcularperimetro(){
        
        System.out.println("El perímetro del triangulo es "+(getLadoa()+getLadob()+getLadoc()));
        setPerimetro(getLadoa()+getLadob()+getLadoc()); 
        return perimetro;
    }

    @Override
    public int compareTo(Triangulo t) {
        if(this.area<t.getArea()){
            return -1;
        }else{
            if(this.area>t.getArea()){
                return 1;
            }
        }
        return 0;
    }
}

 
