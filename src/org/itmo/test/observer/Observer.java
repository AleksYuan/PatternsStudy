package org.itmo.test.observer;

import java.util.List;

public interface Observer {
    void handelEvent(List<String> vacancies);
}
