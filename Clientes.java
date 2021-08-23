public class Clientes {
    int CodigoCliente;
    String NomeCliente, CPFCliente;
    boolean Fiado; 
    Clientes(int CodigoCliente, String NomeCliente, String CPFCliente, Boolean Fiado){
        this.CodigoCliente = CodigoCliente;
        this.NomeCliente = NomeCliente;
        this.CPFCliente = CPFCliente;
        this.Fiado = Fiado;
    }
}
