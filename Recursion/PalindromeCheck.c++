#include <iostream>
using namespace std;

bool solve(string &str, int i, int j)
{
    if (i >= j)
    {
        return true;
    }
    if (str[i] != str[j])
    {
        return false;
    }
    return solve(str, i + 1, j - 1);
}

int main()
{
    string str = "racbecar";
    int i = 0;
    int j = str.size();

    bool output = solve(str, i, j);
    if (output)
    {
        cout << "Palindrome" << endl;
    }
    else
    {
        cout << "Not A Palindrome" << endl;
    }
}