package org.example;

import org.eclipse.milo.opcua.stack.client.DiscoveryClient;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;

import java.util.List;


public class ConnectOPCUAServer
{
    public static void main( String[] args )
    {
        try{
            List<EndpointDescription> endpoints = DiscoveryClient.getEndpoints("opc.tcp://localhost:4840").get();
            System.out.println("Endpoints = " + endpoints);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
