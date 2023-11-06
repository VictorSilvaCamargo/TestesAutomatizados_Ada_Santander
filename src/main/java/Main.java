public class Main {
    public static void main(String[] args) {

        //Grupo : Matheus Vitor, Pedro Neres, Victor S. Camargo

        // Teste #1 - Deve iniciar desligado
        // Given (Dado)
        Carro carro1 = new Carro();
        //When (Quando)
        // Then (Então)
        System.out.println("Teste 1");
        System.out.println(carro1.getLigado() == false);



        // Teste #2 - Deve iniciar com velocidade Zero
        // Given ( Dado)
        Carro carro2 = new Carro();
        // When (Quando)
        // Then ( Então)
        System.out.println("Teste 2");
        System.out.println(carro2.getVelocidadeAtual() == 0);


        // Teste #3 - Deve ligar corretamente
        // Given (Dado)
        Carro carro3 = new Carro();
        // When (Quando)
        carro3.ligar();
        // Then (Então)
        System.out.println("Teste 3");
        System.out.println(carro3.getLigado() == true);


        // Teste #4 - Deve desligar corretamente um carro ligado
        //Given (Dado)
        Carro carro4 = new Carro();
        //When (Quando)
        carro4.setLigado(true);
        carro4.setLigado(false);
        //Then (Então)
        System.out.println("Teste 4");
        System.out.println(carro4.getLigado() == false);


        // Teste #5 - Deve acelerar um carro ligado
        //Given (Dado)
        Carro carro5 = new Carro();
        // When
        carro5.ligar();
        carro5.setVelocidadeAtual(10);
        // Then
        System.out.println("Teste 5");
        System.out.println(carro5.getVelocidadeAtual() == 10);


        // Teste #6 Nao deve ultrapassar a velocidade maxima
        // Given (Dado)
        Carro carro6 = new Carro();
        //When (Quando)
        carro6.ligar();
        carro6.acelerar(100);
        carro6.acelerar(200);
        //Then (Então)
        System.out.println("Teste 6");
        System.out.println(carro6.getVelocidadeAtual() <= carro6.getVelocidadeMaxima());


        // Teste #7 Deve desacelerar sua velocidade após atingir a velocidade máxima
        //Given (Dado)
        Carro carro7 = new Carro();
        //When (Quando)
        carro7.ligar();
        carro7.acelerar(100);
        carro7.acelerar(300);
        carro7.frear(100);
        //Then (Então)
        System.out.println("Teste 7");
        System.out.println(carro7.getVelocidadeAtual() == 100);


    }
}
