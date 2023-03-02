package com.guner.springbootvalidation.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Person
{
  private Long id;

  @NonNull
  private String firstName;

  @NonNull
  private String lastName;

  @NonNull
  private String email;
}