/*
@author Barbara Anger
2018. Copyright. All Rights reserved.
*/
#include <stdio.h>
int main(){
int a, b, c;
printf("Digite os pontos do triagulo:\n");
scanf("%d %d %d",&a, &b, &c);
if(a+b>=c && a+c>=b && c+b>=a) {
	if(a==b && b==c){
	printf("Triangulo Equilátero.\n");
	} else if(a==b || a==c || b==c){
	printf("Triangulo Isósceles.\n");
	} else if(a!=b && b!=c && a!=c){
	printf("Triangulo escaleno\n");
	} else {
	printf("Triangulo Retangulo ou obtuso.\n");
	}
} else {
printf("Não pode existir retangulo.\n");
}
return 0;
}