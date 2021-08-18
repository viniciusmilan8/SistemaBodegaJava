import java.util.*;
public class Bodega {
    public static void main(String[] args){
        Scanner Leitura = new Scanner(System.in);
        List<Funcionario> bodegueiros = new ArrayList<>();
        List<Clientes> cachaceiros = new ArrayList<>();
        List<Bebida> bebidas = new ArrayList<>();
        int lerCod = 0;
            int opcao = 0;
            do {
                System.out.println("\n\n### Sistema da Melhor Bodega Do Sul ###");
                System.out.println("\n        ================================");
                System.out.println(" |   1 - Cadastrar funcionário  |");
                System.out.println(" |   2 - Mostrar funcionários   |");
                System.out.println(" |   3 - Cadastrar Bebidas      |");
                System.out.println(" |   4 - Mostrar Bebidas        |");
                System.out.println(" |   5 - Compra de Bebida       |");
                System.out.println(" |   6 - Venda de Bebida        |");
                System.out.println(" |   7 - Cadastrar clientes     |");
                System.out.println(" |   8 - Mostrar clientes       |");
                System.out.println(" |   0 - Sair                   |");
                System.out.println(" ================================\n");
                opcao = Leitura.nextInt();
                switch (opcao) {
                case 1:
                String nFunc;
                int iFunc;
                double sFunc;
                    System.out.println("Digite o nome do funcionario: ");
                    nFunc = Leitura.next();
                    System.out.println("Digite a idade do funcionario: ");
                    iFunc = Leitura.nextInt();
                    System.out.println("Digite o salario do funcionario: ");
                    sFunc= Leitura.nextDouble();
                    Funcionario novoFuncionario = new Funcionario(lerCod,iFunc,nFunc,sFunc);
                    lerCod++;
                    bodegueiros.add(novoFuncionario);
                    break;
                case 2:
                for (int i = 0; i < lerCod; i++) {
                    Funcionario a = bodegueiros.get(i);
                    System.out.println("\nNome do funcionario: " + a.NomeFuncionario);
                    System.out.println("Idade do funcionario: " + a.IdadeFuncionario);
                    System.out.println("Salario do funcionario: " + a.Salario);
                    }
                    break;
                case 3:
                    String nBebida;
                    int qtdBebida;
                    double tAlcoolico, qtdMl, pVenda;
                    System.out.println("Qual o nome da bebida: ");
                    nBebida = Leitura.next();
                    System.out.println("Digite a Quantidade desta bebida no estoque: ");
                    qtdBebida = Leitura.nextInt();
                    System.out.println("Qual o teor alcoolico desta bebida? ");
                    tAlcoolico = Leitura.nextDouble();
                    System.out.println("Qual a quantidade em ml: ");
                    qtdMl = Leitura.nextDouble();
                    System.out.println("Digite o preco para venda: ");
                    pVenda = Leitura.nextDouble();
                    Bebida novaBebida = new Bebida(lerCod, nBebida, qtdBebida , tAlcoolico , qtdMl , pVenda);
                    lerCod++;
                    bebidas.add(novaBebida);
                    break;
                case 4:
                for (int i = 0; i < lerCod; i++) {
                    Bebida a = bebidas.get(i);
                    System.out.println("\nO codigo da bebida e: " + a.CodigoBebida);
                    System.out.print("\nO nome da bebida e: " + a.NomeBebida);
                    System.out.println("\nQuantidade atual no estoque: " + a.QTDEstoque);
                    System.out.println("\nO teor alcoolico da bebida e: " + a.TeorAlcoolico);
                    System.out.println("\nQTD em ml da bebida: " + a.QTDMl);
                    System.out.println("\nO preco para venda e: " + a.PrecoVenda);
                    }
                    break;
                case 5:
                    int cBebida, qtdComprar;
                    System.out.println("Digite o codigo do produto que deseja comprar: ");
                    cBebida = Leitura.nextInt();
                    System.out.println("Digite a quantidade que deseja comprar(UND): ");
                    qtdComprar = Leitura.nextInt();
                    Bebida b = bebidas.get(cBebida);
                    b.comprarBebida(cBebida, qtdComprar);
                    break;
                case 6:
                    
                    break;
                case 7:
                    String nCliente;
                    int cpfCliente;
                    boolean fCliente;
                    System.out.println("Digite o nome do cliente: ");
                    nCliente = Leitura.next();
                    System.out.println("Digite o CPF do cliente: ");
                    cpfCliente = Leitura.nextInt();
                    fCliente = false;
                    Clientes novoCliente = new Clientes(lerCod, nCliente, cpfCliente, fCliente);
                    lerCod++;
                    cachaceiros.add(novoCliente);
                    break;
                case 8:
                for (int i = 0; i < lerCod; i++) {
                    Clientes a = cachaceiros.get(i);
                    System.out.println("\nCodigo Cliente: " + a.CodigoCliente);
                    System.out.print("\nNome do cliente: " + a.NomeCliente);
                    System.out.println("\nCPF do cliente: " + a.CPFCliente);
                    if(fCliente = false){
                        System.out.println("Este cliente nao pode comprar fiado!");
                    }else{
                        fCliente = true;
                        System.out.println("Este cliente pode comprar fiado!");
                        }
                    }
                    break;
                case 0:
                
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
                }
            } while (opcao != 0);
        }
    }

