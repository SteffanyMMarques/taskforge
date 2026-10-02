package br.com.docodigoaocontrato.taskforge.service;

import br.com.docodigoaocontrato.taskforge.dto.ComentarioDTO;
import br.com.docodigoaocontrato.taskforge.model.Comentario;
import br.com.docodigoaocontrato.taskforge.repository.ComentarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioService {

    private final ComentarioRepository comentarioRepository;

    public ComentarioService(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    public List<ComentarioDTO> listarTodos() {
        return comentarioRepository.findAll()
                .stream()
                .map(comentario -> toDTO(comentario))
                .toList();
    }

    public Optional<ComentarioDTO> atualizarComentario(Long id, ComentarioDTO comentarioDTO) {
        Optional<Comentario> comentario = comentarioRepository.findById(id);
        if (comentario.isEmpty()) {
            return Optional.empty();
        }
        Comentario comentarioAtualizado = comentario.get();
        comentarioAtualizado.setAutor(comentarioDTO.getAutor());
        comentarioAtualizado.setDescricao(comentarioDTO.getDescricao());
        return Optional.of(toDTO(comentarioRepository.save(comentarioAtualizado)));
    }

    public boolean deletarComentario(Long id) {
        if (comentarioRepository.existsById(id)) {
            comentarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<ComentarioDTO> buscarPorId(Long id) {
        return comentarioRepository.findById(id)
                .map(comentario -> toDto(comentario));

    }

    private ComentarioDTO toDto(Comentario comentario) {
        return new ComentarioDTO(comentario.getId(),
                comentario.getDescricao(), comentario.getAutor());
    }

    public ComentarioDTO criarComentario(ComentarioDTO comentarioDTO) {
        Comentario comentario = toEntity(comentarioDTO);
        return toDTO(comentarioRepository.save(comentario));
    }

    private ComentarioDTO toDTO(Comentario comentario) {
        return new ComentarioDTO(comentario.getId(),
                comentario.getDescricao(), comentario.getAutor());
    }

    private Comentario toEntity(ComentarioDTO comentarioDTO) {
        return new Comentario(comentarioDTO.getId(),
                comentarioDTO.getDescricao(), comentarioDTO.getAutor());
    }
}
