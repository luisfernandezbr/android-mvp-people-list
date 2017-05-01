package br.com.luisfernandezbr.challenge99.pojo;


import java.io.Serializable;

import br.com.luisfernandezbr.challenge99.R;
import br.com.mobiplus.simplerecylerview.annotations.ImageAdapter;
import br.com.mobiplus.simplerecylerview.annotations.LayoutAdapter;
import br.com.mobiplus.simplerecylerview.annotations.TextAdapter;

import static br.com.luisfernandezbr.challenge99.FontConstants.FONT_ROBOTO_LIGHT;

@LayoutAdapter(layoutResId = R.layout.item_techstars_list)
public class TechStar implements Serializable {

    private String id;
    private String name;
    private String image;
    private AppFormattedDate birthday;
    private String bio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @TextAdapter(resId = R.id.textName, typeface = FONT_ROBOTO_LIGHT)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ImageAdapter(resId = R.id.imageProfile)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @TextAdapter(resId = R.id.textBirthday, typeface = FONT_ROBOTO_LIGHT)
    public String getBirthday() {
        return birthday.getContent();
    }

    @TextAdapter(resId = R.id.textBio, typeface = "fonts/roboto-light.ttf")
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TechStar techStar = (TechStar) o;

        return id.equals(techStar.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
