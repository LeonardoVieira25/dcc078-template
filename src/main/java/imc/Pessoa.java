package imc;

public class Pessoa {

    public Pessoa(
            String sexo,
            double peso,
            double altura) {
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo == null || sexo.isEmpty()) {
            throw new IllegalArgumentException("Sexo não pode ser vazio.");
        }
        if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
            throw new IllegalArgumentException("Sexo deve ser 'M' ou 'F'.");
        }
        this.sexo = sexo;
    }

    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        this.altura = altura;
    }

    public String calcularImc() {
        double imc = peso / (altura * altura);
        if (sexo == "M") {
            if (imc < 20.7)
                return "abaixo do peso";
            if (imc < 26.4)
                return "no peso normal";
            if (imc < 27.8)
                return "marginalmente acima do peso";
            if (imc < 31.1)
                return "acima do peso ideal";
            return "obeso";
        } else {
            if (imc < 19.1)
                return "abaixo do peso";
            if (imc < 25.8)
                return "no peso normal";
            if (imc < 27.3)
                return "marginalmente acima do peso";
            if (imc < 32.3)
                return "acima do peso ideal";
            return "obeso";

        }
    }

}
