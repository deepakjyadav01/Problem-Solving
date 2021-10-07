
// Note that this problem is for testing fast input-output.
// We can use scanf, printf in C langauge, which are quite fast in general :)
#include <bits/stdc++.h> 
#include <math.h>
#include <stdio.h>


using namespace std;

// Usually, you can use scanf/printf in C++.
// However, if you want to use cin/cout, it is usually slow.
// To make it faster. Use cin.tie(NULL) and set ios_base::sync_with_stdio(false)
// See the below code for details.

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	// Read the input n, k
	int n, k,c=0;
 int val;
	cin >> n >> k;
	
	
	if(k<=pow(10.0,7.0)){
	   for(int i=1;i<=n;i++){
	       cin>>val;
	       if(val<=pow(10.0,9.0) && val%k==0){
	           c++;
	       }
	   }
	    cout<<endl<<c;
	}else{
	    cout<<endl<<"greater value";
	}


}