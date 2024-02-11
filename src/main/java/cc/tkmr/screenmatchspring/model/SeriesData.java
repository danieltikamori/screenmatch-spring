package cc.tkmr.screenmatchspring.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SeriesData(@JsonAlias({"Title", "seriesTitle", "Titulo"}) String title,
                         @JsonAlias("totalSeasons") int totalSeasons,
                         @JsonAlias("imdbRating") String rating) {

}
