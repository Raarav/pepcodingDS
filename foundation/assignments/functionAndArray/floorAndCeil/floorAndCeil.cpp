#include<iostream>
#include<vector>

using namespace std;

void floorAndCeilFunc(vector<int> &vec,int data)
{
    int left=0;
    int right=vec.size()-1;
    int floor=-1;
    int ceil=-1;
    while(left<=right)
    {
        int mid=(left+right)/2;
        if(vec[mid]==data)
        {
            floor=vec[mid];
            ceil=vec[mid];
            break;
        }
        else if(data>vec[mid])
        {
            floor=vec[mid];
            left=mid+1;
        }
        else
        {
            ceil=vec[mid];
            right=mid-1;
        }
        
    }
    cout<<ceil<<endl;
    cout<<floor;
}

int main()
{
    int n;
    cin>>n;
    vector<int> vec(n,0);
    for(int i=0;i<vec.size();i++)
    {
        cin>>vec[i];
    }
    int data;
    cin>>data;
    floorAndCeilFunc(vec,data);
}