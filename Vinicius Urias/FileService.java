
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;


public class FileService {
    static FileWriter arquivo;

    public FileService(FileWriter arquivo) {
        FileService.arquivo = arquivo;
    }

    

    public static void salvarEmCSV(ArrayList<Membros> membros) {
        File file = new File("arquivo_super_Secreto_nao_abrir.csv");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("nome;funcao;email\n");

            for (Membros membro : membros) {
                String escrita = tratarString(membro.getNome(), membro.getFuncao(), membro.getEmail());
                try {
                    fileWriter.write(escrita + "\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    
    /** 
     * @param membro
     * @param funcao
     * @param email
     * @return String
     */
    public static String tratarString(String membro, Funcoes funcao, String email) {
        // Membro [Nome = darth, Função = HeavyLifters, E-mail = darth@gmail.com]
        String exibirMembro = membro + ";" + funcao + ";" + email;

        return exibirMembro;
    }

}
