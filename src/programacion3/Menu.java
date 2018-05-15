
package programacion3;




import java.util.List;
import java.util.Scanner;
public class Menu {
  
    public static void main(String[] args) {
        PersonaRepository repository = new PersonaRepository();
    
    int op;
    
  
        System.out.println("MENU DE OPCIONES ");
        System.out.println("1.- AGREGAR PERSONAS");
        System.out.println("2.- MOSTRAR LISTAS");
        System.out.println("3.- BUSCAR POR CODIGO");
        System.out.println("4.- BUSCAR POR RANGO");
        System.out.println("5.- BUSCAR POR FILTRO");
        System.out.println("Salir");
        
        do {
        Scanner lectura = new Scanner(System.in);
        
        op=lectura.nextInt();
        
            switch (op ){
                case 1:
                    System.out.println("AGREGAR PERSONA");
                    Persona pr4 = new Persona(3, "ANDY", "DURAN", 24);
                    repository.Agregar(pr4);
                    break;
                case 2:
                    System.out.println("MOSTRAR LISTA");
                  
                    for(Persona personas :repository.getPersonas()){
                        System.out.println("" +personas);}
                      
                    break ;
                    
                case 3: 
                    System.out.println("BUSCAR POR CODIGO");
                    System.out.println();
                    Persona result = repository.getPersona(4);
                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("BUSCAR POR RANGO");
                    for (Persona personas: repository.getPorRangoEdad(2, 40))
                        System.out.println("" +personas);
                    
                    break;
                case 5:
                    System.out.println("BUSCAR POR FILTRO");
                    String Filtro="e";
                    System.out.println("");
                    List<Persona> ListFilter= repository.getPorNombre(Filtro);
                    System.out.println(ListFilter);
                    break;
                case 6:
                    System.out.println("SALIR");
                    
                            }
        } while (op <6);//DOWHILE PRINCIPAL
    
}
}