#include<iostream>
#include<vector>

using namespace std;

void sumOf2ArrayFunc(vector<int> &arr1,vector<int> &arr2)
{
    
}

int main()
{
    int size1;
    cin>>size1;
    vector<int> arr1(size1,0);
    for(int i=0;i<arr1.size();i++)
    {
        cin>>arr1[i];
    }
    int size2;
    cin>>size2;
    vector<int> arr2(size2,0);
    for(int i=0;i<arr2.size();i++)
    {
        cin>>arr2[i];
    }
    sumOf2ArrayFunc(arr1,arr2);
}