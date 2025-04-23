
import Controllers.PersonaController;
import Models.Persona;
import views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] { 
            new Persona("Juan",25),
            new Persona("Maria",30),
            new Persona("Carlos",22),
            new Persona("Ana",28),
            new Persona("Luis",35),
            new Persona("Sofia",27),
            new Persona("Miguel",40),
            new Persona("Laura",32),
            new Persona("Pedro",29),
            new Persona("Elena",26),
    
        };

        PersonaController pC= new PersonaController();
        ViewConsole vC= new ViewConsole();

        vC.printMessage("Arreglo personas");
        vC.prinrArrayPersons(personas);

        vC.printMessage("Arreglo Ordeado por insercion");

        pC.ordenarPorEdad(personas);
        vC.prinrArrayPersons(personas);

    }
}
        



