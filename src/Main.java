public class Main {
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.agregarInicio(1);
        listaEnlazada.agregarInicio(2);
        listaEnlazada.agregarInicio(3);
        listaEnlazada.agregarFinal(5);
        listaEnlazada.verLista();
    }
}