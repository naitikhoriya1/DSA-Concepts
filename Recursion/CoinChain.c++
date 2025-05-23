#include <iostream>
using namespace std;

int coinChange(vector<int> coin, int amount)
{
    if (amount == 0)
    {
        return 0;
    }
    if (amount < 0)
    {
        return INT_MAX;
    }

    int mini = INT_MAX;
    for (int i = 0; i < coin.size(); i++)
    {
        int ans = coinChange(coin, amount - coin[i]);
        if (ans != INT_MAX)
        {
            mini = min(mini, ans + 1);
        }
    }
    return mini;
}

int main()
{
    vector<int> coin{1, 2, 3};
    int amount = 5;

    int ans = coinChange(coin, amount);
    cout << "minimum Coins needed are: " << ans << endl;

    return 0;
}