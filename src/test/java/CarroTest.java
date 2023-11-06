import org.junit.Assert;
import org.junit.Test;


public class CarroTest {
    @Test
    public void deveIniciarDesligado(){
        // Teste #1 - Deve iniciar desligado
        // Given (Dado)
        Carro carro = new Carro();
        //When (Quando)
        // Then (Então)
        System.out.println("Teste 1");
        Assert.assertTrue(carro.getLigado() == false);
    }

    @Test
    public void deveIniciarComVelocidade0(){
        // Teste #2 - Deve iniciar com velocidade Zero
        // Given ( Dado)
        Carro carro = new Carro();
        // When (Quando)
        // Then ( Então)
        System.out.println("Teste 2");
        Assert.assertTrue(carro.getVelocidadeAtual() == 0);
    }
    @Test
    public void deveLigarCorretamente(){
        // Teste #3 - Deve ligar corretamente
        // Given (Dado)
        Carro carro = new Carro();
        // When (Quando)
        carro.ligar();
        // Then (Então)
        System.out.println("Teste 3");
        Assert.assertTrue(carro.getLigado() == true);
    }

    @Test
    public void deveDesligarCorretamente(){
        // Teste #4 - Deve desligar corretamente um carro ligado
        //Given (Dado)
        Carro carro = new Carro();
        //When (Quando)
        carro.setLigado(true);
        carro.setLigado(false);
        //Then (Então)
        System.out.println("Teste 4");
        Assert.assertTrue(carro.getLigado() == false);
    }

    @Test
    public void deveAcelerarLigado(){
        // Teste #5 - Deve acelerar um carro ligado
        //Given (Dado)
        Carro carro = new Carro();
        // When
        carro.ligar();
        carro.setVelocidadeAtual(10);
        // Then
        System.out.println("Teste 5");
        Assert.assertTrue(carro.getVelocidadeAtual() == 10);
    }

    @Test
    public void naoDeveUltrapassarVelocidadeMaxima(){
        // Teste #6 Nao deve ultrapassar a velocidade maxima
        // Given (Dado)
        Carro carro = new Carro();
        //When (Quando)
        carro.ligar();
        carro.acelerar(100);
        carro.acelerar(200);
        //Then (Então)
        System.out.println("Teste 6");
        Assert.assertTrue(carro.getVelocidadeAtual() <= carro.getVelocidadeMaxima());
    }

    @Test
    public void deveDesacelerarAposVelocidadeMaxima(){
        // Teste #7 Deve desacelerar sua velocidade após atingir a velocidade máxima
        //Given (Dado)
        Carro carro = new Carro();
        //When (Quando)
        carro.ligar();
        carro.acelerar(100);
        carro.acelerar(300);
        carro.frear(100);
        //Then (Então)
        System.out.println("Teste 7");
        Assert.assertTrue(carro.getVelocidadeAtual() == 100);
    }
}
