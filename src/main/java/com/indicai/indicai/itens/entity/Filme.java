package com.indicai.indicai.itens.entity;
import java.util.List;

import com.indicai.indicai.avaliacao.Avaliacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="filmes")
public class Filme{
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String pais;
    private int anoLancamento;
    private String diretor;
    private String elencoPrincipal;

    @OneToMany(mappedBy = "filme")
    private List<Avaliacao> avaliacoes;

    public Filme() {
    }

	public Filme(Long id, String titulo, String pais, int anoLancamento, String diretor, String elencoPrincipal,
			List<Avaliacao> avaliacoes) {
		this.id = id;
		this.titulo = titulo;
		this.pais = pais;
		this.anoLancamento = anoLancamento;
		this.diretor = diretor;
		this.elencoPrincipal = elencoPrincipal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getElencoPrincipal() {
		return elencoPrincipal;
	}

	public void setElencoPrincipal(String elencoPrincipal) {
		this.elencoPrincipal = elencoPrincipal;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	@Override
	public String toString() {
		return "Filme [id=" + id + ", titulo=" + titulo + ", pais=" + pais + ", anoLancamento=" + anoLancamento
				+ ", diretor=" + diretor + ", elencoPrincipal=" + elencoPrincipal + ", avaliacoes=" + avaliacoes + "]";
	}

}