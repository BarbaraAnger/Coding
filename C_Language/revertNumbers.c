/*
@author Barbara Anger
2018. Copyright. All Rights reserved.
*/
#include <stdio.h>
int main() {
long int N;
int r=0, s=0;
printf("Digite um valor:\n");
scanf("%d", &N);
while(N>0) {
    r = N%10;
    s = (s * 10) + r;
    N = N/10;
}
    printf("revertido: %d\n", s);
return 0;
}
