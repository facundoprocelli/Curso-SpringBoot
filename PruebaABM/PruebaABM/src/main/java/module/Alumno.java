package module;

import jakarta.validation.constraints.*;

import java.util.Calendar;

public class Alumno {

    //Atributos

    @NotNull(message = "El nombre no puede ser null")
    @Size(min = 3, max = 50, message = "No puede contener menos de 3 o mas de 50 caracteres")
    private String nombre;

    @Min(17)
    @Max(99)
    private int edad;

    @Email
    private String mail;

    @NotNull(message = "El estudiante debe tener un legajo")
    @Size(min = 7, max = 8, message = "El legajo debe contener entre 7 y 8 caracteres")
    private String legajo;

@Past
    private Calendar fechaNacimiento;


    //Constructor


    public Alumno() {
    }

    public Alumno(String nombre, int edad, String mail, String legajo, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
        this.legajo = legajo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", mail='" + mail + '\'' +
                ", legajo='" + legajo + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
