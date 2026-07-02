package com.itb.inf2fm.zyclos.model.services;

import java.util.ArrayList;
import java.util.List;

import com.itb.inf2fm.zyclos.model.entity.Usuario;
import com.itb.inf2fm.zyclos.model.enums.TipoUsuario;

public class UsuarioService {

    private static List<Usuario> usuarios = new ArrayList<>();
    private static Long proximoId = 1L;

    static {
        Usuario usuario1 = new Usuario();
        usuario1.setId(gerarNovoId());
        usuario1.setNome("Ana Souza");
        usuario1.setCpf("123.456.789-00");
        usuario1.setEmail("ana.souza@email.com");
        usuario1.setSenha("123456");
        usuario1.setSexo("Feminino");
        usuario1.setLogradouro("Rua das Flores, 100");
        usuario1.setCep("01001-000");
        usuario1.setBairro("Centro");
        usuario1.setCidade("Sao Paulo");
        usuario1.setUf("SP");
        usuario1.setCodStatus(true);
        usuario1.setTipoUsuario(TipoUsuario.CLIENTE);
        usuarios.add(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setId(gerarNovoId());
        usuario2.setNome("Carlos Lima");
        usuario2.setCpf("987.654.321-00");
        usuario2.setEmail("carlos.lima@email.com");
        usuario2.setSenha("abcdef");
        usuario2.setSexo("Masculino");
        usuario2.setLogradouro("Av. Brasil, 2500");
        usuario2.setCep("20040-002");
        usuario2.setBairro("Centro");
        usuario2.setCidade("Rio de Janeiro");
        usuario2.setUf("RJ");
        usuario2.setCodStatus(true);
        usuario2.setTipoUsuario(TipoUsuario.VENDEDOR);
        usuarios.add(usuario2);
    }

    // CREATE
    public Usuario salvar(Usuario usuario) {
        usuario.setId(gerarNovoId());
        usuarios.add(usuario);
        return usuario;
    }

    // READ
    public List<Usuario> listarTodos() {
        return usuarios;
    }

    public Usuario buscarPorId(Long id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    // UPDATE
    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
        Usuario usuario = buscarPorId(id);
        if (usuario != null) {
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setCpf(usuarioAtualizado.getCpf());
            usuario.setEmail(usuarioAtualizado.getEmail());
            usuario.setSenha(usuarioAtualizado.getSenha());
            usuario.setSexo(usuarioAtualizado.getSexo());
            usuario.setLogradouro(usuarioAtualizado.getLogradouro());
            usuario.setCep(usuarioAtualizado.getCep());
            usuario.setBairro(usuarioAtualizado.getBairro());
            usuario.setCidade(usuarioAtualizado.getCidade());
            usuario.setUf(usuarioAtualizado.getUf());
            usuario.setCodStatus(usuarioAtualizado.isCodStatus());
            usuario.setTipoUsuario(usuarioAtualizado.getTipoUsuario());
        }
        return usuario;
    }

    // DELETE
    public boolean excluir(Long id) {
        Usuario usuario = buscarPorId(id);
        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }

    private static Long gerarNovoId() {
        return proximoId++;
    }
}
