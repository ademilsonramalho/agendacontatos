package br.com.cotiinformatica.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import br.com.cotiinformatica.entities.Usuario;
import br.com.cotiinformatica.factories.ConnectionFactory;

public class UsuarioRepository {

	// create
	public void create(Usuario usuario) throws Exception {

		// abrir conexão com o banco de dados
		Connection connection = ConnectionFactory.createConnection();

		// escrever um comando SQL

		PreparedStatement statement = connection
				.prepareStatement("insert into usuario(nome, email, senha) values (?,?,?");

		statement.setString(1, usuario.getNome());
		statement.setString(2, usuario.getEmail());
		statement.setString(3, usuario.getSenha());

		statement.execute();
		statement.close();
	}

	// update
	public void update(Usuario usuario) throws Exception {

		// abrir conexão com o banco de dados
		Connection connection = ConnectionFactory.createConnection();

		// escrever um comando SQL

		PreparedStatement statement = connection
				.prepareStatement("update usuario set nome=1, email=2, senha=3 where idusuario=?");

		statement.setString(1, usuario.getNome());
		statement.setString(2, usuario.getEmail());
		statement.setString(3, usuario.getSenha());
		statement.setInt(4, usuario.getIdUsuario());

		statement.execute();
		statement.close();
	}

	// delete
	public void delete(Usuario usuario) throws Exception {

		// abrir conexão com o banco de dados
		Connection connection = ConnectionFactory.createConnection();

		// escrever um comando SQL

		PreparedStatement statement = connection.prepareStatement("delete from  usuario where idusuario=?");

		statement.setInt(1, usuario.getIdUsuario());

		statement.execute();
		statement.close();
	}

	// find ALL
	public List<Usuario> findAll() throws Exception {

		Connection connection = ConnectionFactory.createConnection();
		return null;

	}
}
