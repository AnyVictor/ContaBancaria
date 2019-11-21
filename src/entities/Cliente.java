/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author dest1
 */
public class Cliente {
    private String nome;
    private int numeroConta;
    private double saldo;

    public Cliente(String nome, int numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    public Cliente(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void sacar(double valor){
        saldo -= valor;
    }
    
    public String toString(){
        return "Account " + numeroConta + ", Holder: " + nome + ", Balance: " + saldo;
    }
    
}
