/*
* Author: Barbara Anger
* Year: 2018
* Algorithm to exchange variables without declaring a third one
*** Copyright. All rights reserved ***
*/

#include <stdio.h>
int main(){
    int x, y;
    x = x + y;
    y = x - y;
    x = x - y;
    printf("As variaveis agora são x = %d e y = %d", x, y);
    return 0;
}