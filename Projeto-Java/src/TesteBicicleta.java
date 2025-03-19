public class TesteBicicleta {
    public static void main(String[]args){
        Bicicleta caloi = new Bicicleta();
        caloi.marcha = 5;
        caloi.modelo = "ABC 123";
        caloi.nome = "caloi";

        caloi.imprimir();

        Bicicleta k = new Bicicleta();

        k.nome = "Fast Caloi";
        k.modelo = "FAST";

        caloi.imprimir();
        k.imprimir();
    }
}
