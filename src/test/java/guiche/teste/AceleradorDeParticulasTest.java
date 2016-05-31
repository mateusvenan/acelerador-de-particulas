package guiche.teste;

import org.junit.Assert;
import org.junit.Test;

public class AceleradorDeParticulasTest {
	AceleradorDeParticulas acelerador;

	@Test
	public void teste1() {
		Assert.assertEquals("1 1 0", acelerador.obterDistribuicao(3, 1, 3));
	}

	@Test
	public void teste2() {
		Assert.assertEquals("10 61 59 61 9 0 0 0 0 0", acelerador.obterDistribuicao(1_000_000_000, 100, 10));
	}

	@Test
	public void teste3() {
		Assert.assertEquals("10 61 59 61 9 0 0 0 0 0", acelerador.obterDistribuicao(1_000_000_001, 100, 10));
	}

	@Test
	public void teste4() {
		Assert.assertEquals(
				"1 0 0 0 1 0 1 2 0 0 0 2 0 0 2 0 2 1 2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0",
				acelerador.obterDistribuicao(1000_000_000, 2, 50));
	}

	@Test
	public void teste5() {
		Assert.assertEquals("91 9 0 0 0 0 0 0 0 0", acelerador.obterDistribuicao(1_000, 101, 10));
	}

	@Test
	public void teste6() {
		Assert.assertEquals(
				"10 2 8 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0",
				acelerador.obterDistribuicao(1_000, 10, 101));
	}

}
