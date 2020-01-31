///pascal triangle

#include<iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;
    
    for(int i=0;i<n;i++)
    {
        int nC0=1; 
        cout<<nC0<<"\t";      
        for(int j=0;j<i;j++)
        {
            nC0=nC0*(i-j)/(j+1);
            cout<<nC0<<"\t";                                  
        }
        cout<<endl;
    }
}