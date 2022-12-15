package StructuralPatterns.FlyWeight;

import StructuralPatterns.Bridge.Client1;
import StructuralPatterns.Bridge.Client2;
import StructuralPatterns.Bridge.ClientInBank;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory {
    private static final Map<String, ClientInBank> clients = new HashMap<>();

    public ClientInBank getClient(String typeOfClient){
        ClientInBank client = clients.get(typeOfClient);

        if(client == null){
            switch (typeOfClient) {
                case "client1" -> {
                    System.out.println("Client 1 interacting with bank staff");
                    client = new Client1();
                }
                case "client2" -> {
                    System.out.println("Client 2 interacting with bank staff");
                    client = new Client2();
                }
            }
            clients.put(typeOfClient, client);
        }
        return client;
    }
}
