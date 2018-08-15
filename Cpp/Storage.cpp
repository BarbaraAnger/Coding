#include <iostream>
using namespace std;

int main(){
    int storage[9], x;
    for (x=0;x<10;x++){
        storage[x] += 1;
        if(x==0) {
            cout<< "Primeiro valor: " << x << endl;
        } else if(x>0) {
            cout << x+1 << "º valor: " << storage[x] << endl;
        }
        
    }
    
    return 0;
}