#include<iostream>
#include<vector>

using namespace std;

void sumOf2ArrayFunc(vector<int> &arr1,vector<int> &arr2)
{
    vector<int> sum(arr2.size(),0); 
    int i=arr1.size()-1;
    int j=arr2.size()-1;
    int k=sum.size()-1;
    int c=0;
    while (k>=0)
    {
        int d=0;
        if(i>=0)
        {
            if(arr1[i]>=arr2[j])
            {
                d=(arr1[i] + 10)-arr2[j];
                arr1[i+1]-=1;                        
            }
            else
            {
                d=arr1[i]-arr2[j];                                              
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
    sumOf2ArrayFunc(arr1,arr2);
}