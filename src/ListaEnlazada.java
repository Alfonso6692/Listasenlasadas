public class ListaEnlazada {
    protected Nodo primero;

    public ListaEnlazada() {
        primero = null;
    }

    public ListaEnlazada agregarInicio(int dato) {
        Nodo nuevo;
        nuevo = new Nodo(dato);
        nuevo.ref=primero;
        primero=nuevo;
        return this; //regresar a la misma lista
    }

    public void agregarFinal(int dato) {
        Nodo nuevoF;
        nuevoF=new Nodo(dato);
        nuevoF.ref=null;

        if(primero==null) {
            primero=nuevoF;
            return ;
        }
        Nodo tmp;
        for(tmp=primero;tmp.getRef()!=null;tmp=tmp.getRef());
            tmp.setRef(nuevoF);

    }

    public void buscar () {}

    public void eliminar() {}

    public void verLista() {
        Nodo nodov;
        nodov=primero;
        while(nodov!=null){
            System.out.println(nodov.dato);
            nodov=nodov.ref;
        }
    }

}
