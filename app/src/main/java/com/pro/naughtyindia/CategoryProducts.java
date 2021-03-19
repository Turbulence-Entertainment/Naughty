package com.pro.naughtyindia;

public class CategoryProducts  {

    String image_url,image_url1,image_url2;
    String name;
    String desc;
    String trailer_link,video_link;

    public CategoryProducts(String image_url, String name, String desc, String image_url1, String image_url2, String trailer_link,String video_link) {
        this.image_url = image_url;
        this.name = name;
        this.desc=desc;
        this.image_url1=image_url1;
        this.image_url2=image_url2;
        this.trailer_link=trailer_link;
        this.video_link=video_link;
    }


    public String getImage_url1() {
        return image_url1;
    }

    public void setImage_url1(String image_url1) {
        this.image_url1 = image_url1;
    }

    public String getImage_url2() {
        return image_url2;
    }

    public void setImage_url2(String image_url2) {
        this.image_url2 = image_url2;
    }

    public String getTrailer_link() {
        return trailer_link;
    }

    public void setTrailer_link(String trailer_link) {
        this.trailer_link = trailer_link;
    }

    public String getVideo_link() {
        return video_link;
    }

    public void setVideo_link(String video_link) {
        this.video_link = video_link;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
