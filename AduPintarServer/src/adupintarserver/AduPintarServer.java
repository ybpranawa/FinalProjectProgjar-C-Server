/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adupintarserver;

/**
 *
 * @author PRANAWA
 */
public class AduPintarServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int port = 1111;
        ServerHandle server=new ServerHandle(port);
        server.start();
    }   
}