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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franc
 */
public class Server {
     ServerSocket ss;
     Socket so;
     BufferedWriter bw;
     BufferedReader br;
     Countdown cd;
    public Server(int porta){
         try {
             ss = new ServerSocket(porta);
             System.out.println("in attesa di connessione");
             ss.setSoTimeout(3000);
             cd = new Countdown(2000);
             cd.start();
         } catch (IOException ex) {
             Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public void ascolto(){
         try {
             so = ss.accept();
              System.out.println("Server connesso con il client"+ so.getRemoteSocketAddress());
              bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
              br = new BufferedReader(new InputStreamReader(so.getInputStream()));
         } catch (IOException ex) {
             Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public void scrivi(String messaggio){
         try {
             bw.write(messaggio+"\n");
             bw.flush();
         } catch (IOException ex) {
             Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
         }
       
    }
    public String leggi(){
        String messagioritorno="";
         try {
             messagioritorno = br.readLine();
         } catch (IOException ex) {
             Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
         }
        return messagioritorno;
    }
}
