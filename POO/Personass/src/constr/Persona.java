
package constr;

import java.util.Scanner;



public class Persona {
    boolean x=false;  
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private Integer edad;
    private String sexo;
    private Integer peso;
    private Integer altura;
    private Integer i;
    private Integer deb;
    private Integer sob;
  private Integer promedio;
   private double mayor=0;
   private double menor=0;
   private double ide=0;
   private double debajo=0;
   private double sobre=0;
   
    public Persona() {
    }   

    public Persona(boolean x, String nombre, Integer edad, String sexo, Integer peso, Integer altura, Integer i, Integer deb, Integer sob, Integer promedio, double mayor, double menor, double ide, double debajo, double sobre) {
        this.x = x;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.i = i;
        this.deb = deb;
        this.sob = sob;
        this.promedio = promedio;
        this.mayor = mayor;
        this.menor = menor;
        this.ide = ide;
        this.debajo = debajo;
        this.sobre = sobre;
    }

    
   

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public Integer getPeso() {
        return peso;
    }

    public Integer getAltura() {
        return altura;
    }


    public Integer getPromedio() {
        return promedio;
    }


    public Scanner getLeer() {
        return leer;
    }

    public Integer getI() {
        return i;
    }

    public Integer getDeb() {
        return deb;
    }

    public Integer getSob() {
        return sob;
    }

    public double getMayor() {
        return mayor;
    }

    public double getMenor() {
        return menor;
    }

    public double getIde() {
        return ide;
    }

    public double getDebajo() {
        return debajo;
    }

    public double getSobre() {
        return sobre;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public void setPromedio(Integer promedio) {
        this.promedio = promedio;
    }

    public void setI(double i) {
        this.i = getI()+1;
    }

    public void setDeb(double deb) {
        this.deb = getDeb()+1;
    }

    public void setSob(double sob) {
        this.sob = (getSob()+1);
    }

    public void setMayor(double mayor) {
        this.mayor = (getMayor()+1);
    }

    public void setMenor(double menor) {
        this.menor = (getMenor()+1);
    }

    public void setIde(double ide) {
        this.ide = (getIde()+1);
    }

    public void setDebajo(double debajo) {
        this.debajo = getDebajo()+1;
    }

    public void setSobre(double sobre) {
        this.sobre = getSobre()+1;
    }
    
    
     public Persona crearPersona() {
        System.out.println("A continuación ingresaras los datos de una persona:");
        System.out.println("Nombre:");
        setNombre(leer.next());
        System.out.println("Edad:");
        setEdad(leer.nextInt());
        do {
            System.out.println("Sexo:(M: masculino, F: femenino, O: otro)");
            setSexo(leer.next());
            String ss = getSexo().toUpperCase();
            if (!"M".equals(ss) || !"F".equals(ss) || !"O".equals(ss)) {
                x = true;
            } else {
                System.out.println("Esa opcion no está disponible");
            }
        } while (x != true);
        System.out.println("Peso: (en kg)");
        setPeso(leer.nextInt()+1);
        System.out.println("Altura: (en cm)");
        setAltura(leer.nextInt()+1);    
         calcularIMC();
        return null;       
    }
    public void calcularIMC() {
        final int i = -1; int ide=0; int Deb=0; int sobr=0;
        final int deb = 0;
        final int sob = 1;
        int pro;
        int sss;
        System.out.println("Se calculará si la persona se encuentra en su peso ideal:" + "\n" + "-1= Peso ideal" + "\n" + "0= Debajo del peso ideal" + "\n" + "1= Sobrepeso");
        pro = (getPeso() / ((getAltura() / 100) * 2));
        if (pro < 20) {
            System.out.println(i);
               ide++;       
          setIde(getIde()+ide);
        } else if (pro >= 20 && pro <= 25) {
            System.out.println(deb);
            sobr++;
           setDebajo(getDebajo()+sobr);
        } else if (pro > 25) {
            System.out.println(sob);
            Deb++;
           setSobre(getSobre()+Deb);
        }
         esmayor();
    }
     public void esmayor() {
        int may = 0;
        int men = 0;
        System.out.println("Se comprobara si la persona es mayor de edad:");
        if (getEdad() >= 18) {
            System.out.println("La persona es mayor de edad.");
            may++;
          setMayor(getMayor()+may);
        } else {
            System.out.println("La persona es menor de edad.");
            men++;
         setMenor(getMenor()+men);
        }
    }

    
    @Override
    public String toString() {
        System.out.println("El porcentaje de personas por encima de su peso es de "+((getSobre()/4)*100)+"%"+"\n"+"El porcentaje de personas con un peso ideal es de "+((getIde()/4)*100)+"%"+"\n"+"El porcentaje de personas por debajo de su peso es de "+((getDebajo()/4)*100)+"%"+"\n"+"El porcentaje de personas mayores es de "+((getMayor()/4)*100)+"%"+"\n"+"El porcentaje de personas menores es de "+((getMenor()/4)*100)+"%");
        return super.toString(); 
    }
     
}
