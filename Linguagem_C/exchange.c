/*
* Author: Barbara Anger
* Year: 2018
* Algorithm to exchange variables without declaring a third one
*** Copyright. All rights reserved ***
*/

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
