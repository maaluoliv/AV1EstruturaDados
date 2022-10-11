public class Questao1 {


    public static void main(String[] args) {

        int valor = 0, j = 0, aux = 0;
        int vetor[] = {3, 8, 7, 9, 10, 11, 80, 2, 1, 50};

        for (int i = 0; i <= vetor.length; i++) {
            valor = vetor[i];

            while ((j >= 0) && (valor < vetor[j])) {
              //  if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j + 1];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    j = j-1;
                    if(j==-1){
                    break;
                }
            }

        }
        for(Integer t:vetor)
            System.out.printf("%d \t",t);

    }
}
















