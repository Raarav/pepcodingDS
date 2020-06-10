#include<iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;
    bool b= true;
    for(int i=2;i*i<n;i++)
    {
        if(n%i==0)
        {
            b = false;
            break;
        }
    }
    if(b)
    {
        cout<<"Prime";
    }
    else
    {
        cout<<"not prime";
    }
    
}