/****************************
Copyright © 2018 Barbara Anger. All rights reserved.
e-mail: barbaraanger@hotmail.com
****************************/
#include <iostream>
using namespace std;

int main(){
    int storage[9], x;
    for (x=0;x<10;x++){
        storage[x] += 1;
        if(x==0) {
            cout<< "Primeiro valor: " << x << endl; //print of the first value
        } else if(x>0) {
            cout << x+1 << "º valor: " << storage[x] << endl; //print of the rest
        }
    }
    return 0;
}