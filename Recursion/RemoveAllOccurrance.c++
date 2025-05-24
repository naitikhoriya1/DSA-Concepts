#include <iostream>
using namespace std;

void removeOccur(string &s, string &part)
{

    int found = s.find(part);
    if (found != string::npos)
    {
        string left = s.substr(0, found);
        string right = s.substr(found + part.size(), s.size());
        s = left + right;

        removeOccur(s, part);
    }
    else
    {
        return;
    }
}

int main()
{
    string s = "aaabcbaabcbc";
    string part = "abc";

    cout << "Before - " << s << endl;
    removeOccur(s, part);

    cout << "After - " << s << endl;
    return 0;
}