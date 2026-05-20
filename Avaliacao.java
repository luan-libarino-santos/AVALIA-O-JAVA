
/* Se você está vendo esta mensagem é porque fez tudo certo até aqui. 
    Boa prova! */

void main() {
    double consumo = 0;
    int dias = 1;
    boolean continuar = true;
    double aux;
    double media;

    while (continuar) {
        aux = Float.parseFloat(IO.readln(("Digite a agua consumida (em Litros) no dia "+dias + ": ")));
        consumo += aux;
        if (aux == 0) {
            continuar = false;
            IO.println("Finalizando contagem...");
            if (consumo == 0) {
                IO.println("Nenhum consumo registrado!");
            }
            else {
                media = consumo / (dias-1);

                if (media < 100) {
                    System.out.printf("Média de %.2f litros por dia: Consumo Sustentável!", media);
                }
                if (media >= 100 & media<= 175) {
                    System.out.printf("Média de %.2f litros por dia: Consumo Moderado!", media);
                }
                if (media > 175) {
                    System.out.printf("Média de %.2f litros por dia: Consumo Excessivo!", media);
                }
            }
    }
        dias +=1;
}
}