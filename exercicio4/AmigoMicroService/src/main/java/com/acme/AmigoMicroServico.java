package com.acme;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acme.db.Amigo;
import comum.CrudAbstract;

@Controller
@EnableAutoConfiguration
@RequestMapping("api/Amigo")
public class AmigoMicroServico extends CrudAbstract<Amigo> {
    
	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Alo Mundo!";
    }
    
    @RequestMapping("/alo")
    @ResponseBody
    String recursoRest() {
        return "Alo Mundo Recurso Rest!";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(AmigoMicroServico.class, args);
    }

	@Override
	protected List lista() {
		// TODO Auto-generated method stub
		return null;
	}
}
