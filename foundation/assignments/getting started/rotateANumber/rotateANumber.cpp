#include<iostream>

using namespace std;

void rotateANumber(int n,int r)
{
    int rem = n%10;
    n=n/10;
    
}

int main()
{
    int n,r;
    cin>>n>>r;
    rotateANumber(n,r);
} 