Dodanie pracownika:

POST - http://localhost:8080/employee

JSON body:
{
	"firstName" : "",
	"lastName" : "",
	"email" : "",
	"position" : ""
	
}

Zwrócenie listy pracowników:
GET - http://localhost:8080/employee

Zwrócenie listy stanowisk wraz z liczbą pracowników na danym stanowisku:
GET - http://localhost:8080/employee/position

Usunięcie pracownika:
DELETE - http://localhost:8080/employee/{id}

Dane dotyczące bazy danych znajdują się w pliku db.properties
