package com.github.hfoganholi.quicksort;

public class OrdenaQuickSort {
	public OrdenaQuickSort() {
		super();
	}
	public int[] quickSort(int[] vetor, int inicio, int fim) {
		if (fim > inicio) {
			int posicaoPivoFixo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivoFixo - 1);
			quickSort(vetor, posicaoPivoFixo + 1, fim);
		}
		return vetor;
	}
	private int dividir(int[] vetor, int inicio, int fim) {
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = fim;
		int pivo = vetor[inicio];
		while (ponteiroDireita > ponteiroEsquerda) {
			while (ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			while (ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo) {
				ponteiroDireita--;
			}
			if (ponteiroEsquerda < ponteiroDireita) {
				trocar(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--; 
			}
		}
		trocar(vetor, inicio, ponteiroDireita);
		return ponteiroDireita;
	}
	private void trocar(int[] vetor, int i, int j) {
		int auxiliar = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = auxiliar;
	}
}
