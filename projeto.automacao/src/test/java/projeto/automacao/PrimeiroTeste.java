package projeto.automacao;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import metodos.Metodos;

public class PrimeiroTeste {

	Metodos metodos = new Metodos();
	By pesquisar = By.xpath("//input[@id='twotabsearchtextbox']");

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("https://www.amazon.com.br");
		
	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	
	}

	@Test
	public void validarTitle() throws IOException {
		metodos.evidencias("CT01 - validando titulo");
		metodos.validarTitle("Amazon.com.br | Tudo pra você, de A a Z.");
	}
		
	@Test
	public void buscarProduto() throws IOException {
		metodos.escrever(pesquisar,"Iphone 13");
		metodos.evidencias("CT02 - Buscar produto");
		
	}
		
		
		

	


}
