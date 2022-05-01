package com.ersted_me.basepatterns.behavioral.observer;

import java.util.List;

public interface Observer {
    void sendNotification(List<String> updates);
}
