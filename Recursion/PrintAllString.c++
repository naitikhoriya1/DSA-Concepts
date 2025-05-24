#include <iostream>
using namespace std;

void solve(vector<int> &ans, int i, int j)
{
    // base case
    if (i >= ans.size())
    {
        return;
    }

    if (j >= ans.size())
    {
        solve(ans, i + 1, i + 1);
        return;
    }

    for (int k = i; k <= j; k++)
    {
        cout << ans[k] << " ";
    }
    cout << endl;

    solve(ans, i, j + 1);
}
int main()
{

    vector<int> ans{1, 2, 3, 4, 5};
    int i = 0;
    int j = i;

    solve(ans, i, j);

    return 0;
}