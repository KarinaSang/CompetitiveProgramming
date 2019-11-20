#include <bits/stdc++.h>

using namespace std;


void rotateMatrix(vector<vector<int>> &mat, int N){
    for(int x = 0; x < N/2; ++x){
        for(int y = x; y < N-x-1; ++y){
            int temp = mat[x][y];
            mat[x][y] = mat[y][N-x-1];
            mat[y][N-x-1] = mat[N-x-1][N-y-1];
            mat[N-x-1][N-y-1] = mat[N-y-1][x];
            mat[N-y-1][x] = temp;
        }
    }
}

bool check(vector<vector<int>> &mat, int N){
    for(int x = 0; x < N; ++x){
        for(int y = 1; y < N; ++y){
            if(mat[y][x] < mat[y-1][x] || mat[x][y] < mat[x][y-1]){
                return false;
            }
        }
    }
    return true;
}

void print(vector<vector<int>> &mat, int N){
    for(int i = 0; i < N; ++i){
        cout << mat[i][0];
        for(int j = 1; j < N; ++j){
            cout << " " << mat[i][j];
        }
        cout << endl;
    }
}

int main(){
    int n;
    cin >> n;
    vector<vector<int>> arr;
    arr.resize(n);
    for(int i = 0; i < n; ++i){
        arr[i].resize(n);
    }
    for(int i = 0; i < n; ++i){
        for(int j = 0; j < n; ++j){
            cin >> arr[i][j];
        }
    }

    for(int i = 0; i < 4; ++i){
        if(check(arr, n)){
            break;
        }
        rotateMatrix(arr, n);
    }

    print(arr, n);

}
