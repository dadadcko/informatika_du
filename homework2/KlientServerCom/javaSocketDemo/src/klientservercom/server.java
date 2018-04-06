/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klientservercom;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Dano
 */
public class server {
     private static final int PORT = 5690;
     private static int number ;
     private static int temporary;
    public static void main(String args[]) throws IOException{        
        ServerSocket s1 = new ServerSocket(PORT);
        Socket ss = s1.accept(); 
        Scanner sc = new Scanner(ss.getInputStream());
        number =sc.nextInt();
        temporary =(int) Math.log10(number);
        PrintStream p = new PrintStream(ss.getOutputStream());
        p.println(temporary);
        
    }
    
}
