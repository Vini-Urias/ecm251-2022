public class MobileMember extends Membros {

    public MobileMember(String email, String nome, EnumFuncoes funcao) {
        super(email, nome, funcao);
        
    }

    @Override
    public void apresentar() {
        System.out.println(toString());
        
    }

    

    @Override
    public void mensagem(EnumHorarios horario) {
        switch (horario) {
            default:
                break;
            case NORMAL:
                System.out.println("HappyCoding!");
                break;
            case EXTRA:
                System.out.println("MAsK_S0c13ty");
                break;
        }
        
    }
    
}
