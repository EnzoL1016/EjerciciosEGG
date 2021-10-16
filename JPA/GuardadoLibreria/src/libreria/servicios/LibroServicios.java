package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;


public class LibroServicios {
   
    Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n");
    ServicioGeneral sg = new ServicioGeneral();
    
    public void IngresarLibro() throws Exception{
               
        AutorServicios autorServicios = new AutorServicios();
        EditorialServicios editorialServicio = new EditorialServicios();
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        Libro nuevoLibro = new Libro();
        nuevoLibro.setIsbn("ISBN"+"-"+979+"-"+987+"-"+aleatorio(10000,99999)+"-"+aleatorio(10,99)+"-"+aleatorio(1,9));
        System.out.print("Ingrese el título: ");
        nuevoLibro.setTitulo(leer.nextLine());
        if(nuevoLibro.getTitulo() == null || nuevoLibro.getTitulo().isEmpty()){
            throw new Exception("Debe ingresar un titulo");
        }
        System.out.println("Ingrese el año:");
        nuevoLibro.setAnio(leer.nextInt());leer.nextLine();        
        System.out.println("Ingrese la cantidad de ejemplares:");
        nuevoLibro.setEjemplares(leer.nextInt());leer.nextLine();
        System.out.println("Ingrese la cantidad de ejemplares prestados:");
        nuevoLibro.setEjemplaresPrestados(leer.nextInt());leer.nextLine();
        nuevoLibro.setEjemplaresRestantes(nuevoLibro.getEjemplares()-nuevoLibro.getEjemplaresPrestados());
        
      
        System.out.println("Elija un Autor de la siguiente Lista: ");
        autorServicios.listarAutor();
        System.out.println("Puede presionar el número 0 para crear un nuevo autor");
        int opcion = leer.nextInt();leer.nextLine();
        if(opcion == 0){
            System.out.println("Ingrese el nombre del Autor:");
            autor.setNombre(leer.nextLine());
            nuevoLibro.setAutor(autor);
            sg.ingresarEntidad(nuevoLibro);
        }else{
            autor = autorServicios.buscarAutorID(opcion);
            nuevoLibro.setAutor(autor);
        }
               
        System.out.println("Elija una Editorial de la siguiente Lista:");
        editorialServicio.listarEditorial();
        System.out.println("Puede presionar el número 0 para crear una nueva Editorial");
        opcion = leer.nextInt();leer.nextLine();
        if(opcion == 0){
            System.out.println("Ingrese el nombre de la nueva Editorial:");
            editorial.setNombre(leer.nextLine());
            nuevoLibro.setEditorial(editorial);
            sg.actualizarEntidad(nuevoLibro);
        }else{
            editorial = editorialServicio.buscarEditorialID(opcion);
            nuevoLibro.setEditorial(editorial);
            sg.actualizarEntidad(nuevoLibro);
        }   
    }
    
    public void modificarLibro() throws Exception{
       
        System.out.println("Indique el numero de ISBN del libro a editar:");
        listarLibros();
        int isbn = leer.nextInt();leer.nextLine();
        Libro libro = buscarLibroID(isbn);
        System.out.println("Quiere modificar el Titulo? y/n");
        String opcion = leer.nextLine().toUpperCase();
        if(opcion.equals("Y")){
            System.out.println("Escriba el nuevo Titulo:");
            libro.setTitulo(leer.nextLine());
        }
        System.out.println("Quiere modificar el año? y/n");
        opcion = leer.nextLine();
        if(opcion.equals("Y")){
            System.out.println("Escriba el nuevo año:");
            libro.setAnio(leer.nextInt());leer.nextLine();
        }
        //falta el codigo para modificar los demas atributos, que seria repetir lo mismo de arriba
        
        sg.actualizarEntidad(libro);
    }
    
    public  Libro buscarLibroID(int id){
        
        String sql = "Select a FROM Libro a WHERE a.id = "+id;
        Libro libro = (Libro) sg.listarEntidad(sql);
        return libro;
    }
    
    public void listarLibros(){
        String sql = "Select a FROM Libro a";
        List<Libro> list = sg.listarEntidades(sql);

        if (list.isEmpty()) {
            System.out.println("No hay libros para mostrar");
        } else {
            System.out.println("");
            System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("");
            System.out.println("ISBN:"+"\t\t\t\t"+espacios("Titulo:")+espacios("Año:")+espacios("Ejemplares:")+espacios("Ejemplares Prestados:")+espacios("Ejemplares restantes:")+espacios("Nombre Autor:")+espacios("Nombre Editorial:"));
            for (Libro a : list) {
                
                System.out.println(a.getIsbn()+"\t\t"+espacios(a.getTitulo())+espacios(String.valueOf(a.getAnio()))+espacios(String.valueOf(a.getEjemplares()))+espacios(String.valueOf(a.getEjemplaresPrestados()))+espacios(String.valueOf(a.getEjemplaresRestantes()))+espacios(String.valueOf(a.getAutor().getNombre()))+espacios(String.valueOf(a.getEditorial().getNombre())));    
            }
            System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("");
        }
    }
    
    public void listarLibross(){
        String sql = "Select a FROM Libro a";
        List<Libro> list = sg.listarEntidades(sql);

        if (list.isEmpty()) {
            System.out.println("No hay libros para mostrar");
        } else {
            System.out.println("");           
            for (Libro a : list) {
                
                System.out.println(a.getId()+")"+espacios(a.getTitulo())+" Año: "+espacios(String.valueOf(a.getAnio()))+"  Autor: "+espacios(String.valueOf(a.getAutor().getNombre()))+" Editorial: "+espacios(String.valueOf(a.getEditorial().getNombre())));    
            }
            System.out.println("");
        }
    }
    
    public void eliminarLibro(){
        System.out.println("Ingrese el numero de ID del libro a eliminar:");
        int id = leer.nextInt();
        String sql = "Select a FROM Libro a WHERE a.id = "+id;
        Libro libro = (Libro) sg.listarEntidad(sql);
        
        if (libro == null) {
            System.out.println("No hay Libro para eliminar");
        }else{
            libro.setAlta(false);
            sg.eliminarEntidad(libro);
        }
        
    }
    
    public void buscarLibroEditorial(){
        System.out.println("Indique la Editorial de los libros a buscar");
        String editorial = leer.nextLine();
        String sql= "Select a FROM Libro a WHERE a.editorial.nombre IN ('"+editorial+"')";
        List<Libro> list =  sg.listarEntidades(sql);
        
        if (list.isEmpty()) {
            System.out.println("No hay Libros para mostrar");
        }else{
            for (Libro a : list) {
                System.out.println("Libro: "+a.getTitulo());
            }
        }
    }
    
    public void buscarLibroISBN(){
        System.out.println("Indique el numero de ISBN a buscar");
        int isbn = leer.nextInt();
        String jpql = "Select a FROM Libro a WHERE a.isbn="+isbn;
        Libro libro = (Libro) sg.listarEntidad(jpql);       
        if (libro == null) {
            System.out.println("No hay autores para mostrar");
        }else{
            System.out.println("Libro: "+libro.getTitulo());
        }
    }
    
    public void buscarLibroTitulo(){
        System.out.println("Ingrese el titulo a buscar");
        String titulo = leer.nextLine();
        String jpql = "Select a FROM Libro a WHERE a.titulo IN ('"+titulo+"')";
        List<Libro> list =  sg.listarEntidades(jpql);
        
        if (list.isEmpty()) {
            System.out.println("No hay Libros para mostrar");
        }else{
            for (Libro a : list) {
                System.out.println("ISBN: "+a.getIsbn()+"Libro: "+a.getTitulo()+" Cant Ejemplares: "+a.getEjemplares());
            }
        }
    }
     
    public void buscarLibroPorAutor(){
        System.out.println("Indique el Autor de los libros a buscar");
        String autor = leer.nextLine();
        String jpql = "Select a FROM Libro a WHERE a.autor.nombre IN ('"+autor+"')";
        List<Libro> list =  sg.listarEntidades(jpql);
        
        if (list.isEmpty()) {
            System.out.println("No hay Libros para mostrar");
        }else{
            for (Libro a : list) {
                System.out.println("Libro: "+a.getTitulo());
            }
        }
    }
     
    public static String espacios(String cadena) {
        int cantEspacios = 40 - cadena.length();
        for (int i = 0; i < cantEspacios; i++) {
            cadena += " ";
        }
        return cadena;
    }
      
    public static int aleatorio(int minimo, int maximo){
     Integer num =  (int)Math.floor(Math.random()*(maximo-minimo+1)+minimo);   
        return num;
    }
}
