#include <iostream>
int main() {
    int storage[];
    for (x=0;x<10;x++){
        storage[x] = ++;
        if(x==0) {
            cout<< "Primeiro valor:" << x << endl;
        } else {
            cout << x << "º valor" << endl;
            cout << storage[x] <<endl;
        }
        
    }
    return 0;
}