package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI
public class Alumno {
    private String Nombre
    private String Nota;
    
    public Alumno(String Nombre, String Nota)
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
    public void setNota(String Nota)
    {
        this.Nota=Nota;
    }
    public String getNota()
    {
        return Nota;
    }
}
