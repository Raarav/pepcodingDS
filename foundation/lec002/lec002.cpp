#include<iostream>
using namespace std;
int main(){

////prime or not prime


 /* int no=0;

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
    */

//////////print whole prime no.s till enter


    /*int no=0;

    cin>>no;
    
    for(int i=2;i<no;i++)
    {
        bool b = true;
        for(int j=2;j*j<=i;j++)
        {
            if(i%j==0)

            {
                b=false;
                break;
            }
            
        }
    if(b)
    {
        cout<<i<<" ";
    }
    }*/

    ////reverse string

    

    ///
    ///

    
    int val,r,rem;
    cin>>val;
    cin>>r;
    int val1=val;
    int ten=1;
    
    for(int j=0;j<r;j++)
    {       
        
        if(r>0){
            ten=ten*10;
            val=val/10;
        }
        

    }
    rem=val1%ten;
    
    cout<<rem<<val;        

    return 0;
}

