#include<iostream>
#include<vector>

using namespace std;

void findmaximumArrayIndexfunc(vector<int> &arr)
{
    int left=0;
    int right=arr.size()-1;
    while(left<=right)
    {
        int mid=(left+right)/2;
        if()
        {
            
        }
        else if(arr[left]<arr[mid])
        {
            left=mid+1;
        }
        else
        {
            right=mid-1;          
        }
        
    }
}

int main()
{
    vector<int> arr({9,10,11,12,13,14,15,16,17,1,2,3,5,8});
    findmaximumArrayIndexfunc(arr);
}