package br.unipar.teste;

import br.unipar.interfaces.InterfaceAnimais;

public class Cachorro implements InterfaceAnimais {


    @Override
    public String emitirSom() {
        return "auau";
    }

    @Override
    public void correr() {
        Integer velocidade = 10;

    }

    @Override
    public void alimentacao() {

    }
}
