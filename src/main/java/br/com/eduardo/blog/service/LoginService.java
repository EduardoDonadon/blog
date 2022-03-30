package br.com.eduardo.blog.service;

import br.com.eduardo.blog.model.Usuario;

public class LoginService {
	public boolean autenticar(Usuario user) {
		return user.getLogin().equals(user.getSenha());
	}
	
}
