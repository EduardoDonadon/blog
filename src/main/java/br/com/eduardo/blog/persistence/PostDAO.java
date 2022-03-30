package br.com.eduardo.blog.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.eduardo.blog.model.Post;

public class PostDAO {

	private static List<Post> posts = new ArrayList<Post>();
	
	static {
		posts.add(new Post("Post 1", "Texto 1", "Pedro"));
		posts.add(new Post("Post 2", "Texto 2", "Maria"));
		posts.add(new Post("Post 3", "Texto 3", "Joao"));
		posts.add(new Post("Post 4", "Texto 4", "Gabriel"));
	}
	
	public List<Post> listar() {
		return posts;
	}
	
	public void save(Post post) {
		posts.add(post);
	}
}
