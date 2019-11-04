package ru.itlab.myprojects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class GameScreen implements Screen {

    ShopCart shopCart;
    Strawberries strawbs;
    float time = 0;
    Stage stage;
    StretchViewport viewport;

    @Override
    public void show() {
        viewport = new StretchViewport(640, 360);
        stage = new Stage(viewport);

        shopCart = new ShopCart();
        stage.addActor(shopCart);

        strawbs = new Strawberries();
        stage.addActor(strawbs);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        time += delta;
        if (time > 2) {
            strawbs.add();
            time = 0;
        }

        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
