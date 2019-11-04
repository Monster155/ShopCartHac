package ru.itlab.myprojects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class ShopCart extends Actor {

    Texture texture;
    float x;
    int speed = 500;

    public ShopCart() {
        texture = new Texture(Gdx.files.internal("badlogic.jpg"));
        x = 320;
    }

    @Override
    public void act(float delta) {
        if(Gdx.input.isKeyPressed(Input.Keys.D))
            x += speed*delta;
        if(Gdx.input.isKeyPressed(Input.Keys.A))
            x -= speed*delta;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(texture, x, 0, 50, 50);
    }
}
