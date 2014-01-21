package controllers;

/**
 * Created by gilmar on 20/01/14.
 */

import play.*;
import play.mvc.*;
import models.*;
import play.libs.Json;
import play.libs.Json.*;
import static play.libs.Json.toJson;


public class Servico extends Controller {

    public static Result adicionar(){

        ObjectNode response = Json.newObject();

        Tarefa tarefa = new Tarefa();
        tarefa.id = (long)tarefas.values().size();
        tarefa.descricao = request().body().asMultipartFormData().asFormUrlEncoded().get("descricao")[0];
        tarefa.titulo = request().body().asMultipartFormData().asFormUrlEncoded().get("titulo")[0];
        tarefa.completada = false;

        tarefas.put(tarefa.id, tarefa);

        response.put("id", tarefa.id);
        response.put("resposta", "Tarefa Adicionada com Sucesso.");

        return ok(response);
    }

    public static Result excluir(Long id){
        return null;
    }

    public static Result completar(Long id){
        return null;
    }

    public static Result listar(){
        return null;
    }
}
