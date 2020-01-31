#include<iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int nstar=0;
    int nspace=n/2;
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<nspace;j++)
        {
            cout<<"\t";                        
        }
        for(int j=0;j<=nstar;j++)
        {
            if(j>0&&j<nstar)
            {
                cout<<"\t";
            }
            else
            {
                cout<<"*\t";                        
            }
            
        }
        if(i<n/2)
        {
            nstar+=2;
            nspace--;
        }
        else
        {
            nstar-=2;
            nspace++;
        }
        cout<<endl;    

    }
}