#include <iostream>
using namespace std;

class Contato{
	private:
		string nome;
		string email;
	public:
		Contato(string nome, string email){
			this->nome = nome;
			this->email = email;
		}
		//getter
		string getName(){
			return nome;
		}
		string getEmail(){
			return email;
		}
		//setter
		void setName(string name){
			this->nome = name;
		}
		void setEmail(string email){
			this->email = email;
		}
		

};


class Agenda{
	








int main(){
	Contato luiz("Luiz", "luiz@email.com");

	std::cout << luiz.getName() << endl;
	std::cout << luiz.getEmail() << endl;
	return 0;
}
