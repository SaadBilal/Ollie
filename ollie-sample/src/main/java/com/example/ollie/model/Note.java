package com.example.ollie.model;

import ollie.Model;
import ollie.annotation.Column;
import ollie.annotation.NotNull;
import ollie.annotation.Table;

import java.util.Date;

@Table("Notes")
public class Note extends Model {
	@Column("Title")
	public String title;
	@Column("Body")
	@NotNull
	public String body;
	@Column("Date")
	public Date date;
}