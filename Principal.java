package JavaProjectsOrientadoObj;


public class Principal {

   public static void main(String[] args) {
   
    int op = 0;

    do {
        
        System.out.println("\n1 Cadastrar Cliente\n2 Lista de Clientes\n3 Cadastrar de Vendedor\n4 Lista de Vendedores\n5 Cadastrar de Produto\n6  Lista de Produtos\n7 Registrar Venda\n8 Listar Vendas\n9 Listar Vendas por Cliente\n0 Sair\n");
        op =  Console.readInt("Digite a Opção");

        switch (op) {
        case 1:
            System.out.println("Cadastrar Cliente");
        break;
            case 2:
                System.out.println("Lista de Clientes");
            break;
                case 3:
                    System.out.println("Cadastrar de Vendedor");
                break;
                    case 4:
                    System.out.println("Lista de Vendedores");
                    break;
                        case 5:
                        System.out.println("Lista de Produtos");
                        break;
                            case 6:
                            System.out.println("Lista de Produtos");
                            break;
                                case 7:
                                System.out.println("Registrar Venda");
                                break;
                                    case 8:
                                    System.out.println("Listar Vendas");
                                    break;
                                        case 9:
                                        System.out.println("Listar Vendas por Cliente");
                                        break;
                                            case 0:
                                            System.out.println("Obrigado!!!");
                                            break;
            
            default:
            System.out.println("Opção Invalida!");
            break;
        }

    } while (op != 0);

   
    
    }
}

