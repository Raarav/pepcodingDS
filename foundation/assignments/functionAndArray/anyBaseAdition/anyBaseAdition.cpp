#include<iostream>

using namespace std;

int anyBaseAddition(int base,int num1,int num2)
{
    int res = 0;
    int carry = 0;
    int pow=1;
    while(num1>0 || num2>0 || carry>0)
    {
        int rem1 = num1%10;
        int rem2 = num2%10;
        num1 = num1/10;
        num2 = num2/10;

        int rem = rem1+rem2+carry;
        carry = rem/base;
        rem = rem%base;
        res += rem*pow;
        pow = pow*10;
    }
    return  res;
}

int main()
{
    int base;
    int num1;
    int num2;
    cin>>base>>num1>>num2;
    cout<<anyBaseAddition(base,num1,num2);    
}