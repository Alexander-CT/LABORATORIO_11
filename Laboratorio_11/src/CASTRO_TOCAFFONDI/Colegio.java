package CASTRO_TOCAFFONDI;
import java.util.ArrayList;
//Autor: CASTRO TOCAFFONDI
public class Colegio {
    private String RazonSocial;
    private ArrayList<Alumno> lista;
    
    public Colegio(String RazonSocial){
        this.RazonSocial=RazonSocial;
        lista=new ArrayList<Alumno>();
    }
    public void agregarAlumno(Alumno a){
        lista.add(a);
    }
    public void mostrar()
    {
        for(Alumno obj: lista){
            System.out.println("Nombre"+ obj.getNombre());//JOptionPane.showInputDialog("Nombre"+ obj.getNombre());
            System.out.println("Notas"+ obj.getNota());//JOptionPane.showInputDialog("Notas"+ obj.getNota());
        }
    }
}
