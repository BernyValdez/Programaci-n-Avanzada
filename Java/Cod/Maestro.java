package Cod;

public class Maestro extends Persona {
    private Materia materiaAsignada;

    public Maestro(String nombre, int id) {
        super(nombre, id);
    }

    public void asignarMateria(Materia materia) {
        this.materiaAsignada = materia;
    }
}