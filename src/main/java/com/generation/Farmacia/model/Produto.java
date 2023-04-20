package com.generation.Farmacia.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O atributo é Obrigatório!")
	@Size(min = 1, max = 255, message = "O atributo nome deve ter no minimo 1 e no maximo 255 caracteres")
	private String nome;
	
	@NotNull(message = "O atributo é Obrigatório!")
	@Size(min = 1, max = 1000, message = "O atributo descricao deve ter no minimo 1 e no maximo 1000 caracteres")
	private String descricao;

	@NotNull(message = "O atributo é Obrigatório!")
	private Integer quantidade;
	
	@NotNull(message = "O atributo é Obrigatório!")
	@Size(min = 1, max = 255, message = "O atributo laboratorio deve ter no minimo 1 e no maximo 255 caracteres")
	private String laboratorio;

	@NotNull(message = "O atributo é Obrigatório!")
	private BigDecimal preco;
	

	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Categoria categoria;
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
