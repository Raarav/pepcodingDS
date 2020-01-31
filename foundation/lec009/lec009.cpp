#include<iostream>
#include<vector>

using namespace std;
int subsq(vector<int> &vec,int pow)
{
    for(int i=0;i<pow;i++)
    {
        int cc=i;
        int length=0;
        cout<<"[";
        while(cc>0)
        {
            int rem = cc%2;
            cc = cc/2;
            if(rem==1)
            {
                cout<<vec[length]<<" ";
            }                        
        }
        length++;
        cout<<"]"<<endl;
    }
    return 0;
}

int main()
{
    int size;
    cin>>size;
    vector<int> vec(size,0);
    int pow=1;
    for(int i=0;i<vec.size();i++)
    {
        cin>>vec[i];
        pow*=2;
    }
    subsq(vec,pow);
}