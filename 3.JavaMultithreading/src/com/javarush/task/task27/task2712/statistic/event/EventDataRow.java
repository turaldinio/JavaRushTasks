package com.javarush.task.task27.task2712.statistic.event;

import java.util.Date;

public interface EventDataRow {//является ли переда об событием

    EventType getType();

    Date getDate();//дата создания записис

    int getTime();//время или продлжительность
}
