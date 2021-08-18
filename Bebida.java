import java.util.*;
public class Bebida {
    Scanner Leitura = new Scanner(System.in);
    int CodigoBebida, QTDEstoque;
    double TeorAlcoolico, QTDMl, PrecoVenda;
    String NomeBebida;
    void comprarBebida(int CodigoBebida, int qtdB){
        QTDEstoque = QTDEstoque + qtdB;
    }
    void venderBebida(){

    }
    Bebida(int CodigoBebida, String NomeBebida, int QTDEstoque, double TeorAlcoolico, double QTDMl, double PrecoVenda){
        this.CodigoBebida = CodigoBebida;
        this.NomeBebida = NomeBebida;
        this.QTDEstoque = QTDEstoque;
        this.TeorAlcoolico = TeorAlcoolico;
        this.QTDMl = QTDMl;
        this.PrecoVenda = PrecoVenda;
    }
}
