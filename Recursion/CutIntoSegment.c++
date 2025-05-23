#include <iostream>
#include <climits>

using namespace std;

int solve(int n, int x, int y, int z)
{
    if (n == 0)
    {
        return 0;
    }
    if (n < 0)
    {
        return INT_MIN;
    }

    int ans1 = solve(n - x, x, y, z);
    int ans2 = solve(n - y, x, y, z);
    int ans3 = solve(n - z, x, y, z);

    int ans = max(ans1, max(ans2, ans3));
    if (ans != INT_MIN)
    {
        return ans + 1;
    }
    return INT_MIN;
}

int main()
{
    int n = 7;
    int x = 5;
    int y = 2;
    int z = 2;

    int ans = solve(n, x, y, z);
    if (ans < 0)
    {
        cout << "Not possible" << endl;
    } 
    else
    {
        cout << "Maximum number of segments: " << ans << endl;
    }

    return 0;
}