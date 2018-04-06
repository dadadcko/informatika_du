/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klientservercom;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Dano
 */
public class client {
    private static final int PORT = 5690;
     private static  int number;
     private static int tempor1;
    public static void main(String args[]) throws IOException{
         System.out.println(" program vypise logarizmus10 z cisla (zaokrúhlený ma celé čísla)");
         Scanner sc = new Scanner(System.in);
         Socket s = new Socket("128.3.85.1",PORT);
         Scanner sc1 = new Scanner(s.getInputStream()); 
       System.out.println("Write a number");
         number = sc.nextInt(); 
         PrintStream p = new PrintStream(s.getOutputStream());
         p.println(number);
         tempor1 = sc1.nextInt();
         System.out.println(tempor1);
         
    }
}
