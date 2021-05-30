#include <iostream>
using namespace std;


void reverse(char* word){
	char* end;
	end = word;
	while(*end != '\0')
		end++;
	char* foward = word;
	char* backwards = end;
	char buffer;
	while (foward != backwards && (foward + 1) != backwards) {
		backwards--;
		buffer = (*foward);
		*foward = *backwards;
		(*backwards) = buffer;
		foward++;
	}
}

int main(int argc, char* argv[]) {
		if(argc == 2) {
				reverse(argv[1]);
				cout << argv[1];
		} else
			cout << "Not a valid input";
		return 0;
}



