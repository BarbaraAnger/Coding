#include <stdio.h>
#include <math.h>


void octave(int x) { // octal para decimal

}
void binary(int x) { // bin�rio para decimal
    int original, basis=1, r, dec;
    printf("Digite o n�mero bin�rio que ser� convertido:\n");
    scanf("%d", &x);

    original = x;
    while (x > 0) {
        r = original % 10;
        dec = x + r * basis;
        x = x/10;
        basis = basis * 2;
    }
    printf("O n�mero %d em decimal fica %d", original, dec);
}
