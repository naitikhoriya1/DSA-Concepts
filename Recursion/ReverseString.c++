#include <iostream>
using namespace std;

void reverse(string &str, int i, int j)
{
    if (i >= j)
    {
        return;
    }
    if (i < j)
    {
        swap(str[i], str[j]);
    }
    reverse(str, i + 1, j - 1);
}

int main()
{

    string str = "abcdef";
    int i = 0;
    int j = str.size() - 1;

    reverse(str, i, j);

    cout << "Reversed String is : " << str << endl;

    return 0;
}