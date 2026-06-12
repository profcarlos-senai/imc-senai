/**
 * Calcula o IMC (índice de massa corporal)
 * o IMC é uma medida estatística de peso/m2 e serve
 * para identificar se a pessoa potencialmente está
 * com peso normal, muito baixo ou muito alto
 * O IMC nunca deve ser usado como única medida
 * de peso saudável. Procure um médico.
 */
public class CalcIMC {
    private double peso;
    private double altura;

    public CalcIMC(double p, double a) {
        peso = p;
        altura = a;
    }

    public CalcIMC(int p, double a) {
        peso = p;
        altura = a;
    }

    public CalcIMC() {
        // não precisa fazer nada
    }

    public double getIMC(){
        return peso/(altura*altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura <= 0){ // se altura for inválida causa um erro
            throw new IllegalArgumentException("Altura deve ser um positivo");
        }
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso <= 0){ // se peso for inválido causa um erro
            throw new IllegalArgumentException("Peso deve ser um positivo");
        }
        this.peso = peso;
    }

    @Override
    public String toString() {
        return String.format("Peso = %.1fkg, altura = %.2fm, IMC=%.1f\n",
                getPeso(), // em vez de imc.peso
                getAltura(), // em vez de imc.altura
                getIMC() );
    }
}
