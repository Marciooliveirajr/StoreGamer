package com.generation.lojadegames.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_categoria")

public class Categoria {
			
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotBlank (message = "Titulo obrigatório!")
		@Size (min = 5, max = 100, message = "Titulo deve conter no mínimo 5 caracteres e no máximo 100 caracteres")
		private String titulo;
		
		@NotBlank (message = "descrição do produto é obrigatório!")
		@Size (min = 5, max = 100, message = "A descrição deve conter no mínimo 5 caracteres e no máximo 100 caracteres")
		private String descricao;
		
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
		@JsonIgnoreProperties("categoria")
		private List<Produto> produto;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getTipoProduto() {
			return descricao;
		}

		public void setTipoProduto(String tipoProduto) {
			this.descricao = tipoProduto;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public List<Produto> getProduto() {
			return produto;
		}

		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}
	
		
		
}
