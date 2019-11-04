package ru.itlab.myprojects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Strawberry extends Actor {
    Texture texture;

    float x, y = 380;
    int speed = 50;
    public Strawberry() {
        texture = new Texture(Gdx.files.internal("badlogic.jpg"));
        x = (float) (Math.random()*640);
    }

    public void render(Batch batch) {
        batch.draw(texture, x, y, 50, 50);
    }

    public void update(float delta){
        y -= speed*delta;
    }

    public void dispose(){
        texture.dispose();
        speed = 0;
        x = 0;
        y = -100;
    }
}
