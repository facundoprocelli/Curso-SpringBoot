package controller;

import module.Alumno;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

@RestController // Indica que es un controlador de Spring MVC
@RequestMapping("/alumnos") // Indica que /alumno es una nueva URL
                //Todas las request se hacen a esta URI
public class CRUDAlumnoController {

    private final ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public CRUDAlumnoController() {

        listaAlumnos.add(new Alumno("Juan Perez", 24, "juan.perez@mail.com", "1234567", new GregorianCalendar(2000, Calendar.JANUARY, 15)));
        listaAlumnos.add(new Alumno("Maria Gomez", 29, "maria.gomez@mail.com", "2345678", new GregorianCalendar(1995, Calendar.AUGUST, 22)));
        listaAlumnos.add(new Alumno("Carlos Lopez", 44, "carlos.lopez@mail.com", "3456789", new GregorianCalendar(1980, Calendar.FEBRUARY, 5)));
        listaAlumnos.add(new Alumno("Ana Sanchez", 49, "ana.sanchez@mail.com", "4567890", new GregorianCalendar(1975, Calendar.MAY, 12)));
        listaAlumnos.add(new Alumno("Luis Rodriguez", 21, "luis.rodriguez@mail.com", "5678901", new GregorianCalendar(2003, Calendar.SEPTEMBER, 30)));
        listaAlumnos.add(new Alumno("Sofia Martinez", 34, "sofia.martinez@mail.com", "6789012", new GregorianCalendar(1990, Calendar.JULY, 3)));
        listaAlumnos.add(new Alumno("Pedro Fernandez", 39, "pedro.fernandez@mail.com", "7890123", new GregorianCalendar(1985, Calendar.DECEMBER, 9)));

    }
    /*
    @PostMapping
    @PutMapping
    @DeleteMapping
    */

}

