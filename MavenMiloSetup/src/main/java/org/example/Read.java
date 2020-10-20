package org.example;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfigBuilder;
import org.eclipse.milo.opcua.stack.client.DiscoveryClient;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;

import java.util.List;

public class Read {
    public static void main( String[] args )
    {
                try{
       /*     List<EndpointDescription> endpoints = DiscoveryClient.getEndpoints("opc.tcp://localhost:4840").get();
            System.out.println("Endpoints = " + endpoints);

            OpcUaClientConfigBuilder cfg = new OpcUaClientConfigBuilder();
            cfg.setEndpoint(endpoints.get(0));

            OpcUaClient client = OpcUaClient.create(cfg.build());
            client.connect().get();

            // Read the illuminance value of the nodeID = ns6;s=::Program:Cube.Command.CmdChangeRequest
            NodeId nodeId = new NodeId(6, "::Program:Cube.Command.CntrlCmd");

            DataValue dataValue = client.readValue(0, TimestampsToReturn.Both, nodeId).get();
            System.out.println("\n" + "Illuminance:" + "\n" + "DataValue = " + dataValue);

            Variant variant = dataValue.getValue();
            System.out.println("Variant = " + variant);

            float illuminance = (float)variant.getValue();
            System.out.println("Illuminance = " + illuminance);




            //Read the temperature of the nodeID = ns=2;s=O15-610-2/Window_2C59_temperature
            NodeId nodeIdTemp = new NodeId(2, "O15-610-2/Window_2C59_temperature");
            DataValue dataValueTemp = client.readValue(0, TimestampsToReturn.Both, nodeIdTemp).get();
            System.out.println("\n" + "Temperature:" + "\n" + "DataValue = " + dataValueTemp);

            Variant variantTemp = dataValueTemp.getValue();
            System.out.println("Variant = " + variantTemp);

            float temperature = (float)variantTemp.getValue();
            System.out.println("Temperature = " + temperature);


            //Read status (alarm) of the nodeID = ns=2;s=O15-610-2/Window_2C59_status
            NodeId nodeIdStatus = new NodeId(2, "O15-610-2/Window_2C59_status");
            DataValue dataValueStatus = client.readValue(0, TimestampsToReturn.Both, nodeIdStatus).get();
            System.out.println("\n" + "Status" + "\n" + "DataValue = " + dataValueStatus);

            Variant variantStatus = dataValueStatus.getValue();
            System.out.println("Variant = " + variantStatus);

            Boolean status = (Boolean) variantStatus.getValue();
            System.out.println("Status = " + status);
*/
                    List<EndpointDescription> endpoints = DiscoveryClient.getEndpoints("opc.tcp://192.168.0.122").get();
                    System.out.println("Endpoints = " + endpoints);

                    OpcUaClientConfigBuilder cfg = new OpcUaClientConfigBuilder();
                    cfg.setEndpoint(endpoints.get(0));

                    OpcUaClient client = OpcUaClient.create(cfg.build());
                    client.connect().get();

                    // Read the illuminance value of the nodeID = ns6;s=::Program:Cube.Command.CmdChangeRequest
                    NodeId nodeId = new NodeId(6, "::Program:Cube.Command.CntrlCmd");

                    DataValue dataValue = client.readValue(0, TimestampsToReturn.Both, nodeId).get();
                    System.out.println("\n" + "Illuminance:" + "\n" + "DataValue = " + dataValue);

                    Variant variant = dataValue.getValue();
                    System.out.println("Variant = " + variant);

                    float illuminance = (float)variant.getValue();
                    System.out.println("Illuminance = " + illuminance);



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
