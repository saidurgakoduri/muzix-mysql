package com.stackroute.muzix.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Document(collection = "Tracks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class Track {
  @Id
    private  int id;
    private String name;
    private String comment;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public String toString() {
    return "Track{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", comment='" + comment + '\'' +
            '}';
  }
}
