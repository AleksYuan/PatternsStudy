package org.itmo.test.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();
        site.addVacancies("Junior java");
        site.addVacancies("Senior java");

        Observer obs1 = new Subscriber("Ivanov Vasya");
        Observer obs2 = new Subscriber("Petrov Vasya");

        site.addObserver(obs1);
        site.addObserver(obs2);

        site.addVacancies("QA Engineer");
        site.removeVacancy("Senior java");
    }
}
