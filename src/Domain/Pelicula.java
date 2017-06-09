/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author andres
 */
public class Pelicula {

    private String code;
    private String title;
    private String subTitle;
    private String gender;
    private String total;
    private String premier;

    public Pelicula nextMovie;
    public Pelicula prevMovie;

    public Pelicula(String code, String title, String gender,
            String total, String subTitle, String premier) {

        this.code = code;
        this.title = title;
        this.subTitle = subTitle;
        this.gender = gender;
        this.total = total;
        this.premier = premier;
    }// constructor

    public Pelicula() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPremier() {
        return premier;
    }

    public void setPremier(String premier) {
        this.premier = premier;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "code=" + code + ", title=" + title + ", subTitle="
                + subTitle + ", gender=" + gender + ", total=" + total + ", premier=" + premier + '}';
    }

}// fin de clase
