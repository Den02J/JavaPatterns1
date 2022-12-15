package StructuralPatterns.FlyWeight;

import StructuralPatterns.Bridge.ClientInBank;

import java.util.ArrayList;
import java.util.List;

public class FlyWeightRunner {
    public static void main(String[] args) {
        ClientFactory clientFactory = new ClientFactory();

        List<ClientInBank> clients = new ArrayList<>();

        clients.add(clientFactory.getClient("client1"));
        clients.add(clientFactory.getClient("client1"));
        clients.add(clientFactory.getClient("client1"));
        clients.add(clientFactory.getClient("client1"));
        clients.add(clientFactory.getClient("client1"));
        clients.add(clientFactory.getClient("client2"));
        clients.add(clientFactory.getClient("client2"));
        clients.add(clientFactory.getClient("client2"));
        clients.add(clientFactory.getClient("client2"));
        clients.add(clientFactory.getClient("client2"));

        for(ClientInBank client: clients) {
            client.paymentProcess();
        }

    }
}
