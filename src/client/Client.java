package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import RMI.InterfaceRMI;

public class Client {
    public static void main(String[] args) 
    {
        try {

            String host = "25.35.154.184";
            int port = 1099;

            Registry registry = LocateRegistry.getRegistry(host, port);
            InterfaceRMI stub = (InterfaceRMI) registry.lookup("ListaDeTarefas");

            System.out.println("Criando a lista de tarefas: " + stub.criarListaDeTarefas("LP3"));
            System.out.println("Nome da tarefa: " + stub.getListaDeTarefas("LP3").getNomeDaLista());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}