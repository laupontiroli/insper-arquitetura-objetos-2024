package br.insper.loja.time;

public class TimeNaoEncontradoException extends RuntimeException{

    public TimeNaoEncontradoException(String mensagem) {
        super(mensagem);  // super chama o constrututor do pai (RuntimeException)
    }

}
