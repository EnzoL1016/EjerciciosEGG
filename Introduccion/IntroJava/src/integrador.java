
public class integrador {

    public static void main(String[] args) {
        System.out.println(integrator("hola"));
    }

    public static String integrator(String palabra) {
        
        int indice=0;
        int contador=0;
        
            if (palabra.contains("a")) {
                indice = palabra.indexOf("a");              
                palabra = palabra.substring(0, indice+1)+"pa"+palabra.substring(indice+1);
                contador++;
            } 
            if (palabra.contains("e")) {
                 indice = palabra.indexOf("e");
                palabra = palabra.substring(0, indice+1)+"pe"+palabra.substring(indice);
                contador++;
            } 
            if (palabra.contains("i")) {
                indice = palabra.indexOf("i");
                palabra = palabra.substring(0, indice+1)+"pi"+palabra.substring(indice);
                contador++;
            } 
            if (palabra.contains("o")) {
                indice = palabra.indexOf("o");
                palabra = palabra.substring(0,indice+1)+"po"+palabra.substring(indice+1);
                contador++;
            } 
            if(palabra.contains("u")){
                 indice = palabra.indexOf("u");
               palabra = palabra.substring(0, indice+1)+"pu"+palabra.substring(indice);
               contador++;
            } 
            return palabra;

    }
}
