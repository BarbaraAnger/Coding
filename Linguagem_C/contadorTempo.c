/* 
* Autora: Bárbara Anger
* Ano: 2018
* All rights reserved
*/

#include <stdio.h>
#define T 86.400
void main () {
int day, hours, min, secs; //declares the variables
printf("Type hours, minutes and seconds to be calculated:\n");
scanf("%d %d %d", &hours, &min, &secs);

hours = hours * 60; // turns hours into secs
min = min * 60; // turns minutes into secs
secs += min + hours;

day = T - secs; // calculates what's left of the day

printf("\tIt's been %d seconds.\n", secs);
printf("\t%d is left of the day.\n", day);
}
