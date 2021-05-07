package com.example.apiswaggerapp;

import com.example.apiswaggerapp.controller.QuestionController;
import com.example.apiswaggerapp.entity.Question;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class Starter {

    private QuestionController questionController;

    public Starter(QuestionController questionController) {
        this.questionController = questionController;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        Question question1 = new Question("Domyślny port na jakim jest uruchamiany Spring Boot to", "8080", "9090", "Localhost", "zależne od komputera", "8080");
        Question question2 = new Question("Klasa w Spring, która wystawia interfejs REST powinna mieć adnotacje", "@Service", "@RestController", "@Controller", "@Repository", "@RestController");
        Question question3 = new Question("Najlepszą praktyką wstrzykiwania zależności jest realizowanie tego poprzez", "Konstruktor", "Pole", "Metode", "Klase", "Konstruktor");
        Question question4 = new Question("Czym jest Bean", "Klasa napisana w języku Java", "Obiekt zarządzany przez kontekst Springa", "Instancją klasy", "Mechaniką Springa pozwalającą na wstrzykiwanie zależności", "Obiekt zarządzany przez kontekst Springa");
        Question question5 = new Question("Domyślnym formatem danych zwracanym przez metody webowe jest", "JSON", "Text", "XML", "NULL", "JSON");
        Question question6 = new Question("Przekazywanie całego obiektu (np. Person) do API powinno być przekazywane poprzez", "@RequestParam", "@RequestBody", "@RequestObject", "@PathVariable", "@RequestBody");
        Question question7 = new Question("Adnotacja @Service służy do tworzenia beanów, których przeznaczeniem jest", "Świadczenie usług", "Dostęp do danych", "Kontrolowanie dostępu", "Żadne z wymienionych", "Świadczenie usług");
        Question question8 = new Question("Jaka jest prawidłowa konwencja wczytywania danych z pliku konfiguracyjnego?", "@Value(“${klucz}”)", "@Value(“#{klucz}”)", "@Autowired", "@Autowired(“#{klucz}”)", "@Value(“${klucz}”)");
        Question question9 = new Question("Spring Security – użytkownikowi możemy przypisywać:", "jedną rolę", "nieograniczoną ilość ról", "hasło", "wszystkie odpowiedzi są prawidłowe", "wszystkie odpowiedzi są prawidłowe");
        Question question10 = new Question("UserDetailsService:", "Pozwala na dostarczenie użytkownika na podstawie “username”", "Zwraca UserDetails", "Odpowiada za przechowywanie informacji o użytkownikach", "Na nic nie pozwala to interfejs", "Na nic nie pozwala to interfejs");
        Question question11 = new Question("Jakiej metody nie posiada interfejs UserDetails?", "getAuthorities()", "getCredentials()", "getPassword()", "UserDetails to klasa a nie interfejs", "getCredentials()");
        Question question12 = new Question("Encja JPA nie musi mieć:", "konstruktora bezparametrowego", "konstruktora ze wszystkimi parametrami", "adnotacji @Entity", "pola dla id", "konstruktora ze wszystkimi parametrami");
        Question question13 = new Question("Klasa umożliwiająca połączenie się z REST API w celu pobrania danych to", "RestTemplate", "RestTemplateClient", "GetMapping", "JSONObject", "RestTemplate");
        Question question14 = new Question("Metoda HTTP służąca do aktualizowania stanu obiektu to", "PUT", "POST", "GET", "UPDATE", "PUT");
        Question question15 = new Question("Który zakres (Scope) nie istnieje w Spring?", "websocket", "application", "prototype", "single", "single");
        Question question16 = new Question("Cechami Spring Boota są:", "convention-over-configuration", "configuration-over-convention", "auto profiler", "wszystkie odpowiedzi są prawidłowe", "convention-over-configuration");
        Question question17 = new Question("Co to jest profil aplikacji?", "Umożliwia konfiguracje beanów", "Pozwala na segergacje częsci konifuracji i udostępnienie jej tylko w określonych środowiskach", "Umożliwia na tworzenie paczki jar", "Pozwala na profilowanie serwera i JVM", "Pozwala na segergacje częsci konifuracji i udostępnienie jej tylko w określonych środowiskach");
        Question question18 = new Question("Jaki jest domyślny plik wynikowy aplikacji napisanej w Spring Boot?", "jar", "war", "ear", "exe", "jar");
        Question question19 = new Question("Na czym polega Inversion of control?", "Polega na przeniesieniu sterowania programem do odpowiedzialności framework", "Polega na tworzeniu kodu na podstawie gotowych funkcjonalności", "Polega na wstrzykiwaniu zależności np. poprzez konstruktor, metodę czy pole", "Jest to mechanizm pozwalający na zarządzanie konfiguracją projektu", "Polega na przeniesieniu sterowania programem do odpowiedzialności framework");
        Question question20 = new Question("Czym jest JdbcTemplate?", "Klasa, która odpowiada za połączenie z bazą danych", "Dostarcza interfejs umożliwiający dokonywania operacji na bazie danych", "Dostarcza sterownik bazy danych", "Dostarcza szablon konfiguracyjny", "Dostarcza interfejs umożliwiający dokonywania operacji na bazie danych");
        Question question21 = new Question("Czym jest ResultSet", "Zwraca reprezentacje danych pobranych z tabeli", "Interfejs do zamiany obiektów z bazy danych do Listy", "Umożliwia zapisywanie danych do bazy danych", "Umożliwi zamianę obiektu pobranego z bazy danych na inny", "Zwraca reprezentacje danych pobranych z tabeli");
        Question question22 = new Question("Hibernate to:", "Framework do realizacji warstwy dostępu do danych", "Zbiór interfejsów zawierająca standardy mapowania obiektowo-relacyjnego", "Specyfikacja określająca sposób dostępu do danych", "Klaster", "Framework do realizacji warstwy dostępu do danych");
        Question question23 = new Question("Które strategie zarządzania schematem bazy danych są prawidłowe:", "create", "create-drop", "update", "wszystkie podane", "wszystkie podane");
        Question question24 = new Question("Jak działa strategia generowania kluczy GenerationType.SEQUENCE?", "Inkrementuje id o 1", "Inkrementuje id zgodnie ze wskazaną sekwencją", "Nie inkrementuje id", "Sam dobiera strategie generowania id", "Inkrementuje id zgodnie ze wskazaną sekwencją");
        Question question25 = new Question("Jak zmienić nazwę tabeli tworzonej w bazie danych z wykorzystaniem Hibernate?", "Poprzez parametryzowanie adnotacji @Column", "Poprzez parametryzowanie adnotacji @Table", "Poprzez parametryzowanie adnotacji @Tabele", "W pliku application.properties", "Poprzez parametryzowanie adnotacji @Table");
        questionController.saveQuestion(question1);
        questionController.saveQuestion(question2);
        questionController.saveQuestion(question3);
        questionController.saveQuestion(question4);
        questionController.saveQuestion(question5);
        questionController.saveQuestion(question6);
        questionController.saveQuestion(question7);
        questionController.saveQuestion(question8);
        questionController.saveQuestion(question9);
        questionController.saveQuestion(question10);
        questionController.saveQuestion(question11);
        questionController.saveQuestion(question12);
        questionController.saveQuestion(question13);
        questionController.saveQuestion(question14);
        questionController.saveQuestion(question15);
        questionController.saveQuestion(question16);
        questionController.saveQuestion(question17);
        questionController.saveQuestion(question18);
        questionController.saveQuestion(question19);
        questionController.saveQuestion(question20);
        questionController.saveQuestion(question21);
        questionController.saveQuestion(question22);
        questionController.saveQuestion(question23);
        questionController.saveQuestion(question24);
        questionController.saveQuestion(question25);
    }
}
