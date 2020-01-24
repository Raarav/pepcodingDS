#include<iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int a=0;
    int b=1;
    int c=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            cout<<a<<"\t";
            c=a+b;
            a=b;
            b=c;
        }
        cout<<endl;
    }
}