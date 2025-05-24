#include <iostream>
using namespace std;

void addString(string &num1, int p1, string &num2, int p2, int carry, string &ans)
{
    // base case
    if (p1 < 0 && p2 < 0)
    {
        if (carry != 0)
        {
            ans.push_back(carry + '0');
        }
        return;
    }

    // Current digit values or '0'
    int n1 = (p1 >= 0 ? num1[p1] : '0') - '0';
    int n2 = (p2 >= 0 ? num2[p2] : '0') - '0';

    int csum = n1 + n2 + carry;
    int digit = csum % 10;
    carry = csum / 10;

    // Recursive result
    addString(num1, p1 - 1, num2, p2 - 1, carry, ans);
    ans.push_back(digit + '0');
}

int main()
{
    string num1 = "123";
    string num2 = "27";
    int p1 = num1.size() - 1;
    int p2 = num2.size() - 1;
    string ans = "";

    addString(num1, p1, num2, p2, 0, ans);

    cout << "Addition Of Two Strings Is: " << ans << endl;
    return 0;
}