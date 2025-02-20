package Cod;
import java.util.ArrayList;
public class Alumno extends Persona{
	 private ArrayList<Materia> materias = new ArrayList<>();

	    public Alumno(String nombre, int id) {
	        super(nombre, id);
	    }

	    public void inscribirMateria(Materia materia) {
	        materias.add(materia);
	    }
}
