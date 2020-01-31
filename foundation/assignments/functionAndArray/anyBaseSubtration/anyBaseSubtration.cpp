#include<iostream>

using namespace std;

int anyBaseSubtraction(int base,int num1,int num2)
{
    int carry = 0;
    int pow=1;
    int res=0;
    while(num2>0)
    {
        int rem1 = num1%10;
        int rem2 = num2%10;
        num1 = num1/10;
        num2 = num2/10;

        int ans = 0;
        rem2 = rem2 + carry;

        if(rem2>=rem1)
        {
            carry=0;
            ans = rem2 - rem1;
        }
        else
        {
            carry = -1;
            ans = rem2 + base - rem1; 
        }
        res += ans*pow;
        pow = pow*10;
    }
    return res;
}


int main()
{
    int base=0;
    int num1=0;
    int num2=0;
    cin>>base>>num1>>num2;
    cout<<anyBaseSubtraction(base,num1,num2);
}