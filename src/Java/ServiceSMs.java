/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import org.smslib.AGateway;
import org.smslib.modem.ModemGateway;
import org.smslib.modem.SerialModemGateway;

/**
 *
 * @author novan
 */
public class ServiceSMs {
    public void StartService(String Port,int Bitrate)throws Exception{
//      this.service = new Service();
      SerialModemGateway gateway = new SerialModemGateway("", Port , Bitrate, "", "");
       gateway.setInbound(true);
       gateway.setOutbound(true);
       gateway.setProtocol(AGateway.Protocols.PDU);
         gateway.setIpProtocol(ModemGateway.IPProtocols.BINARY);
//       this.service.addGateway(gateway);
       org.smslib.Service.getInstance().addGateway(gateway);
    }
}
