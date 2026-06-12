public class Main {
    public static void main(String[] args) {

        // cria usando o construtor vazio
        CalcIMC imc = new CalcIMC();
        imc.setPeso(50); // em vez de imc.peso = 50
        imc.setAltura(1.50); // em vez de imc.altura = 0;
        System.out.println(imc); // vai imprimir imc.toString()

        // cria usando o construtor com parâmetros
        // agora não precisa dar setPeso e setAltura
        CalcIMC imgMagrelo = new CalcIMC(70.0, 2.0);
        System.out.printf("Peso = %.1fkg, altura = %.2fm, IMC=%.1f\n",
                imgMagrelo.getPeso(), // em vez de imc.peso
                imgMagrelo.getAltura(), // em vez de imc.altura
                imgMagrelo.getIMC());

    }
}
