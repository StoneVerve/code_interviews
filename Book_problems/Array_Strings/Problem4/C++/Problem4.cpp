#include <iostream>
#include <string>

using namespace std;

void formatString(char string[], int phraselength){
	int size = 0;
	char* writer = string;
	while(*writer != '\0') {
		writer++;
	}
	writer--;
	char* reader = string + phraselength - 1;
	for(int i=0; i<phraselength; i++) {
		if(*reader == ' '){
			*writer = '0';
			*(writer -1) = '2';
			*(writer-2) = '%';
			writer = writer - 2;
		} else {
			*writer = *reader;
		}
		writer--;
		reader--;
	}		
}

int main(int argc, char* argv[]) {
	if(argc != 3) {
		cout << "Please provide a Phrase and the correct length" << endl;
		return 0;
	}else {
		char* phrase = argv[1];
		int length = atoi(argv[2]);
		formatString(phrase, length);
		cout << phrase << endl;
	}
}

