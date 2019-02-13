import java.util.ArrayList;
import java.util.List;
  
public class MatematicaDiscreta {
  
       /**
        * CÓDDIGO EXEMPLO
        */
    public static void main(String[] args) {           

        //Cria duas novas listas.
        List<Professor> professores = new ArrayList<Professor>();
        List<Professor> professoresNovos = new ArrayList<Professor>();
        
        Professor professor = new Professor();
        
        //adiciona um professor a nossa lista
        professores.add(professor);
        
        //adiciona um professor a uma posição exata da lista
        professores.add(10, professor);
        
        /*
        * Imagine que desejamos adicionar uma lista de 
        * professores novos a nossa lista de professores,
        * podemos adicionar todos de uma só vez, usando o 'addAll'
        * */
        professores.addAll(professoresNovos);
        
        /* Caso prefira, pode usar um for para adicionar 
        * os professoresNovos.Nosso laço FOR abaixo, tem a mesma 
        * função do addAll.
        */
        for(int i = 0 ; i < professoresNovos.size(); i++){
            professores.add(professoresNovos.get(i));
        }
           
        /*
        * Verifica se o professor está na lista de professores.        
        */
        professores.contains(professor);
        
        //Remove todos os elementos da lista
        professores.clear();     
    }

}
