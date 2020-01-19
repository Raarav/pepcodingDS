#include<iostream>
using namespace std;
int main(){
    //cout<<"Hello";
    /*int a,b,res,res1,res2,res3;
    cout<<"enter 1st no.";
    cin>>a;
    cout<<"enter 2st no.";
    cin>>b;
    cout<<a+b<<endl;
    cout<<a*b<<endl;
    cout<<a/b<<endl;
    cout<<a/b<<endl;*/


////prime or not prime


    int no=0;

    cin>>no;
    bool b=true;
    
    for(int i=2;i*i<no;i++)
    {
    if(no%(i)==0){
        b=false;
        break;
    }
    }
    if(b)
    {
        cout<<"prime";
    }
    else
    {
        cout<<"not prime";
    }


    return 0;
}
