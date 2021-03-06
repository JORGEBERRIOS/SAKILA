/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Film {
    private Integer film_id;
    private String title;
    private String description;
    private Integer release_year;
    private Integer language_id;
    private Integer original_language_id;
    private Integer rental_duration;
    private Double rental_rate;
    private Integer longitud;
    private Double replacement_cost;
    private String rating;
    private String special_features;
    private Date last_update;
    public Film(Integer film_id,String title,Integer language_id){
        this.film_id = film_id;
        this.title= title;
        this.description = null;
        this.release_year = null;
        this.language_id = language_id;
        this.original_language_id = null;
        this.rental_duration = 3;
        this.rental_rate = 4.99;
        this.longitud = null;
        this.replacement_cost = 19.99;
        this.rating = "G";
        this.special_features = null;
        this.last_update = new Date();
    }

    public Integer getFilm_id() {
        return film_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getRelease_year() {
        return release_year;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public Integer getOriginal_language_id() {
        return original_language_id;
    }

    public Integer getRental_duration() {
        return rental_duration;
    }

    public Double getRental_rate() {
        return rental_rate;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public Double getReplacement_cost() {
        return replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public Date getLast_update() {
        return last_update;
    }
    
    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRelease_year(Integer release_year) {
        this.release_year = release_year;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public void setOriginal_language_id(Integer original_language_id) {
        this.original_language_id = original_language_id;
    }

    public void setRental_duration(Integer rental_duration) {
        this.rental_duration = rental_duration;
    }

    public void setRental_rate(Double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public void setReplacement_cost(Double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "Film1{" + "film_id=" + film_id + ", title=" + title + ", description=" + description + ", release_year=" + release_year + ", language_id=" + language_id + ", original_language_id=" + original_language_id + ", rental_duration=" + rental_duration + ", rental_rate=" + rental_rate + ", longitud=" + longitud + ", replacement_cost=" + replacement_cost + ", rating=" + rating + ", special_features=" + special_features + ", last_update=" + last_update + '}';
    }
    
}
