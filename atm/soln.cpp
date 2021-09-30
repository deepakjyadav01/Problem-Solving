#include <iostream>
#include <iomanip>
using namespace std;

int main() 
{
int x;
float y,amt;

cin>>x;
cin>>y;


if(x>0 && x<=2000 && y>=0 && y<=2000){
		if(x+0.5<=y && x%5==0){
		cout<<setprecision(2)<<fixed<<(y-x)-0.5;
		}
	
		else{
			cout<<setprecision(2)<<fixed<<y;
		}
	}
	
	else{
		cout<<"invalid amount";
	}
return 0 ;
}
 
