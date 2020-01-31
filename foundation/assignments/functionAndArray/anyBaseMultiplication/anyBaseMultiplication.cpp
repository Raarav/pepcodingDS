#include<iostream>

using namespace std;

 int anyBaseAditionfunc(int base,int num1,int num2)
    {
        int res=0;
        int carry=0;
        int pow=1;
        while(num1>0 || num2>0 || carry>0)
        {
            int rem1 = num1%10;
            int rem2 = num2%10;
            num1 = num1/10;
            num2 = num2/10;
            int rem = rem1 + rem2 + carry;
            carry = rem/base;
            int ans = rem%base;
            res += ans*pow;
            pow = pow*10;
        }
        return res;
    }



int singleDigitProduct(int base,int num1,int rem2)
{
    int ans = 0;
    int p=1;
    int carry=0;
    while(num1>0 || carry>0)
    {
        int rem1 = num1%10;
        num1 = num1/10;
        int mul=(rem1*rem2)+carry;
        carry=mul/base;
        mul%=base;

        ans+=mul*p;
        p*=10;      
         
    }

    return ans;
}


int anyBaseMultiplicationfunc(int base,int num1,int num2)
{
    int realans=0;
    int p=1;
    while(num2>0)
    {
        int rem2 = num2%10;
        num2 = num2/10;
        int sdpVariable = singleDigitProduct(base, num1, rem2);
        cout<<sdpVariable<<endl;
        realans=anyBaseAditionfunc(base,realans,sdpVariable*p);
        p*=10;
    }
    return realans;
}

int main()
{
    int base=0,num1=0,num2=0;
    cin>>base>>num1>>num2;
    cout<<anyBaseMultiplicationfunc(base,num1,num2);
}