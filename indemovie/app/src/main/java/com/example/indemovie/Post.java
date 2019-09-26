package com.example.indemovie;

public class Post {

    private String title;
    private String body;
    private Float star;


    public Post(String title, float star,String body) {

        this.title =title;
        this.star = star;
        this.body = body;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Float getStar() {
        return star;
    }

    public void setStar(Float star) {
        this.star = star;
    }



    public Post() {
        // Default constructor required for calls to DataSnapshot.getValue(FirebasePost.class)
    }




}
