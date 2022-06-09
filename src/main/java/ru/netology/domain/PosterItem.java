package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PosterItem {
    private int id;
    private int posterId;
    private String name;
    private String genre;
    private boolean premiereTomorrow;


}
