package ru.itlab.myprojects;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Array;

public class Strawberries extends Actor {

    Array<Strawberry> strawbs = new Array<>();

    @Override
    public void draw(Batch batch, float parentAlpha) {
        for(Strawberry strawberry : strawbs){
            strawberry.render(batch);
        }
    }

    @Override
    public void act(float delta) {
        for(Strawberry strawberry : strawbs){
            strawberry.update(delta);
        }
    }

    public void add(){
        strawbs.add(new Strawberry());
    }
}
