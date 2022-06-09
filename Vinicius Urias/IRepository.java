import java.util.ArrayList;


public interface IRepository {
    void adicionarMembro(Membros membro);
    void removerMembros(Membros membro);
    ArrayList<Membros> getMembros();


}