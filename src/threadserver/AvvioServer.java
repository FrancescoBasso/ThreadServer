/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franc
 */
public class AvvioServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    
   
    
    Server svr = new Server(2000);
    svr.ascolto();
    svr.leggi();
    svr.scrivi("Benvenuto client!");
    /*
        try {
            //1) apertura porta
            // il server si mette in ascolto
            sSocket = new ServerSocket(port);
            System.out.println("in attesa di connessione");
            //2)il server si connette al client
           
            socket = sSocket.accept();
            System.out.println("Server connesso con il client"+ socket.getRemoteSocketAddress());
            
           
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
          
        } catch (BindException ex) {
            System.err.println("Server già avviato");
            Logger.getLogger(AvvioServer.class.getName()).log(Level.SEVERE, null, ex);
        }*/
          //3 scambio dati
          //3 scambio dati
        
     /*   finally{
             try {
                 //4)Chiusura socket
                if (socket != null){
                    socket.close();
                }
                
            } catch (IOException ex) {
                Logger.getLogger(AvvioServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }*/
        
        Countdown c = new Countdown(100);
        c.start();
        
        
     
    
    }
    
}
