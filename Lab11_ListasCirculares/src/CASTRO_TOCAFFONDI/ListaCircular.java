package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI
public class ListaCircular<T> {
    private Nodo<T> raiz;
    public ListaCircular(){
        raiz=null;
    }
    public boolean esVacia(){//*****************************
        Nodo<T> aux=null;
        return (raiz==aux);
    }
    public void insertar(T dato){
        Nodo<T> nuevo=new Nodo<>(dato);
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
        }
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
            do{
                System.out.println(aux.getDato()+"...............");
                aux=aux.getSiguiente();
            }while(aux!=raiz);
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
