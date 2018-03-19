/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.vandenzen.mijnsensors1;

import nl.vandenzen.mijnsensors1.json.JsonReceiverResponse;
import org.apache.camel.Exchange;

/**
 *
 * @author carl
 * Over The Air Protocol (i.e. the protocol used in the 433 MHz signal)
 */
public class OTAProtocolExtractor {

    public OTAProtocolExtractor() {

    }

    public void storeMqttTopic(Exchange exchange) {
        JsonReceiverResponse jrr = ((JsonReceiverResponse) (exchange.getIn().getBody()));
        String otaProtocol = jrr.getProtocol();
        exchange.getIn().setHeader("mqttTopic", otaProtocol);
    }
    
    // Set on/off command in body
    public void replaceInBodyWithCommand(Exchange exchange) {
        JsonReceiverResponse jrr = ((JsonReceiverResponse) (exchange.getIn().getBody()));
        // Message is a subclass of the json message as sent by pilight
        String otaCommand = jrr.getMessage().getState();
        //exchange.getIn().setHeader("messageState", otaCommand);
        exchange.getIn().setBody(otaCommand);
    }
}
