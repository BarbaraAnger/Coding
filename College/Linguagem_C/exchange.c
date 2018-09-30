/****************************
Copyright © 2018 Barbara Anger. All rights reserved.
e-mail: barbaraanger@hotmail.com
****************************/

#include <stdio.h>
int main(){
    int x, y;
    printf("Typ two values:\n");
    scanf("%d", &x);
    scanf("%d", &y);
    x = x + y;
    y = x - y;
    x = x - y;
    printf("The variables are now \n\tx = %d e y = %d\n", x, y);
    return 0;
}
