public class Menus {

    public void exibirMenuSistema(EnumHorarios jornadaTrabalho){
        System.out.println(
            "\nMENU DO SISTEMA:" +
            "\n" +
            "Jornada de trabalho atual: " + jornadaTrabalho +
            "\nPressione:\n" +
            "1 - Cadastrar novo membro\n" + 
            "2 - Apresentar membros cadastrados\n" + 
            "3 - Remover membro\n" + 
            "4 - Trocar jornada de trabalho\n" + 
            "5 - Postar mensagens\n" + 
            "9 - Sair\n" 
            
            );
        
        
        
    }

    public void exibirMenuCadastro(){
        System.out.println(

            "MENU DE CADASTRO:" + 
            "\n" +
            "1 - Mobile Member\n" + 
            "2 - Heavy Lifter\n" + 
            "3 - Script Guy\n" + 
            "4 - Big Brother\n" +
            "9 - Sair"
  
        );
        


    }


    
}

