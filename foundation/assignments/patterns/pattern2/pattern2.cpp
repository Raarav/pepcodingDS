#include<iostream>
using namespace std;

///Second method

int main()
{
    int n;
    cin>>n;
    int nstar = n;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<nstar;j++)
        {
            cout<<"*\t";
        }
        nstar--;
        cout<<endl;
    }
}


///first method
/*
int main()
{
    int n;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i;j++)
        {
            cout<<"* ";
        }
        cout<<endl;
    }
}
*/