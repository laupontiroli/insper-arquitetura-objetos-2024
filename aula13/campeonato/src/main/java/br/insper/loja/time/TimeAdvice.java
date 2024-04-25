package br.insper.loja.time;

import br.insper.loja.common.Erro;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
public class TimeAdvice {

    @ExceptionHandler(TimeNaoEncontradoException.class)
    @ResponseBody  // precisa colocar pro erro virar body da resposta
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Erro TimeNaoEncontradoHandler(TimeNaoEncontradoException e){
        Erro erro = new Erro();
        erro.setMensagem(e.getMessage());
        erro.setCodigo(404);
        erro.setTime(LocalDateTime.now());
        return erro;
    }


}
