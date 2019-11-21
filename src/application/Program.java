/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Cliente;

/**
 *
 * @author dest1
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Enter account number: ");
        int numeroConta = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Is there a initial deposit(y/n)?");
        char choice = sc.next().charAt(0);
        Cliente cliente;
        if(choice == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            
            cliente = new Cliente(nome, numeroConta, initialDeposit);
        }
        else{
            cliente = new Cliente(nome, numeroConta);
        }
        
        System.out.println("Account data: " + cliente);
        
        System.out.println("Enter a deposit value: ");
        double deposito = sc.nextDouble();
        cliente.depositar(deposito);
        System.out.println("Updated account data: " + cliente);
        
        
        System.out.println("Enter a withdraw value: ");
        double saque = sc.nextDouble();
        cliente.sacar(saque);
        System.out.println("Updated accoubt data: " + cliente);
        
        sc.close();
    }
}
