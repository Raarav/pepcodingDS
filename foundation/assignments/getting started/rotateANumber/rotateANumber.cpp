#include<iostream>

using namespace std;

void rotateANumberfunc(int n,int r)
{
    int length=0;
    int n1=n;
    while(n1>0)
    {
        n1/=10;
        length++;
    }
    r=r%length;
    if(r<0)
    {
        r=r+length;
    }
    int r1=r;
    int post=0;
    int pow=1;
    while(r>0)
    {
        int rem=n%10;
        n=n/10;
        post=rem*pow + post;
        pow*=10;
        r--;
    }
    length-=r1;
    while(length>0)
    {
        post*=10;
        length--;
    }
    post=post+n;
    cout<<post;
}

int main()
{
    int n,r;
    cin>>n>>r;
    rotateANumberfunc(n,r);
} 