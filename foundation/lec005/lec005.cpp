#include<iostream>
#include<vector>

using namespace std;

void input(vector<int> &vec)
{
    for(int i=0;i<vec.size();i++)
    {
        cin>>vec[i];
    }
}
void display(vector<int> vec)
{
    for(int i=0;i<vec.size();i++)
    {
        cout<<vec[i]<<" ";        
    } 
}

int main()
{
    int size;
    cin>>size;
    vector<int> vec(size,0);  //vector
    input(vec);
    display(vec);       
}
