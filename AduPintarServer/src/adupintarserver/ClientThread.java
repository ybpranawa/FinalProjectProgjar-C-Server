/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adupintarserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author PRANAWA
 */
public class ClientThread implements Runnable {
    
    private Socket socket;
    private InputStream is;
    private OutputStream os;
    
    ClientThread(Socket socket) throws IOException{
        this.socket=socket;
        this.is=this.socket.getInputStream();
        this.os=this.socket.getOutputStream();
    }

    @Override
    public void run() {
        
    }
    
}
