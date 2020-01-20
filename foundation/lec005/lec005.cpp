/*
1.printing vector array element
2.printing maximum element in vector array
3.printing minimum element in vector array
4.searching value through LINEAR SEARCH
5.searching element in vector array through Bineary search
*/


#include<iostream>
#include<vector>

using namespace std;

/*

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

*/

//////////////printing maximum element in vector array

/*
void input(vector<int> &vec)       ////////without "&" in vec vector copy of another vector which name will "vec".
{
    for(int i=0;i<vec.size();i++)
    {
        cin>>vec[i];
    }
}
void input1(vector<int> &vec1)
{
    for(int i=0;i<vec1.size();i++)
    {
        cin>>vec1[i];
    }
}
void display(vector<int> vec)
{
    int i=1;
    int max = vec[0];
    while(i<vec.size())
    {
        if(max<vec[i])
        {
            max=vec[i];
        }        
        i++;
    }
    cout<<max<<endl;
}

void display1(vector<int> vec1)
{
    int max = vec1[0];
    for(int i=1;i<vec1.size();i++)
    {
        if(max<vec1[i])
        {
            max=vec1[i];
        }
    }
    cout<<max;
}

int main()
{
    int size;
    cin>>size;
    vector<int> vec(size,0);
    vector<int>  vec1(size,0);
    cout<<"Enter the value of first array:- ";
    input(vec);
    display(vec); 
    cout<<"Enter the value of second array:- ";
    input1(vec1);
    display1(vec1);
    return 0;     
}*/

/////finding min value
/*
int main()
{
    vector<int> vec({10,15,23,45,57,65,78,98});
    cout<<"array:- ";
    for(int i=0;i<vec.size();i++)
    {
        cout<<vec[i]<<" ";
    }
    cout<<endl;
    int min=vec[0];
    for(int j=1;j<vec.size();j++)
    {
        if(min>vec[j])
        {
            min=vec[j];
        }
    }
    cout<<"minimum value is:- "<<min;
}

*/
////searching value

/*
int main()
{
    vector<int> vec({10,15,23,45,57,65,78,98});
    cout<<"array value is:- "<<endl;
    for(int i=0;i<vec.size();i++)
    {
        cout<<vec[i]<<" ";
    }
    cout<<endl;

    int val;
    cin>>val;
    
    bool  b = false;
    for(int j=0;j<vec.size();j++)
    {
        if(val == vec[j])
        {
            cout<<"Found this " << val <<" value at "<<j;
            break;
        }
        else if(j==vec.size()-1)
        {
            b=true;
        }
    }
    if(b)
    {
        cout<<"Not Found";
    }
}
*/

/////searching element in vector array through Bineary search

void input(vector<int> &vec)
{
    for(int i=0;i<vec.size();i++)
    {
        cin>>vec[i];
    }    
}
int binearySearch(vector<int> vec)
{
    int mid=0;
    int left=0;
    int right=vec.size()-1;
    cout<<"Enter the value You want search:- ";
    int val;
    cin>>val;
    cout<<"posison of value:- ";
    while(left<=right)
    {
        mid=(left+right)/2;
        if(vec[mid]==val)
        {
            return mid;
        }
        else if(val<vec[mid])
        {
            right = mid-1;             
        }
        else
        {
            left = mid+1;
        }        
        
    }
    return -1;

}

int main()
{
    cout<<"Enter size of the array:- ";
    int size;
    cin>>size;
    vector<int> vec(size,0);
    cout<<"Enter array's values:- ";
    input(vec);
    cout<<binearySearch(vec);
}




