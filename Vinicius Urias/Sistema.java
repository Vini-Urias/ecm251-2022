
import java.io.IOException;
import java.util.Scanner;



public class Sistema {
    
    final private static Menus menu = new Menus();
    final protected static IRepository repository = new Repository();
    final private static Scanner scanner = new Scanner(System.in);
    private static EnumHorarios jornadaTrabalho = EnumHorarios.NORMAL;


    public static void run() throws IOException {

        boolean rodar = true;
        
        System.out.println("\f\f\f\f\f\f\f\f\f\f\f\f");
     
        System.out.println("Bem Vindo ao sistema da MAsK_S0c13ty");

        while (rodar) {
            menu.exibirMenuSistema(jornadaTrabalho);
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    Membros membro = cadastroMembro();
                    if (membro != null) {
                        repository.adicionarMembro(membro);
                    }
                    break;

                case 2:
                    for (Membros membros : repository.getMembros()) {
                        membros.apresentar();
                    }
                    break;

                case 3:
                    for (int i = 0; i < repository.getMembros().size(); i++) {
                        System.out.print("[" + (i + 1) + "]" + " ");
                        repository.getMembros().get(i).apresentar();

                    }
                    System.out.println("Digite o índice do membro a ser removido do sistema.");
                    int indice = scanner.nextInt();
                    repository.removerMembros(repository.getMembros().get(indice - 1));
                    break;

                case 4:
                    switch (jornadaTrabalho) {
                        case NORMAL:
                            jornadaTrabalho = EnumHorarios.EXTRA;
                            break;

                        case EXTRA:
                            jornadaTrabalho = EnumHorarios.NORMAL;
                            break;
                        default:
                            break;

                    }
                    break;

                case 5:
                    for (Membros membros : repository.getMembros()) {
                        membros.mensagem(jornadaTrabalho);
                    }
                    break;

                case 9:
                    System.out.println("\nVocê está saindo do sistema.");
                    rodar = false;
                    break;

                default:
                    break;
            }
        }
    }


    private static Membros cadastroMembro() {
        menu.exibirMenuCadastro();

        int opcaoMembro = scanner.nextInt();
        System.out.println("Digite o nome do membro: ");
        String nome = scanner.next();

        System.out.println("Digite o email do membro: ");
        String email = scanner.next();
        switch (opcaoMembro) {

            case 1:
                return new MobileMember(email, nome, EnumFuncoes.MobileMembers);

            case 2:
                return new HeavyLift(email, nome, EnumFuncoes.HeavyLifters);

            case 3:
                return new ScriptGuy(email, nome, EnumFuncoes.ScriptGuys);

            case 4:
                return new BigBrother(email, nome, EnumFuncoes.BigBrothers);

            case 9:
                return null;

            default:
                System.out.println("Opção inválida! Digite um valor válido.");
                return null;
        }
    }
}
