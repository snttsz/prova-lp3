package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import RMI.InterfaceRMI;
import common.*;

public class Server implements InterfaceRMI
{
    @Override
    public String criarListaDeTarefas(String nomeDaTarefa) throws RemoteException
    {
        this.listaDeTarefas = new ListaDeTarefas(nomeDaTarefa);

        return "Lista de tarefas criada com sucesso!";
    }   

    @Override
    public ListaDeTarefas getListaDeTarefas(String nomeDaLista) throws RemoteException
    {
        return this.listaDeTarefas;
    }

    public static void main(String[] args)
    {
        try 
        {
            
            Server server = new Server();
            int port = 1099;
            String IPHAMACHI = "25.35.82.150";

            System.setProperty("java.rmi.server.hostname", IPHAMACHI);

            InterfaceRMI stub = (InterfaceRMI) UnicastRemoteObject.exportObject(server, 0);

            Registry registry = LocateRegistry.createRegistry(port);
            registry.rebind("ListaDeTarefas", stub);

            System.out.println("Servidor iniciado na porta " + port);
        } 
        catch (Exception e) 
        {
            System.err.println("Erro no servidor: " + e.toString());
            e.printStackTrace();
        }
    }

    /* 
     *  
     *      ATRIBUTOS INTERNOS
     * 
     */

    private ListaDeTarefas listaDeTarefas;
}
