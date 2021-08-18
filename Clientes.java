public class Clientes {
    int CodigoCliente, CPFCliente;
    String NomeCliente;
    boolean Fiado; 
    Clientes(int CodigoCliente, String NomeCliente, int CPFCliente, Boolean Fiado){
        this.CodigoCliente = CodigoCliente;
        this.NomeCliente = NomeCliente;
        this.CPFCliente = CPFCliente;
        this.Fiado = Fiado;
    }
}
