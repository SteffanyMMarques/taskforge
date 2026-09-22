package br.com.docodigoaocontrato.taskforge;

import br.com.docodigoaocontrato.taskforge.model.Usuario;
import br.com.docodigoaocontrato.taskforge.model.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskforgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskforgeApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(CategoriaRepository categoriaRepository, UsuarioRepository usuarioRepository) {
        return args -> {

            if (categoriaRepository.count() == 0) {
                categoriaRepository.save(new Categoria("Estudo"));
                categoriaRepository.save(new Categoria("Trabalho"));
                categoriaRepository.save(new Categoria("Pessoal"));
            }

            if (usuarioRepository.count() == 0) {
                usuarioRepository.save(new Usuario("Ana", "ana@email.com", true));
                usuarioRepository.save(new Usuario("Carlos", "carlos@email.com", true));
                usuarioRepository.save(new Usuario("Bia", "bia@email.com", false));
                usuarioRepository.save(new Usuario("Daniel", "daniel@email.com", false));
            }
        };
    }
}