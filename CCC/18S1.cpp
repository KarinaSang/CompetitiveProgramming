#include <bits/stdc++.h>

using namespace std;

int main() {
    int size;
	cin >> size;
	
	vector<double> arr;
	arr.resize(size);
	
	for(int i = 0; i < size; ++i){
		cin >> arr[i];
	}
	sort(arr.begin(), arr.end());
	double smallest = 3000000000.0;
	for (int i = 1; i < size - 1; ++i) {
		double cur = (arr[i] - arr[i - 1]) / 2 + (arr[i + 1] - arr[i]) / 2;
		if (cur < smallest){
			smallest = cur;
		}
	}

	cout << setprecision(1) << fixed << smallest << endl;
    return 0;
}
