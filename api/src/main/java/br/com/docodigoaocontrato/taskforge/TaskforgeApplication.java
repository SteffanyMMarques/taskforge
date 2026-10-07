package br.com.docodigoaocontrato.taskforge;

import br.com.docodigoaocontrato.taskforge.model.Categoria;
import br.com.docodigoaocontrato.taskforge.model.Usuario;
import br.com.docodigoaocontrato.taskforge.repository.CategoriaRepository;
import br.com.docodigoaocontrato.taskforge.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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
                BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
                usuarioRepository.save(new Usuario(
                        "Ana", "ana@email.com", encoder.encode("123456")));
                usuarioRepository.save(new Usuario(
                        "Carlos", "carlos@email.com", encoder.encode("123456")));
                usuarioRepository.save(new Usuario(
                        "Bia", "bia@email.com", encoder.encode("123456")));
                usuarioRepository.save(new Usuario(
                        "Daniel", "daniel@email.com", encoder.encode("123456")));
            }
        };
    }
}