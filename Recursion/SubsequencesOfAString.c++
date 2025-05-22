#include <iostream>
using namespace std;

void subSequences(string str , string out , int i ){
  // Base condition 
  if(i>=str.length()){
    cout<<out<<endl;
    return;
  }

  // include 
  subSequences(str , out , i+1);

  // exclude
  out = out + str[i];
    subSequences(str , out , i+1);

}

int main() { 
  string str = "abc";
  string out = "";
  int i = 0;

  subSequences(str , out , i);
  return 0;
}