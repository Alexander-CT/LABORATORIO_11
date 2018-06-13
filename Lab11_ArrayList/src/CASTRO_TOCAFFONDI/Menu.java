package CASTRO_TOCAFFONDI;

import javax.swing.JOptionPane;
//Autor: CASTRO TOCAFFONDI
public class Menu {
    public Menu(){
        Colegio c=new Colegio("Miguel Grau");
        String name;
        int opcion=0;
        String mensaje="1. Agregar alumno\n";
        mensaje+="2. Mostrar\n";
        mensaje+="3. Salir";
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,mensaje,"MENÚ",JOptionPane.INFORMATION_MESSAGE));
            switch(opcion){
                case 1: //AGREGAR ALUMNO 
                    try{
                        String nameAlumno=String.valueOf(JOptionPane.showInputDialog(null,"Ingresa el nombre del alumno"));
                        int calificacion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la nota del alumno"));
                        Alumno a=new Alumno(nameAlumno, calificacion);
                        //Agregando al Nodo
                        c.agregarAlumno(a);
                    }catch(NumberFormatException n){
                        JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
                    }
                    break;
                case 2: //MOSTRAR
                    c.mostrar();
                    break;
                case 3: //Salir
                   
                    break; 
                   
            }
        }while(opcion!=3);
    }
}
