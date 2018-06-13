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
        int cont = 0;
        System.out.println("-------------------\nDATOS ALMACENADOS:\n-------------------");
        for(Alumno obj: lista){
            cont++;
            System.out.println("Alumno "+cont+":\nNombre: "+ obj.getNombre());//JOptionPane.showInputDialog("Nombre"+ obj.getNombre());
            System.out.println("Nota: "+ obj.getNota()+"\n---------------------------------------");//JOptionPane.showInputDialog("Notas"+ obj.getNota());
        }
    }
}
