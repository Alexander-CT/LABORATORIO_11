package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI
public class Alumno {
    private String Nombre;
    private int Nota;
    
    public Alumno(String Nombre, int Nota)
    {
        setNombre(Nombre);
        setNota(Nota);
    }
    public void setNombre(String Nombre)
    {
        this.Nombre=Nombre;
    }
    public String getNombre()
    {
        return Nombre;
    }
    public void setNota(int Nota)
    {
        this.Nota=Nota;
    }
    public int getNota()
    {
        return Nota;
    }
}
