package projeto.automacao;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import metodos.Metodos;

public class GoogleTeste {
	Metodos metodos = new Metodos ();
	
		
	

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("https://google.com.br");
	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	}

	@Test
	public void validarTitulo() throws IOException {
		metodos.evidencias("CT02 - titulo google");
		metodos.validarTitle("Google");
	
	}

}
