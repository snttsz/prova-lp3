package RMI;

import java.rmi.*;
import common.ListaDeTarefas;

public interface InterfaceRMI extends Remote
{
    public String criarListaDeTarefas(String nomeDaTarefa) throws RemoteException;
    public ListaDeTarefas getListaDeTarefas(String nomeDaLista) throws RemoteException;
}
