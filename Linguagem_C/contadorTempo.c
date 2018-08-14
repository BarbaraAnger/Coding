/* 
* Autora: Bárbara Anger
* Ano: 2018
* All rights reserved
*/

#include <stdio.h>
void main () {
int hours, min, secs; //declares the variables
printf("Type hours, minutes and seconds to be calculated:\n");
scanf("%d %d %d", &hours, &min, &secs);

hours = hours * 60; // turns hours into secs
min = min * 60; // turns minutes into secs
secs += min + hours;

printf("It's been %d seconds.\n", secs);

}
