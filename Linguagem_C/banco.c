/*
@author Barbara Anger
2018. Copyright. All Rights reserved.
*/
#include <stdio.h>
int main() {
	int R;
	int r100, r50, r20, r10, r5; //declaração das variáveis
	
	printf("Digite o valor do saque:\n");
	scanf("%d", &R); //lê o valor que o usuário digita e armazena na variável

	r100 = R / 100; // conta quantas notas de 100 serão necessárias p/ operação
	R = R % 100; // vê quanto do valor restou

	r50 = R / 50;
	R = R % 50;

	r20 = R / 20;
	R = R % 20;
	
	r10 = R / 10;
	R = R % 10;

	r5 = R / 5;
	R = R % 5;

	R = R / 1;

	printf("\tR$100: %d notas\n", r100);
	printf("\tR$50: %d notas\n", r50);
	printf("\tR$20: %d notas\n", r20);
	printf("\tR$10: %d notas\n", r10);
	printf("\tR$5: %d notas\n", r5);
	printf("\tR$1: %d notas\n", R);
	return 0;
}
