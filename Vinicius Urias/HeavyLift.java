public class HeavyLift extends Membros{

    public HeavyLift(String email, String nome, EnumFuncoes funcao) {
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
                System.out.println("Podem contar conosco!");
                break;
            case EXTRA:
                System.out.println("N00b_qu3_n_Se_r3pita.bat");
                break;
        }
       
        
    }
    
}

