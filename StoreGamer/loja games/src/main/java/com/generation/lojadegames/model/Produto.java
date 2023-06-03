package com.generation.lojadegames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_Produto")
public class Produto {	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotBlank (message = "Nome obrigatório!")
		@Size (min = 5, max = 100, message = "Nome deve conter no mínimo 5 caracteres e no máximo 100 caracteres")
		private String Nome;
		
		@NotBlank (message = "Insira um valor!")
		private double Precoproduto;
		
		@NotBlank (message = "Insira uma quantidade!")
		private int qtdproduto;

		
		@ManyToOne
		@JsonIgnoreProperties("categoria")
		private Categoria categoria;
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public double getPrecoproduto() {
			return Precoproduto;
		}

		public void setPrecoproduto(double precoproduto) {
			Precoproduto = precoproduto;
		}

		public int getQtdproduto() {
			return qtdproduto;
		}

		public void setQtdproduto(int qtdproduto) {
			this.qtdproduto = qtdproduto;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
			
}
