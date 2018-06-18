package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI
//import java.util.ArrayList;
//import javax.swing.JOptionPane;
public class ListaCircular<T> {
    /*private ArrayList<Nodo> lista;
    public void agregarNodo(Nodo<T> n){
        lista.add(n);
    }
    public boolean esVacia(){
        return lista==null || lista.size()==0;
    }
    public int cantidad(){
        int contador=0;
        for(Nodo obj: lista){
            contador++;
        }
        return contador;
    }
    public void mostrar(){
        if(!esVacia()){
            int cont = 0;
            System.out.println("-------------------\nNODOS ALMACENADOS:\n-------------------");
            for(Nodo obj: lista){
                cont++;
                System.out.println(cont+")  "+ obj.getDato()+"\n---------------------------------------");//JOptionPane.showInputDialog("Notas"+ obj.getNota());
            }    
        }else{
            JOptionPane.showMessageDialog(null,"No hay nodos en la lista","ERROR: Lista vacia",JOptionPane.ERROR_MESSAGE);
        }
    }*/
    Nodo<T> raiz;
    public ListaCircular(){
        raiz=null;
    }
    public boolean esVacia(){
        return (raiz==null);
    }
    public ListaCircular insertar(T dato){
        /*Nodo<T> nuevo = new Nodo(dato);
        nuevo.setDato(dato);
        if(!esVacia()){
            raiz=nuevo;
            raiz.setSiguiente(nuevo);//nuevo.setSiguiente(raiz);
        }else{
            Nodo<T> aux=raiz;
            while(aux.getSiguiente()!=raiz){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(raiz);
        }*/
        Nodo<T> nuevo=new Nodo<>(dato);
        if(!esVacia()){
            raiz.setSiguiente(nuevo);
            raiz=raiz.getSiguiente();
        }
        raiz=nuevo;
        return this;
    }
    public int cantidad(){
        int contador=0;
        if(!esVacia()){
            Nodo<T> aux=raiz;
            do{
                contador++;
                aux=aux.getSiguiente();
            }while(aux!=raiz);//while(aux.getSiguiente!=raiz);
        }
        return contador;
    }
    public void imprimirDoWhile(){
        if(!esVacia()){
            Nodo<T> aux=raiz;
            String cadena="";
            do{
                cadena=cadena+"[ "+aux.getDato()+" ]-->";
                aux=aux.getSiguiente();
            }while(aux!=raiz.getSiguiente());//No era siguiente, era raiz.getSiguiente, ahora funciona.
            System.out.println(cadena);
        }
    }
    public void imprimirWhile(){
        if(!esVacia()){
            if(cantidad()==1){
                System.out.println(raiz.getDato());
            }else{
                Nodo<T> aux=raiz;
                while(aux.getSiguiente()!=raiz){
                    System.out.println(aux.getDato()+"..............");
                    aux=aux.getSiguiente();
                }
                System.out.println(aux.getDato());
            }
        }
    }
}
