package lista4.SimuladorDeContas3;

import java.awt.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void addConta(ContaCorrente conta){
        this.contas.add(conta);
    }

    public void imprimeContas(){
        if (this.contas.size() == 0){
            System.out.println(new ArrayList<>());
        } else {
            contas.stream()
                    .forEach(conta -> System.out.println(getNome() + ": " + conta));
        }
    }

}
