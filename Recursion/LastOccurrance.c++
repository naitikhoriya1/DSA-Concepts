#include <iostream>
using namespace std;

void solve(string &str, char ch, int &foundAt, int i)
{

    if (i < 0)
        return;

    if (ch == str[i])
    {
        foundAt = i;
        return;
    }
    return solve(str, ch, foundAt, i - 1);
}

int main()
{

    string str = "abcddecfdg";
    char ch = 'c';
    int foundAt = -1;

    solve(str, ch, foundAt, str.size() - 1);

    if (foundAt)
    {
        cout << "Founded at Index : " << foundAt << endl;
    }
    else
    {
        cout << "Not found : " << foundAt << endl;
    }

    return 0;
}