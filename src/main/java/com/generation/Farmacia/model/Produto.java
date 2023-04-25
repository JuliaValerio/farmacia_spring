package com.generation.Farmacia.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity 
@Table(name = "tb_produtos") 
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message= "O atributo 'nome' é obrigatório!")
	@Size(max = 255, message = "O atributo 'título' deve ter no máximo 255 caracteres")
	private String nome;
	
	@NotBlank (message= "O atributo 'descricao' é obrigatório!")
	@Size(max = 500, message = "O atributo 'descricao' deve ter no máximo 255 caracteres")
	private String descricao;
	
	@NotNull
	private int quantidade;
	
	@NotBlank (message= "O atributo 'descricao' é obrigatório!")
	private String laboratorio;
	
	@NotNull
	@Positive
	private BigDecimal preco;
	
	private String foto;
	
	// RELACIONAMENTO COM A CLASSE CATEGORIA
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	
	//Get e Set
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}