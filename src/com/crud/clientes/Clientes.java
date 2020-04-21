/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.clientes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class Clientes {
      // atributos (Criando as variaveis a serem utilizadas)
    private String nome;
    private String email;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public  String salvar(){
    
        try {
            //Instanciando uma classe do Java que está dentro da biblioteca Java.IO/
            //O metodo true serve para dizer que o texto irá ser acrescentado e não substituido)
            FileWriter fw = new FileWriter("clientes.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            //pular linha
            pw.println("Nome "+this.nome);
            pw.println("Email "+this.email);
            pw.println("CPF "+this.cpf);
            //O flush serve para enviar os dados do formulario no mesmo momento 
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            return "Cadastrado com sucesso !!" ;
    
    }
}
