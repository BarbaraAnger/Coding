#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
// Trabalho feito por: Barbara Anger e Guilherme Guezzi
static int opposite(int x, int basis);
static int dectoBasis(int x, int basis);
int val(char b);

int main() {
    int num, b;
    printf("Digite o numero em decimal a ser convertido:\n");
    scanf("%d", &num);
    printf("Digite a base para qual deseja que seja convertido:\n");
    scanf("%d", &b);
    if(num == 0) printf("a resposta fica 0\n");
    else {
        num = dectoBasis(num, b);
        num = opposite(num, b);
    }
    return 0;
}
static int dectoBasis(int x, int basis) {
    int binary[8], org = x, t=0;
    int i = 0, arm = 0;
    if (x<0) {
        x = x * (-1);
        while(x>0) {
            while(i<7) {
            binary[i] = x % basis;
            x = x / basis;
            i++;
            }
        }
        printf("Numero (%d)10 fica na base %d:\n 1", org, basis);
        for (int j = i - 1; j>=0; j--) {
            printf("%d", binary[j]);
            arm = (arm*10) + binary[j];
        } printf("\n");
        } else {
        while(x>0) {
            while(i<8) {
            binary[i] = x % basis;
            x = x / basis;
            i++;
            }
        }
        printf("Numero (%d)10 fica na base %d:\n 1", org, basis);
        for (int j = i - 1; j>=0; j--) {
            printf("%d", binary[j]);
            arm = (arm*10) + binary[j];
        } printf("\n");
        }
        return arm;
    }
static int opposite(int x, int basis) { // base para decimal
     int num=0, aux=0, i = 0;
     int neg;
     long int org = x, aux2 = x;
     while(i<7) {
            if(aux2%10!=0) {
                neg = 1;
            } else {
                neg = 0;
            }
        i++;
     }
     if (!neg) {
        while(x != 0) {
            num = num + (x%10) * pow(2,aux);
            aux++;
            x = x/10;
        }
        num = num * -1;
     } else {
         while(x != 0) {
            num = num + (x%10) * pow(2,aux);
            aux++;
            x = x/10;
        }
        num = num * (1);
     }

    printf("O numero (%d)%d em decimal fica (%d)10\n", org, basis, num);
    return num;
}
