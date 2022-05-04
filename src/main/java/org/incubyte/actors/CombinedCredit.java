package org.incubyte.actors;

import java.util.List;

public class CombinedCredit {
  List<Credit> cast;
  List<Credit> crew;
  private int id;

  public List<Credit> getCast() {
    return cast;
  }

  public void setCast(List<Credit> cast) {
    this.cast = cast;
  }

  public List<Credit> getCrew() {
    return crew;
  }

  public void setCrew(List<Credit> crew) {
    this.crew = crew;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
