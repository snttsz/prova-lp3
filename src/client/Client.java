package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import RMI.InterfaceRMI;

public class Client {
    public static void main(String[] args) 
    {
        try {

            String host = "25.35.154.184"; // Usar o endereço IP correto do servidor RMI
            int port = 1099;

            // Obtém o registro RMI no servidor usando o endereço IP e porta especificados
            Registry registry = LocateRegistry.getRegistry(host, port);

            // Procura o objeto remoto registrado com o nome "ListaDeTarefas" no registro RMI
            InterfaceRMI stub = (InterfaceRMI) registry.lookup("ListaDeTarefas");

            // Chama o método remoto para criar uma nova lista de tarefas
            System.out.println("Criando a lista de tarefas: " + stub.criarListaDeTarefas("LP3"));
            System.out.println("Nome da tarefa: " + stub.getListaDeTarefas("LP3").getNomeDaLista());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}