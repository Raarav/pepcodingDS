// print decreasing
// print increasing 
// print decreasing-increaing
// print vector increasing-decreasing
//find first occurence through post order
//find last occurence in pre-order
//make array of occurence element in array
////subsequnce of string
///floodfill through return-type

#include<iostream>
#include<vector>
using namespace std;


// void re(vector<int>& vec,int i)
// {
//     if(i==vec.size())
//     {
//         cout<<endl;
//         return;
//     }
//     cout<<vec[i]<<" ";
//     re(vec,i+1);    
//     cout<<vec[i]<<" ";    
// }
// int main()
// {
//     int n=5;
//     vector<int> vec(n,0);
//     for(int i=0;i<n;i++)
//     {
//         cin>>vec[i];
//     }
//     re(vec,0);
// }


///first ouccrence  through post

// int find(vector<int> &vec,int x,int n)
// {
//     if(n==vec.size())
//     {
//         return -1;
//     }
//     int ans=0;
//     ans += find(vec,x,n+1);
//     if(vec[n]==x)
//     {
//         return n;
//     }
//     return ans;
// }

// int main()
// {
//     vector<int> vec({10,32,52,42,62,74,32,42,32,52});
//     int x = 52;
//     cout<<find(vec,x,0);    
// }


/////last occuurence in pre-order

/* static int ans=0;
void findLastocc(vector<int> &vec,int x,int i)
{     
    if(i==vec.size())
    {
        cout<<ans;
        return;
    }
    if(vec[i]==x)
    {
        ans=i;
    }
    findLastocc(vec,x,i+1);
}
int main()
{
    vector<int> vec({10,32,52,42,62,74,32,42,32,52});
    findLastocc(vec,32,0);
} */

//make array of occurence element in array
 
// vector<int> find(vector<int> &vec,int n,int x,int i,int j)
// {
//     if(n==vec.size())
//     {
//         vector<int> vec1(i,0);
//         return vec1;
//     }
//     if(vec[n]==x)
//     {
//         i++;
//     }
//     vector<int> vec2 = find(vec,n+1,x,i,j);  
//     if(vec[n]==x)
//     {
//         vec2[i-1]=n;
//     }  
//     return vec2;
// }
// int main()
// {
//     vector<int> vec({10,32,52,42,62,74,32,42,32,52});
//     vector<int>ans=find(vec,0,32,0,0);
//     for(int i=0;i<ans.size();i++)
//     {
//         cout<<ans[i]<<" ";
//     }
// }

////subsequnce of string

// vector<string> sbsqnce(string str)
// {
//     if(str.size()==0)
//     {
//         vector<string> vec;
//         vec.push_back("");
//         return vec;
//     }
//     char ch=str[0];
//     string rest = str.substr(1);
//     vector<string> recstr = sbsqnce(rest);
//     vector<string> myans;
//     for(int i=0;i<recstr.size();i++)
//     {
//         myans.push_back(ch + recstr[i]);
//     }
//     for(int i=0;i<recstr.size();i++)
//     {
//         myans.push_back(recstr[i]);
//     }
//     return myans;

// }
// int main()
// {
//     string str = "abc";
//     vector<string> ans=sbsqnce(str);
//     for(int i=0;i<ans.size();i++)
//     {
//         cout<<ans[i]<<" ";
//     }
//     return 0;
// }

///floodfill through return-type

vector<string> floodfill(vector<vector<int>> &vec,int i,int j)
{
    if(i==vec.size()-1&&j==vec[0].size()-1)
    {
        vector<string> base;
        base.push_back("");
        return base;
    }
    vector<string> myans({""});
    vec[i][j]=1;
    if(i-1>=0 && vec[i-1][j]==0)
    {
        vector<string> recans=floodfill(vec,i-1,j);
        for(int k=0;k<recans.size();k++)
        {
            myans.push_back("u"+recans[k]);         
        }
    } 
    if(j-1>=0 && vec[i][j-1]==0)
    {
        vector<string> recans=floodfill(vec,i,j-1);
        for(int k=0;k<recans.size();k++)
        {
            myans.push_back("l"+recans[k]);         
        }
    } 
    if(i+1<vec.size() && vec[i+1][j]==0)
    {
        vector<string> recans=floodfill(vec,i+1,j);
        for(int k=0;k<recans.size();k++)
        {
            myans.push_back("d"+recans[k]);         
        }
    } 
    if(j+1<vec[0].size() && vec[i][j+1]==0)
    {
        vector<string> recans=floodfill(vec,i,j+1);
        for(int k=0;k<recans.size();k++)
        {
            myans.push_back("r"+recans[k]);         
        }
    } 
    vec[i][j]=0; 
    return           
}
int main()
{
    vector<vector<int>> vec({{0,0,0},{0,1,0},{0,0,0}});
    vector<string> ans=floodfill(vec,0,0);
    for(int i=0;i<ans.size();i++)
    {
        cout<<ans[i]<<" ";
    }
}

