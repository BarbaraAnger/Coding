/*
* Autora: Bárbara Anger
* Ano: 2018
* All rights reserved
*/

#include <stdio.h>
#define T 86400
#define H 3600
void main () {
int day, hours, min, secs; //declares the variables
printf("Type hours, minutes and seconds to be calculated:\n");
scanf("%d %d %d", &hours, &min, &secs);

hours *= H; // turns hours into secs
min *= 60; // turns minutes into secs
day = secs + min + hours; // sum of hours and minutes(in secs) and also 
seconds

printf("\tIt's been %d seconds.\n", day);
printf("\t%d is left of the day.\n", T-day);
}

