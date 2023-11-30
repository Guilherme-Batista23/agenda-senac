package com.senac.perseu.Controller;

import com.senac.perseu.Model.Registro;
import com.senac.perseu.dao.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class CadastroController {

    @Autowired
    RegistroRepository registroRepository;

    @GetMapping("/Cadastro")
    public String abrir(Registro registro){
        return "Cadastro";

    }

    @PostMapping("/Registro")
    public String cadastrar(Registro registro) {
          registroRepository.save(registro);
        return "index";
    }


}
