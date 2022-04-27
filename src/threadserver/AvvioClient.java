/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadserver;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franc
 */
public class AvvioClient {
    
    public static void main(String[] args) throws IOException {
     
        Client cli = new Client(InetAddress.getLocalHost(),2000);
        
         
        /*  try {
              //richiesta connessione al server

              socket = new Socket("127.0.0.1",port);
              System.out.println("Server connesso con il client"+ socket.getRemoteSocketAddress());
             System.out.println("porta client"+ socket.getLocalPort());
          } catch (ConnectException ex) {
                          System.err.println("Errore server non disponibile");

          }
            catch (IOException ex)
            {
                              Logger.getLogger(AvvioClient.class.getName()).log(Level.SEVERE, null, ex);

            }
          
          //chiusura collegamento
          finally {
              try{
                  socket.close();
              } 
              catch (IOException ex){
                   Logger.getLogger(AvvioClient.class.getName()).log(Level.SEVERE, null, ex);

              }
          }*/
          
             
        }
    
}
