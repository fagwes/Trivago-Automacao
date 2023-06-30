package testes;

import java.io.IOException;

import executa.Executa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import massadedados.MassadeDados;
import metodos.Metodos;

public class Testes extends MassadeDados {

	@Given("que eu esteja no site")
	public void que_eu_esteja_no_site() {
		Executa.abrirNavegador();
		Executa.abrirtela();

	}

	@Given("digito o valor “Manaus” no campo de busca")
	public void digito_o_valor_manaus_no_campo_de_busca() {

		Metodos.escrever(campobusca, nome);
		Metodos.submit(campobusca);

	}

	@When("clicar no botão Pesquisar")
	public void clicar_no_botão_pesquisar() {

		Metodos.clicar(pesquisar);

	}

	@When("selecionar a opção Ordenar por Avaliação e Sugestões")
	public void selecionar_a_opção_ordenar_por_avaliação_e_sugestões() throws InterruptedException {

		Metodos.clicarlink(site);
		Thread.sleep(40000);

	}

	@Then("verifique o nome da lista, avaliação e o valor")
	public void verifique_o_nome_da_lista_avaliação_e_o_valor() throws IOException {

		Metodos.clicar(campobusca);
		Metodos.evidencia(nome);

	}
}
