#include <iostream>
using namespace std;

int BinarySearch(int arr[], int key, int s, int e)
{

  if (s > e)
  {
    return -1;
  }

  int mid = s + (e - s) / 2;

  if (arr[mid] == key)
  {
    return mid;
  }
  if (arr[mid] > key)
  {
    return BinarySearch(arr, key, s, mid - 1);
  }
  else
  {
    return BinarySearch(arr, key, mid + 1, e);
  }
}

int main()
{

  int arr[] = {10, 20, 30, 40, 50, 60, 70, 80};
  int key = 100;
  int size = 8;
  int s = 0;
  int e = size - 1;

  int find = BinarySearch(arr, key, s, e);
  if (find == -1)
  {
    cout << "Key Not Found " << find << endl;
  }
  else
  {
    cout << "Key Founded at " << find << endl;
  }

  return 0;
}