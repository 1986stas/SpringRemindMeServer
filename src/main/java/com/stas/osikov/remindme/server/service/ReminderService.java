package com.stas.osikov.remindme.server.service;

import com.stas.osikov.remindme.server.entity.Remind;

import java.util.List;

public interface ReminderService {

    List<Remind> getAll();
    Remind getByID(long id);
    Remind save(Remind remind);
    void remove(long id);

}
