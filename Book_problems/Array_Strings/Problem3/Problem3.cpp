#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

bool is_permutation(char word1[], char word2[]) {
	string string2 = word2;
	string string1 = word1;
	if(string1.size() != string2.size())
		return false;
	sort(string2.begin(), string2.end());
	cout << string2;
	for (int i =0; i < string1.length(); i++) {
		if(binary_search(string2.begin(), string2.end(), string1[i])) {
			//string2.erase(string1[i]);
			cout << "Vamos a borra" + string1[i];
		} else
			return false;
	}
	cout << "Si se logro";
	return true;
}

int main(int argc, char* argv[]) {
		if(argc == 3 && is_permutation(argv[1], argv[2])) {
			cout << "Si son";
		} else
			cout << "Not a valid input";
		return 0;
}

