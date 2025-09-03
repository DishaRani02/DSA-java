#include<iostream>
using namespace std;
int main(){
    int n;
cout<<"Enter no. of natural no. = ";
cin>>n;
int sum = 0,val = 1;
while(val<n){
sum = sum + val;
val = val+1;
}
cout<<"Sum = "<<sum;
}
