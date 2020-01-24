#include<iostream>
using namespace std;

///second method
int main()
{
    int n;
    cin>>n;
    int nspace=n;
    int nstar=1;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<nspace;j++)
        {
            cout<<"\t";
        }
        for(int j=1;j<=nstar;j++)
        {
            cout<<"*\t";
        }
        cout<<endl;
        nspace--;
        nstar++;
    }
}


/////first method
/*
int main()
{
    int n;
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(j<=(n-i))
            {
                cout<<" ";
                continue;
            }
            cout<<"*";
        }
        cout<<endl;
    }
}
*/
