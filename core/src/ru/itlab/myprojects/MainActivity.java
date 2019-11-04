package ru.itlab.myprojects;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class MainActivity extends Game {

    GameScreen gs;

    @Override
    public void create() {
        gs = new GameScreen();
        setScreen(gs);
    }

    @Override
    public void render() {
        super.render();
    }
}
