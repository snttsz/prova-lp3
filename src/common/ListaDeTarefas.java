package common;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaDeTarefas implements Serializable
{
    public ListaDeTarefas(String nomeDaLista)
    {
        this.nomeDaLista = nomeDaLista;
        this.listaDeTarefas = new ArrayList<Tarefa>();
    }

    private Tarefa localizarTarefa(Tarefa tarefa)
    {
        Tarefa result = null;

        for (Tarefa tarefaExistente : this.listaDeTarefas) 
        {
            if (tarefa.getNome().equals(tarefaExistente.getNome()))
            {
                result = tarefaExistente;
            }
        }

        return result;
    }

    public String adicionarTarefa(Tarefa tarefa)
    {
        String result = "Tarefa já existe na lista de tarefas!";

        if (localizarTarefa(tarefa) == null)
        {
            listaDeTarefas.add(tarefa);
            result = "Tarefa adicionada com sucesso.";
        }

        return result;
    }

    public String removerTarefa(Tarefa tarefa)
    {
        String result = "Tarefa não existe na lista de tarefas!";

        if (localizarTarefa(tarefa) != null)
        {
            listaDeTarefas.remove(tarefa);
            result = "Tarefa removida da lista de tarefas!";
        }

        return result;
    }

    public Tarefa getTarefa(String nomeDaTarefa)
    {
        Tarefa tarefa = null;

        Tarefa tarefalocalizada = localizarTarefa(tarefa);
        if (tarefalocalizada != null)
        {
            tarefa = tarefalocalizada;
        }

        return tarefa;
    }

    public String getNomeDaLista() 
    {
        return nomeDaLista;
    }

    public void setNomeDaLista(String nomeDaLista) 
    {
        this.nomeDaLista = nomeDaLista;
    }

    private String nomeDaLista;
    private ArrayList<Tarefa> listaDeTarefas;
}
