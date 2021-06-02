#include <iostream>
using namespace std;


bool es_unica(char* palabra) {
	bool letras[26];
	for(int j = 0; j < 25; j++)
		letras[j] = false;
	char letter =  *palabra;
	int alfabe;
	int i = 0;
	while(letter != '\0') {
		alfabe = (int)letter - 97;
		if(alfabe < 0 || alfabe > 25){
			return false;
		} else if (letras[alfabe] == false)
			letras[alfabe] = true;
		else {
			return false;
		}
		i++;
		letter = *(palabra + i);
	}
	return true;
}

int main(int argc, char* argv[]){
	bool letras[26];
	for(int j = 0; j < 25; j++)
		letras[j] = false;
	char* palabra = argv[1];
	bool unica = es_unica(palabra);
	if(unica)
		cout << "Es unica";
	else
		cout << "No es unica";
	return 0;
}


	