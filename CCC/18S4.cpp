#include <bits/stdc++.h>

using namespace std;

long long memo [1000001];

long long func (int n){
    if(memo[n]) return memo[n];
    
    long long sum = n - n/2;
    int branch = 2;
    for(int i = n/2; i >= 2; --i){
        if(n/i < sqrt(n)){
            int counter = n/branch-n/(branch+1);
            sum += counter * func(n/i);
            i -= counter-1;
            ++branch;
        }
        else{
            sum += func(n/i);
        }
    }
    
    return memo[n] = sum;
}
int main() {
    int size;
    cin >> size;
    memo[1] = memo[2] = 1;
    cout << func(size) << endl;
}
