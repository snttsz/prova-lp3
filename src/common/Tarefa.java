package common;

import java.io.Serializable;
import java.util.Date;

public class Tarefa implements Serializable
{
    public Tarefa(String nome, String prioridade, Date data_inicio)
    {
        this.nome = nome;
        this.prioridade = prioridade;
        this.data_inicio = data_inicio;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getPrioridade() 
    {
        return prioridade;
    }
    
    public void setPrioridade(String prioridade) 
    {
        this.prioridade = prioridade;
    }

    public Date getData_inicio() 
    {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) 
    {
        this.data_inicio = data_inicio;
    }

    private String nome;
    private String prioridade;
    private Date data_inicio;
}
