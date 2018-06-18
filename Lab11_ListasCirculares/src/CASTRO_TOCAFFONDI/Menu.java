package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI
import javax.swing.JOptionPane;
public class Menu<T> {
    public Menu(){
        ListaCircular<T> Lc=new ListaCircular<>();
        T element = null;
        String mensaje="1. Agregar nodo\n";
        mensaje+="2. Mostrar\n";
        mensaje+="3. Salir";
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,mensaje,"MENÚ",JOptionPane.INFORMATION_MESSAGE));
            switch(opcion){
                case 1: //AGREGAR NODO
                    element=(T) String.valueOf(JOptionPane.showInputDialog(null,"Ingresa el elemento"));
                    Lc.insertar(element);
                    break;
                case 2: //MOSTRAR
                    Lc.imprimirDoWhile();
                    break;
                case 3: //Salir
                   
                    break; 
                   
            }
        }while(opcion!=3);
    }
}
