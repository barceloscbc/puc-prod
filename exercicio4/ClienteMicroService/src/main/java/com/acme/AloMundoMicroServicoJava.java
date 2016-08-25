package com.acme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acme.db.Cliente;
import com.acme.repository.ClienteRepository;

@Controller
@EnableAutoConfiguration
public class AloMundoMicroServicoJava {
	
	private static ClienteRepository clienteRepository = new ClienteRepository();
	
    @RequestMapping("/")
    @ResponseBody
    String home() throws Exception {
        
        Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setNome("Igor");
        
        Cliente c2 = new Cliente();
        c2.setId(2);
        c2.setNome("Cleber");
        
        Cliente c3 = new Cliente();
        c3.setId(3);
        c3.setNome("Chimba");
        
        Cliente c4 = new Cliente();
        c4.setId(4);
        c4.setNome("Evandro");
        
        clienteRepository.add(c1);
        clienteRepository.add(c2);
        clienteRepository.add(c3);
        clienteRepository.add(c4);
        
        clienteRepository.delete(1);
        
        Cliente c5 = new Cliente();
        c5.setId(4);
        c5.setNome("EvandroAtualizado");
        clienteRepository.update(c5);
        
        
        Cliente cRecu = new Cliente();
        clienteRepository.get(222);
        
        return "Alo Mundo!";
    }
    
    @RequestMapping("/alo")
    @ResponseBody
    String recursoRest() {
        return "Alo Mundo Recurso Rest!";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(AloMundoMicroServicoJava.class, args);
    }
}
