#include<iostream>
#include<vector>

using namespace std;

void differenceOf2Array(vector<int> &arr1,vector<int> &arr2)
{
    vector<int> sum(arr2.size(),0); 
    int i=arr1.size()-1;
    int j=arr2.size()-1;
    int k=sum.size()-1;
    while (k>=0)
    {
        int d=0;
        if(i>=0)
        {
            if(arr2[j]<arr1[i])
            {
                d=(arr2[j] + 10)-arr1[i];
                arr2[j-1]-=1;                                    
            }
            else
            {
                d=arr2[j]-arr1[i];                                              
            }     
         }
        else
        {
            d=arr2[j];
        }
        
        sum[k]=d;
        i--;
        j--;
        k--;
    }
    for(int w:sum)
    {
        cout<<w<<endl;
    }
     
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
    differenceOf2Array(arr1,arr2);
}