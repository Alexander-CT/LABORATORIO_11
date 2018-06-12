package CASTRO_TOCAFFONDI;

import javax.swing.JOptionPane;
//Autor: CASTRO TOCAFFONDI
public class Menu {
    public Menu(){
        Colegio c=new Colegio("Jose maria raguedas");
        Alumno a1=new Alumno("Kevin", "14");
        Alumno a2=new Alumno("Juan", "14");
        String name,calificacion;
        String mensaje="";
        int opcion=0;
        mensaje+="***Menú***\n";
            mensaje+="1. Mostrar colegio\n";
            mensaje+="2. Mostrar alumno\n";
            mensaje+="3. Mostrar";
            
            opcion=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        do{
            switch(opcion){
                case 1: System.out.println("Mostrar datos almacenados: ");
                       c.mostrar();
                        
                    break;
                case 2: String element1 = String.valueOf(JOptionPane.showInputDialog("Agregar alumno")); //JOptionPane.showMessageDialog(null, "Primer Alumno: " );
            
                Alumno element = null;
                c.agregarAlumno(element);
            
                        
                    break;
                case 3:
                   
                    break; 
                   
            }
        }while(opcion!=3);
    }
}
