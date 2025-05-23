#include <iostream>
using namespace std;

void solve(vector<int> &arr, int sum, int &maxx, int i)
{
    if (i >= arr.size())
    {
        maxx = max(maxx, sum);
        return;
    }

    // include
    solve(arr, sum + arr[i], maxx, i + 2);

    // exclude
    solve(arr, sum, maxx, i + 1);
}

int main()
{
    vector<int> arr{1,2,3,5,4};
    int sum = 0;
    int maxx = INT_MIN;
    int i = 0;

    solve(arr, sum, maxx, i);
    cout << maxx << endl;
    return 0;
}